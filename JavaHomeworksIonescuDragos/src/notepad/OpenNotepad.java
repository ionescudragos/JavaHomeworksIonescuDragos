/*

 */
package notepad;

import java.io.IOException;

/**
 *
 * @author Dragos
 */
public class OpenNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("notepad");
      rs.exec("calc");

    }
    catch (IOException e) {
      System.out.println(e);
    }   
    }
    
}
