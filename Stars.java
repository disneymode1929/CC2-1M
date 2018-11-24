import java.util.Scanner;


public class Stars {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Input the legth of the Stars: ");
       int n = input.nextInt();
        for (int row = 1; row <= n; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }
 
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        for (int row = n; row >= 1; --row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }
 
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        int midRow = (n);
        int row = 0;
        for (int i = midRow; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            System.out.println();

            row++;
        }

        for (int i = 0; i <= midRow; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = row; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();

            row--;
        }
    }
    
}