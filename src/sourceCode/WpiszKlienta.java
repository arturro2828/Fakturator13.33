package sourceCode;



public class WpiszKlienta implements Interfejs {
    
    Faktura nowaFaktura = new Faktura();
    
    @Override
    public String zapiszWPlik() {
        
        return (nowaFaktura.getnrFaktury());
    }

}
