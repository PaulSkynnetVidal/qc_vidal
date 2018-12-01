import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) {
    String name;

   /* if (args.length > 1 && args[0].equals("-p")) {
      name = args[1];*/
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string");
      name = in.nextLine();
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
      while (true) {
        if (name == "hello") {
          System.out.println("Salut, nous sommes le" + dateFormat.format(date));
        }
      }
    }
  
}
