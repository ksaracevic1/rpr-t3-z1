package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;

public class Imenik {
    String ime;
    TelefonskiBroj broj;
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
    } /*
    public String dajIme (TelefonskiBroj broj){


    }

    String naSlovo(char s)​​{

    }

    Set<String> izGrada(FiksniBroj.Grad g)​​ {

    }

    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g)​​ {


    } */

}
