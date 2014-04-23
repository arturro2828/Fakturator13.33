
package Source;

public class Firma {

    private String nazwaFirmy;
    private String nrFaktury;
    private String adresFirmy;
    private int kodPocztowy;
    private String adresDostawy;
    private int kodPocztowyDostawa;
    
    // <editor-fold defaultstate="collapsed" desc="Gettery">
    
    public String getNazwaFirmy() {
        return nazwaFirmy;
    }
    
    public String getnrFaktury() {
        return nrFaktury;
    }
    
    public String getadresFirmy() {
        return adresFirmy;
    }
    
    public int getkodPocztowy() {
        return kodPocztowy;
    }
    
    public String getadresDostawy() {
        return adresDostawy;
    }
    
    public int getkodPocztowyDostawa() {
        return kodPocztowyDostawa;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Settery">
    
    
    
    
    // </editor-fold>
    

    
    public Firma nowaFirma(){
        Firma klient = new Firma();
        
        return klient;
    }
}
