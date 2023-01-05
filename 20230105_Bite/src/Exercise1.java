import java.util.Scanner;

public class Exercise1 {
    public static int fun(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return fun(n-1)+fun(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(fun(n));
    }
}
