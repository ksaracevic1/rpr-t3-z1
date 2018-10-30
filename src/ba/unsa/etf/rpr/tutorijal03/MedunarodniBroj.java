package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String broj;
    private String drzava;
    MedunarodniBroj (String drzava, String broj) {
        this.broj = broj ;
        this.drzava = drzava;
    }
    public   int hashCode () { return 1; }
    public  String ispisi() { return drzava+broj; }
}
