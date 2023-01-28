
/*
1、在一个长为n的字符串中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小
写）.（从0开始计数）OJ链接 【牛客题号: NC31 第一个只出现一次的字符】
示例1：
输入："google"
返回值：4
示例2：
输入："aa"
返回值：-1
 */
public class Exercise1 {
    public static int FirstNotRepeatingChar(String str){
        int[] amounts=new int [128];
        for(int i=0;i<str.length();i++){
            amounts[str.charAt(i)]++;
        }
        for (int i=0;i<str.length();i++){
            if(amounts[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String str="aa";
        System.out.println(FirstNotRepeatingChar(str));
    }
}
