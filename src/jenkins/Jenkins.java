/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins;
/**
 *
 * @author jorosa1718daw2
 */
import java.io.*;
public class Jenkins {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File f = new File("index.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Treballant amb l'IC Jenkins");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write(" 2a Modificacio del projecte jenkins");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Projecte per provar l'IC Jenkins");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.write("    Modificacio del projecte jenkins");bw.newLine();
            
            bw.close();
        }
    }
}
