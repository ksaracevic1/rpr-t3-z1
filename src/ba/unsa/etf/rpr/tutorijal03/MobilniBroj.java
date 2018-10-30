package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj {
    int mobilnaMreza; 
    String broj; 
    
    MobilniBroj(int mobilnaMreza, String broj){
       
    }
    public String ispisi(){
        return "0" + Integer.toString(mobilnaMreza) + broj;
    }
}
