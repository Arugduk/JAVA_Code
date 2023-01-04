public class Exercise3 {
    public static boolean perfectNumber(int num){
        int sum=0;
        int factor=1;
        while (factor<=num){
            if(num%factor==0){
                sum+=factor;
            }
            factor++;
        }
        if(sum-num==num){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=10000;i++){
            if(perfectNumber(i)){
                System.out.println(i+" ");
            }
        }
    }
}
