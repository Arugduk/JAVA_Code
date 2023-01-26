/*给定一个字符串 S ，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反
转。
示例 1：
输入："ab-cd"
输出："dc-ba"
示例 2：
输入："a-bC-dEf-ghIj"
输出："j-Ih-gfE-dCba"
示例 3：
输入："Test1ng-Leet=code-Q!"
输出："Qedo1ct-eeLg=ntse-T!"
 */
public class Exercise2 {
    public static String reverseOnlyLetters(String S){
        char[] chars=S.toCharArray();
        int first=0;
        int last=S.length()-1;
        while(first<last){
            while (!Character.isAlphabetic(S.charAt(first)))
                first++;
            while (!Character.isAlphabetic(S.charAt(last)))
                last--;
            char temp;
            temp=chars[first];
            chars[first]=chars[last];
            chars[last]=temp;
            first++;
            last--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String S="ab-cd";
        System.out.println(reverseOnlyLetters(S));
    }
}
