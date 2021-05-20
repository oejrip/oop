public class Mängija {
    private int elujõud;
    private int täisElujõud;
    private int lisaPunktid;
    private int rünnak;
    private int bakaLäbitavus;
    private String nimi;

    public Mängija(int elujõud, int täisElujõud, int lisaPunktid, int rünnak, int bakaLäbitavus, String nimi) {
        this.elujõud = elujõud;
        this.täisElujõud = täisElujõud;
        this.lisaPunktid = lisaPunktid;
        this.rünnak = rünnak;
        this.bakaLäbitavus = bakaLäbitavus;
        this.nimi = nimi;
    }

    public int getElujõud() {
        return elujõud;
    }

    public int getTäisElujõud() {
        return täisElujõud;
    }

    public int getLisaPunktid() {
        return lisaPunktid;
    }

    public int getRünnak() {
        return (int) (Math.random() * rünnak);
    }

    public int getBakaLäbitavus() {
        return bakaLäbitavus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setElujõud(int elujõud) {
        this.elujõud = elujõud;
    }

    public void setLisaPunktid(int lisaPunktid) {
        this.lisaPunktid = lisaPunktid;
    }

    public void setBakaLäbitavus(int bakaLäbitavus) {
        this.bakaLäbitavus = bakaLäbitavus;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public boolean onElus() {
        if (elujõud > 0) {
            return true;
        }
        return false;
    }

    public void tervene() {
        if (lisaPunktid > 0) {
            lisaPunktid--;
            elujõud = täisElujõud;
        }
    }

    public void üleminek() {
        bakaLäbitavus++;
    }

    public void lisaPunktid() {
        lisaPunktid++;
    }

}