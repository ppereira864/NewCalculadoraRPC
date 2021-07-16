package calculadorarpc;
import org.apache.xmlrpc.*;

/**
 *
 * @author papg864
 */

public class JavaServer { 

   public Double sum(double x, double y){
      return new Double(x+y);
   }
   
   public Double rest(double x, double y){
      return new Double(x-y);
   }
   
   public Double mul(double x, double y){
      return new Double(x*y);
   }
   
   public Double div(double x, double y){
      return new Double(x/y);
   }

   public static void main (String [] args){
   
      try {

         System.out.println("Intentando Iniciar XML-RPC Servidor...");
         
         WebServer server = new WebServer(1024);
         server.addHandler("sample", new JavaServer());
         server.start();
         
         System.out.println("Se Inicio Correctamente.");
         System.out.println("Aceptar Solicitudes. (Halt program to stop.)");
         
      } catch (Exception exception){
         System.err.println("JavaServer: " + exception);
      }
   }
}
