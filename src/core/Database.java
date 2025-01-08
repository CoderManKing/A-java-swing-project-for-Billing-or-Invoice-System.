package core;

//Bu sınıf, veritabanı ile bir bağlantı açar ve işlemleri gerçekleştirmek için kullanılır.
import java.sql.Connection; 
//Veritabanı bağlantıları için bir sınıftır. getConnection metodu ile veritabanına bağlanmamızı sağlar.
import java.sql.DriverManager;
//Veritabanı işlemleri sırasında oluşabilecek istisnaları (exceptions) yönetmek için kullanılır
import java.sql.SQLException;

/**
 * @author muham
 */
public class Database { //public sayesinde diğer paketlerden rahatça erişilir
   /* bu proje singleton design pattern tarzında database bağlantısı içerir.
    */ 
    
    private static Database instance = null; //static'tir tüm program bunu kullanır.
    private Connection connection = null; // başlangıçta bağlantı yoktur. Daha sonra doldurulur
    private final String DB_URL = "jdbc:mysql://localhost:3306/muhasebe";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "1234root";        
    
    
    /* Bu private constructor sadece sınıf içinde çağrılabilir. Bu, Singleton tasarım
    deseni gereği, sınıfın dışından yeni bir örnek oluşturulmasını engeller.
    */
    private Database(){
        try {
            //Veritabanına bağlanmayı dener. Bağlantı başarılır olursa connection değişkenine atar.
            this.connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private Connection getConnection() {
        return connection;
    }

    /*
    public: Bu metod, diğer sınıflar tarafından çağrılabilir.
    static: Sınıfın bir örneği olmadan çağrılabilir.
    */
    public static Connection getInstance(){
        try{
  /* Eğer instance daha önce oluşturulmamışsa (null ise) veya mevcut
    bağlantı (connection) kapalıysa, yeni bir Database örneği oluşturulur */            
            if(instance == null || instance.getConnection().isClosed()){
                instance = new Database(); // private constructor'a ulaştığımız yer.
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        //Mevcut bağlantıyı döndürür. Bu, diğer sınıfların bağlantıyı kullanmasını sağlar.
        return instance.getConnection();
    }
}

/*
Genel İşleyiş:
1.) getInstance() metodu çağrıldığında:
        -Eğer daha önce bir Database örneği oluşturulmadıysa veya mevcut bağlantı kapalıysa:
            -Yeni bir Database örneği oluşturulur.
        -Mevcut bağlantı döndürülür.
2.) Bu sayede:
        -Tek bir Database örneği oluşturulur (Singleton).
        -Tüm program, aynı veritabanı bağlantısını kullanır.
*/
