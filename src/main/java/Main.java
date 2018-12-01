import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

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
        if (sentence.equals("@time")) {
          System.out.println("Nous sommes " + dateFormat.format(currentdate));
        }
        else if (sentence.equals("@hello")) {
          System.out.println("Salut "+ nickname);
        }
        else if (sentence.equals("@"))
        {
          System.out.println("");
        }
        //ParsingArobase(sentence);
      }
  }


  public void WhatTimeIsIt(String sentence){
    DateFormat dateFormat = new SimpleDateFormat("'le' dd MMMM 'et il est' hh:mm");
    Date currentdate = new Date();
    if (sentence.equals("@time"))
    {
      System.out.println("Nous sommes " + dateFormat.format(currentdate));
    }
    else
      return ;
  }

  public String SayHello(String sentence){
    if (sentence.equals("@hello")){
      System.out.println("Salut "+ nickname);
    }
  }

  public String ParsingArobase(String sentence){
    char Separator = '@';
    

  }
}
