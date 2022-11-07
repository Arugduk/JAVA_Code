import java.util.Scanner;
public class Exercise4_1 {
   public static int fibonacci(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Please input the N:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(fibonacci(n));
    }
}
