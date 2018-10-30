package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {

    HashMap<String, TelefonskiBroj> hm;
    Imenik () {
        hm=new HashMap<String, TelefonskiBroj>();
    }
    public void dodaj (String ime, TelefonskiBroj broj){
        hm.put(ime, broj);
    }
    public String dajBroj  (String ime) {
        TelefonskiBroj  t = hm.get(ime);
        return t.ispisi();
    }
    public String dajIme (TelefonskiBroj broj){
        for (String o : hm.keySet()) {
            if (hm.get(o).equals(broj)) {
                return o;
            }
        }
        return null;
    }



String naSlovo (char s) {
    int i=1;
    String spisak = "";
    for (String o : hm.keySet()) {
        if (o.charAt(0) == s) {
            spisak+= Integer.toString(i) + ". " +  o + " - " + hm.get(o).ispisi()+ "\n";
            i++;
        }
    }
    return spisak.toString();
}

Set<String> izGrada (Grad g) {
    Set<String> s =  new TreeSet<String>();
    for (String o : hm.keySet()) {
        if (hm.get(o) instanceof FiksniBroj) {
            if (((FiksniBroj) hm.get(o)).grad == g)
                s.add(o);
        }

    }
    return s;
}

Set<TelefonskiBroj> izGradaBrojevi (Grad g) {
    Set<TelefonskiBroj> s =  new TreeSet<TelefonskiBroj>();
    for (String o : hm.keySet()) {
        if (hm.get(o) instanceof FiksniBroj) {
            if (((FiksniBroj) hm.get(o)).grad == g)
                s.add(hm.get(o));
        }

    }
    return s;
}


 }
