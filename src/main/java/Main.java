import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) {
    //String nickname;
    String sentence;

    /*if (args.length > 1 && args[0].equals("-p")) {
      nickname = args[1];
    }*/
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string");

      DateFormat dateFormat = new SimpleDateFormat("'le' dd MMMM 'et il est' hh:mm");
      Date date = new Date();
      while (true) {
        sentence = in.nextLine();
        if (sentence.equals("hello")) {
          System.out.println("Salut"+/* nickname*/  ", nous sommes " + dateFormat.format(date));
        }
      }
    }
}
