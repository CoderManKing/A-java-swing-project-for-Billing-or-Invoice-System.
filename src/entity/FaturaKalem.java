
package entity;

/**
 *
 * @author muham
 */
public class FaturaKalem{
    private int kalem_id;
    private int fatura_id;
    private int urun_id;
    private int miktar;
    private double tutar;

    public FaturaKalem() {
    }

    public FaturaKalem(int kalem_id, int fatura_id, int urun_id, int miktar, double tutar) {
        this.kalem_id = kalem_id;
        this.fatura_id = fatura_id;
        this.urun_id = urun_id;
        this.miktar = miktar;
        this.tutar = tutar;
    }

    public int getKalem_id() {
        return kalem_id;
    }

    public void setKalem_id(int kalem_id) {
        this.kalem_id = kalem_id;
    }

    public int getFatura_id() {
        return fatura_id;
    }

    public void setFatura_id(int fatura_id) {
        this.fatura_id = fatura_id;
    }

    public int getUrun_id() {
        return urun_id;
    }

    public void setUrun_id(int urun_id) {
        this.urun_id = urun_id;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    @Override
    public String toString() {
        return "FaturaKalem{" + "kalem_id=" + kalem_id + ", fatura_id=" + fatura_id + ", urun_id=" + urun_id + ", miktar=" + miktar + ", tutar=" + tutar + '}';
    }
        
}
