package sourceCode;
import windows.FakFrame;

public class Main {

    
    public static void main(String[] args) {
        
        Batabase database = new Batabase();
       database.connect();
        
        FakFrame frame = new FakFrame();
        frame.setVisible(true);
        
    }
    
}
