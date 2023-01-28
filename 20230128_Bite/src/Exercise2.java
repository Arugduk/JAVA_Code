/*
给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。你有注意到翻转后的整数可能溢出
吗？因为给出的是32位整数，则其数值范围为[−2^{31}, 2^{31} − 1][−231,231−1]。翻转可能会导致溢出，如果反
转后的结果会溢出就返回 0。OJ链接 【牛客题号: CC142 反转数字】
示例1
输入：12
返回值：21
示例2
输入：-123
返回值：-321
示例3
输入：10
返回值：1
示例4
输入：1147483649
返回值：0
 */
public class Exercise2 {
    public static int reverse (int x){
        long n=0;
        while (x!=0){
            n=n*10+x%10;
            x=x/10;
        }
        if(n==(int)n){
            return (int)n;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x=-123;
        System.out.println(reverse(x));
    }
}
