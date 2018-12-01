import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) {
    String nickname;
    String sentence;

    if (args.length > 1 && !args[0].equals("-p")) {
    return ;
    }
    nickname = args[1];
    Scanner chatInput = new Scanner(System.in);


    DateFormat dateFormat = new SimpleDateFormat("'le' dd MMMM 'et il est' hh:mm");
    Date currentdate = new Date();


    sentence = chatInput.nextLine();
      while (!sentence.equals("++")) {

        sentence = chatInput.nextLine();
        System.out.println(nickname +" : " + sentence);
        if (sentence.equals("@hello")) {
          System.out.println("Salut "+ nickname +  ", nous sommes " + dateFormat.format(currentdate));
        }
      }
    }
}
