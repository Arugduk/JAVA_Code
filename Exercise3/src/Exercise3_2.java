import java.util.Scanner;
public class Exercise3_2 {
    public static void main(String[] args) {
        System.out.print("Enter three edges:");
        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        double max,sum=0;
        max=(num1>num2)?num1:num2;
        sum+=(num1>num2)?num2:num1;
        sum+=(max>num3)?num3:max;
        max=(max>num3)?max:num3;
        System.out.print("Can edges "+num1+", "+num2+", and "+num3+" form a triangle? ");
        if(sum>max)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
