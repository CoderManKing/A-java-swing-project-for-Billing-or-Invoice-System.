
package entity;

/**
 *
 * @author muham
 */
public class User {
    private int id;
    private String name;
    private String mail;
    private String password;
    private String company_name;
    private String city;
    private int company_no;
    
    public User() {
    }

    public User(int id, String name, String mail, String password, String company_name, String city, int company_no) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.company_name = company_name;
        this.city = city;
        this.company_no = company_no;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCompany_no() {
        return company_no;
    }

    public void setCompany_no(int company_no) {
        this.company_no = company_no;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", mail=" + mail + ", password=" + password + ", company_name=" + company_name + ", city=" + city + ", company_no=" + company_no + '}';
    }
    
}
