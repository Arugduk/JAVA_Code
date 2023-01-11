//2、将用户输入的字符串转化（压缩）。
//例如： "aabbccdaa" -> "a2b2c2d1a2" 或者 例如： "abbcccffr" -> "a1b2c3f2r1"

public class Exercise2 {
    public static String test4(String str){
        StringBuilder a=new StringBuilder();
        char temp=str.charAt(0);
        int  tempNum=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=temp){
                a.append(temp);
                a.append(tempNum);
                tempNum=1;
                temp=str.charAt(i);
            }else {
                tempNum++;
            }
        }
        a.append(temp);
        a.append(tempNum);
        return a.toString();
    }

    public static void main(String[] args) {
        String str="abbcccffrr";
        System.out.println(test4(str));
    }
}
