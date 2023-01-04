import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a lower case letter.");
        char letter=input.next().charAt(0);
        if(Character.isLowerCase(letter)){
            char letter1=Character.toUpperCase(letter);
            System.out.println(letter1);
        }else{
            System.out.println("Error!");
        }
    }
}
