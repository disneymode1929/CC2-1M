import java.util.*;

public class Fibonacci(2){
public static void main(String[] args) {
        Scanner fibo = new Scanner(System.in);
        System.out.println("Enter a Term: ");
        int term = fibo.nextInt();
        System.out.println("The Value of " +term+ " in Fibonacci is " + J(term));

    }
    public static int J(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return J(n - 1) + J(n - 2);
        }
    }
}
