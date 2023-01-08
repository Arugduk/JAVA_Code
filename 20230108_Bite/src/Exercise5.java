public class Exercise5 {
    public static boolean isPower(int n){
        if(n==1){
            return true;
        }else {
            while(n%2==0){
                n=n/2;
                if(n==1)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPower(256));
        System.out.println(isPower2(256));
    }
    //another method
    //1是2的0次方，2是2的1次方，4是2的平方，我们会发现这些数字的2进制有个共同点：
    //1的2进制：0001 ，2的2进制：0010 ， 4的2进制：0100。2进制中都只有1个1。所以，也可以判断该数字的2进制是不是只有1个1
    //我们发现一个规律，1按位与0=0，2按位与1=0，4按位与3=0，那么n&(n-1) == 0的话，n就是2的K次方
    public static boolean isPower2(int n){
        if((n&n-1)==0)
            return true;
        else
            return false;
    }
}
