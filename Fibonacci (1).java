import java.util.*;

public class Fibonacci {

    public static void main(String args[]) {
        System.out.print("Enter N: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(fib(n));
    }
        }
public static int (n){
if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    }
}
