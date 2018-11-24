import java.util.Scanner;
public class StudentInfo {

    
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your name:");
	String name = sc.nextLine();
	
	System.out.println("Enter Your Age:");
	int age = sc.nextInt();

	System.out.println("Enter Your Gender: (M/F)");
	char sex = sc.next().charAt(0);

	System.out.println("Enter the value of Pi:");
	double pi = sc.nextDouble();

	System.out.println("Your name is "+ name);
	System.out.println("You're "+age+" years old");
	System.out.println("Your gender is "+sex);
	System.out.println("The value of pi that you entered is "+pi);
	
	}
}
