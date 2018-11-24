
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MorseCode {
public static Scanner sc;
public static void main(String args[]) throws IOException, java.io.IOException  
{
    int option = 0;
    String sentence = "",answer = "",answer1 = "";
     char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
             'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
             'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
             ',', '.', '?' };  

     String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };    
    sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(">>>>Welcome to MorseCode Software<<<<");
    System.out.println("");
    do
    {
    System.out.println("-->Enter the Option Corresponding to the Task you want to Perform ");
    System.out.println("->1.Generate Morse Code<- OR ->2.Generate English Language<- OR ->3.Exit ");
    System.out.print("->");
    while(!sc.hasNextInt()) 
    {
        System.out.println("");
        System.err.println("-->ERROR<-->Enter Digits Only<--");
        System.out.print("->");
        sc.next();  
    }
    option = sc.nextInt();
    switch(option)
    {
    case 1:
    {
        System.out.println("");
        System.out.println("-->Enter the Sentence that you want to Transmit Using the Morse Code ");
        System.out.print("->");
        sentence = br.readLine();
        System.out.println("");
        sentence = sentence.toLowerCase(); 
        char[] morsec = sentence.toCharArray();
        for(int i = 0; i < morsec.length;i++)  
        {
            for(int j = 0;j<english.length;j++)   
            {
                if(english[j] == morsec[i]) 
                { 
                    answer = answer + morse[j] + " ";  
                }  
            }
        }
        System.out.println("-->The Morse Code Translation is:- ");
        System.out.print(">> ");
        System.out.println(answer);
        System.out.println("");
        break;
    }
    case 2:
    {
        System.out.println("");
        System.out.println("-->Enter the Morse Code and After Every Letter add Space in Between ");
        System.out.print("-> ");
        sentence = br.readLine();
        System.out.println("");
        String[] morsec = sentence.split(" ");   
        for(int i = 0;i < morsec.length;i++)
        { 
            for(int j = 0;j < morse.length;j++)
            {
                if(morse[j].equals(morsec[i]))  
                {
                    answer1 = answer1 + english[j];  
                }
            }
        }
        System.out.println("-->The English Language Translation is:- ");
        System.out.print(">> ");
        System.out.println(answer1);
        System.out.println("");
        break;
    }
    case 3:
    {
        System.out.println("");
        System.out.println(">>Thank you For Using this Service<<");
        System.out.println("");
        break;
    }
    default:
    {
        System.err.println("-->ERROR<-->Invalid Option Entered<--");
        System.out.println("");
        break;
    }
    }
    }
    while(option!=3);
    }
}