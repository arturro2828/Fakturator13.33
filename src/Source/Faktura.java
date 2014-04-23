package Source;

public class Faktura {

    protected String nrFaktury;           //nazwa firmy, imie/nazwisko beda u dzieci, 
    protected String adres;               //te sa wspolne dla wszystkich klas dziedziczacych
    protected int kodPocztowy;
    protected String adresDostawy;
    protected int kodPocztowyDostawa;

    // <editor-fold defaultstate="collapsed" desc="Gettery">

    public String getnrFaktury() {
        return nrFaktury;
    }

    public String getAdres() {
        return adres;
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

}
