import java.util.Scanner;

public class Binary {

    

    public static void main(String args[]) {
        Binary obj = new Binary();
        obj.convert();

    }

    public void convert() {

        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO DECIMAL CONVERTER"
                + "");
        System.out.println("[1] Binary to decimal \n"
                + "[2] Binary to octal \n"
                + "[3] Binary to hexadecimal ");

        System.out.print("Enter choice: ");
        int hoho = Integer.parseInt(scan.nextLine());
        
        switch (hoho) {
            case 1:

                System.out.println("Enter binary:");
                String bina = scan.nextLine();
                System.out.println(Integer.parseInt(bina, 2));
                break;
            case 2:
                System.out.print("Enter binary: ");
                String binary = scan.nextLine();
                int dec = Integer.parseInt(binary,2);
                String octal = Integer.toOctalString(dec);
                System.out.println("Octal Value is : " + octal);
                break;
            case 3:

                System.out.print("Enter decimal: ");
                String binarys= scan.nextLine();
                int decimal = Integer.parseInt(binarys,2);
                String hexa = Integer.toHexString(decimal);
                System.out.println("HexaDecimal Value is : " + hexa);
                break;

            default:

                break;
        }

    }

}
