package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    int mobilnaMreza; 
    String broj; 
    
    MobilniBroj(int mobilnaMreza, String broj){
       this.mobilnaMreza = mobilnaMreza;
       this.broj = broj;
    }
    public String ispisi(){
        return  "0"+ Integer.toString(mobilnaMreza) + "/"+ broj;
    }
    public   int hashCode () { return 1; }

}
