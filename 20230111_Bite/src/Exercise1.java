import java.util.Scanner;

//1、字符串逆置，如 "I am a student" 逆置为 "student a am I"
public class Exercise1 {
    public static String reverseSentence(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string2 = scanner.nextLine();
        System.out.println(reverseSentence(string2));
    }
}
