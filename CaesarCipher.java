import java.util.Scanner;

public class CaesarCipher {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int shift, i, n, ans;
        String str;
        String str1 = "";
        System.out.println("Enter The String To be Encrypted:");
        str = sc.nextLine();
        str = str.toLowerCase();
        n = str.length();
        char ch1[] = str.toCharArray();
        char ch3;
        System.out.println("Enter A Numeric Key:");
        shift = sc.nextInt();

        System.out.println();
        System.out.print("Encrypted text is:");
        for (i = 0; i < n; i++) {
            if (Character.isLetter(ch1[i])) {
                ch3 = (char) (((int) ch1[i] + shift - 97) % 26 + 97);
                str1 = str1 + ch3;
            }
        }
        System.out.println(str1);

        System.out.println("Encrypt Again? \n"
                + "[1] Yes \n"
                + "[2] No");
        ans = sc.nextInt();
        if (ans == 2) {
            System.exit(0);
        }
        while (ans == 1) {
            Scanner sca = new Scanner(System.in);
            String strl1 = "";
            System.out.println("Enter The String To be Encrypted:");
            str1 = sca.nextLine();
            str1 = str1.toLowerCase();
            n = str1.length();
            System.out.println("Enter A Nemeric Key:");
            shift = sca.nextInt();

            System.out.println();
            System.out.print("Encrypted text is:");
            for (i = 0; i < n; i++) {
                if (Character.isLetter(ch1[i])) {
                    ch3 = (char) (((int) ch1[i] + shift - 97) % 26 + 97);
                    strl1 = strl1 + ch3;
                }
            }
            System.out.println(strl1);
            System.out.println("Encrypt Again? \n"
                    + "[1] Yes \n"
                    + "[2] No");
            ans = sc.nextInt();
            if (ans == 2) {
                System.exit(0);
            }
        }
    }
}