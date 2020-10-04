import java.io.InputStream;
import java.util.Scanner;

 public class repeat
{
    private static Scanner scanner = new Scanner(System.in);

   public static void main (String [] args) 
   {
      
      System.out.print ("Enter some text: ");

    String input = scanner.nextLine();

    System.out.println( "input = " + input); 
   }
}
