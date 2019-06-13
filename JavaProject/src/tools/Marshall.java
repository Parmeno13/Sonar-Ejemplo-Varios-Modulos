package tools;
import java.io.*

public class Marshall {
  Process theProcess = null;
    BufferedReader inStream = null;
 
        
      try
      {
          theProcess = Runtime.getRuntime().exec("calc.exe");
      }
      catch(IOException e)
      {
         System.err.println("Error en el método exec()");
         e.printStackTrace();  
      }
    
}
