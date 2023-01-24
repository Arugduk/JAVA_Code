/*
给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
示例 1：
输入：s = "Hello World"
输出：5
示例 2：
输入：s = " fly me to the moon "
输出：4
 */
public class Exercise1 {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        boolean flag = false;
        boolean hasBlankBefore = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (hasBlankBefore) {
                    len = 0;
                    hasBlankBefore = false;
                    len++;
                } else {
                    len++;
                }
            } else {
                hasBlankBefore = true;
            }
        }
        return len;
    }
    //第二种直接从最后开始数
    public static int lengthOfLastWord2(String s) {
        if(s.isEmpty()){
            return 0;
        } int len = s.length();
        int t =0;
        for(int i = len-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                t++;
    //不能丢掉i != 0,t已经加过了。返回t就可以
                if(i!=0&&s.charAt(i-1)==' '){
                    break;
                }
            }
        } return t;
    }


    public static void main(String[] args) {
        String s="    ";
        System.out.println(lengthOfLastWord(s));
    }
}
