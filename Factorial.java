import java.io.*;

public class Factorial{  
    public static void main(String args[])throws IOException{  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter a number: ");
    int number = Integer.parseInt(br.readLine());	
    int i,fact=1;  	   
    for(i=1;i<=number;i++){    
      fact=fact*i;    
      
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}