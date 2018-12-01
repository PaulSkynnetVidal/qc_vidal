import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    if (args.length > 1 && !args[0].equals("-p")) {
    return ;
    }

    String nickname = args[1];
    Scanner chatInput = new Scanner(System.in);
    String sentence = chatInput.nextLine();
    DateFormat dateFormat = new SimpleDateFormat("'le' dd MMMM 'et il est' hh:mm");
    Date currentdate = new Date();

      while (!sentence.equals("++")) {

        sentence = chatInput.nextLine();
        System.out.println(nickname +" : " + sentence);
        WhatTimeIsIt(sentence);
        SayHello(sentence,nickname);
        ParsingArobase(sentence);
      }
  }


  public static void WhatTimeIsIt(String sentence){
    DateFormat dateFormat = new SimpleDateFormat("'le' dd MMMM 'et il est' hh:mm");
    Date currentdate = new Date();
    if (sentence.equals("@time"))
    {
      System.out.println("[time] :Nous sommes " + dateFormat.format(currentdate));
    }
    else
      return ;
  }

  public static void SayHello(String sentence, String nickname){
    if (sentence.equals("@hello")){
      System.out.println("[hello] : Salut "+ nickname);
    }
    else
      return;
  }

  public static void ParsingArobase(String sentence){
    String separator = "@";
    StringTokenizer st = new StringTokenizer( sentence, separator, true );

    while ( st.hasMoreTokens() ) {
      String token = st.nextToken();
      if (token.length() == 1 && separator.indexOf(token.charAt(0)) >= 0) {
        {
          if(!token.equals("hello")|| !token.equals("time")){
            System.out.println("[system] Je ne connais pas le chatbot @foo!");
          }
        }
      }

    }
  }
}
