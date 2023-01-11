import java.util.Scanner;
//2、实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，并将该字符串中的大写字母转换成小写字母，之后
//返回新的字符串 。 OJ链接 【LeetCode题号：709. 转换成小写字母】
public class Exercise4 {
/*    public static String toLowerCase(String s){
        return s.toLowerCase();
    }*/
    public static String toLowerCase(String s){
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                a.append((char)(s.charAt(i)+32));
            }else {
                a.append(s.charAt(i));
            }
        }
        return a.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(toLowerCase(str));
    }
}
