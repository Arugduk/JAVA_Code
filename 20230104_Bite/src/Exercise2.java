import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个日期");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();
        int answer=0;
        int[] months={0,31,28,31,30,31,30,31,31,30,31,30,12};
        if(year%400==0||year%4==0&&year%100!=0){
            months[2]=29;
        }
        for(int i=0;i<month;i++){
            answer+=months[i];
        }
        answer+=day;
        System.out.println("是该年的第"+answer+"天。");
    }
}
