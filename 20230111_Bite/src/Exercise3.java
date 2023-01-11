//1、输入一行字符，统计字符串中数字个数。
//例如： "bit666keji123" 数字的个数为：6个
import java.util.Scanner;

public class Exercise3 {
    public static int isNumeric(String str){
        int num=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isNumeric(str));
    }
}
