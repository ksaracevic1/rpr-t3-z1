package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    Grad grad;
    String broj;
    FiksniBroj (Grad grad, String broj){ this.grad=grad; this.broj=broj;}

    public String ispisi(){
        String[] niz = {"030","031", "032", "033", "034", "035","036", "037", "038", "039"  };
        String pomocni="";
        for (int i=0; i<11; i++)
            if (grad==Grad.values()[i])
                pomocni=niz[i];
        pomocni+= "/" + broj;
        return pomocni.toString();
    }
    public int hashCode() {

        return 1;
    }


}






