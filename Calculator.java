import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter experssion:");
        String input = sc.next();
        System.out.println("Input = " + input);

        int res = 0;
        int inputLength = input.length();
        System.out.println("res = " + res + "; inputLength = " + inputLength);
        for (int ctr = 0; ctr < input.length(); ctr++) {
            char c = input.charAt(ctr);
            int num = 0;
            boolean odd = ctr % 2 != 0;
            boolean wOperator = false;
            char operator = '!';
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    if (!odd) {
                        num = Integer.parseInt(c + "");
                        System.out.println("Num = +num");
                        if (ctr == 0) {
                            res = num;
                        }
                        if (wOperator) {
                            if (operator == '+') {
                                res = res + num;
                                System.out.println("Adding");

                            } else if (operator == '-') {
                                res = res - num;
                            } else if (operator == '*') {
                                res = res * num;
                            } else if (operator == '/') {
                                res = res / num;
                                wOperator = false;
                            }
                        } else {
                            System.out.println("Invalid input!");
                        }
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    if (odd) {
                        operator = c;
                        wOperator = true;
                        System.out.println("Operator = " + operator);
                    } else {
                        System.out.println("Invalid input!");
                    }
                    break;
                default:
                    System.out.println("Invalid statement");

            }
        }
        System.out.println("Result: " + res);
    }
}
