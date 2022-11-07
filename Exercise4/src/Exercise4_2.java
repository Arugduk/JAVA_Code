import java.util.Scanner;
public class Exercise4_2 {
    public static  String hexadecimal(int decimal){
        String hex = "";
        while (decimal != 0) {
            int hexValue = decimal % 16;
            char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                    (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        return hex;
    }
    public static void main(String[] args) {
        System.out.println("Please input a decimal number:");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        System.out.println(hexadecimal(x));
    }
}
