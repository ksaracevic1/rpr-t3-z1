package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj implements Comparable {
    public Grad grad;

    public abstract String ispisi();

    public abstract int hashCode();

    public int compareTo(Object o) {
        TelefonskiBroj drugiLik = (TelefonskiBroj) o;
        return ispisi().compareTo(drugiLik.ispisi());
    }
}