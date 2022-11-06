import java.util.Scanner;
import java.util.Random;
public class Exercise3_1 {
    public static void main(String[] args) {
        System.out.print("scissor(0),rock(1),paper(2):");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        Random random=new Random();
        int computer= random.nextInt(3)+0;
        switch (computer){
            case 0:
                System.out.print("The computer is scissor. ");break;
            case 1:
                System.out.print("The computer is rock. ");break;
            case 2:
                System.out.print("The computer is paper. ");break;
        };
        switch (num){
            case 0:
                System.out.print("You are scissor");break;
            case 1:
                System.out.print("You are rock");break;
            case 2:
                System.out.print("You are paper");break;
        }
        if(computer==num)
            System.out.print(" too. ");
        else
            System.out.print(".");
        if(num==computer+1||num==computer-2)
            System.out.print("You won.");
        else if(num==computer)
            System.out.print("It is a draw.");
        else
            System.out.print("You lost.");
    }
}
