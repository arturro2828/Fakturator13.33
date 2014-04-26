package sourceCode;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import windows.FakFrame;

public class Main {

    
    public static void main(String[] args) {
        
        
        WpiszKlienta klient1 = new WpiszKlienta();
        FakFrame frame = new FakFrame();
        frame.setVisible(true);
        Writer writer = null;

try {
    writer = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream("filename.txt"), "utf-8"));
    writer.write(klient1.zapiszWPlik());
} catch (IOException ex) {
  // report
} finally {
   try {writer.close();} catch (Exception ex) {}
}
    }
    
}
