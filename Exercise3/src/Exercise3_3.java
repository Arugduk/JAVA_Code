import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class Exercise3_3 {
    public static void main(String[] args) {
        System.out.println("Please input the first 9 digits:");
        Scanner input=new Scanner(System.in);
        String str1= input.next();
        char[] num=str1.toCharArray();
        int sum=0;
        for(int i=0;i< num.length;i++){
            sum+=(Integer.valueOf(num[i])-48)*(i+1);
        }
        System.out.print(str1);
        if(sum%11==10)
            System.out.println("X");
        else
            System.out.println(sum%11);
    }
}
