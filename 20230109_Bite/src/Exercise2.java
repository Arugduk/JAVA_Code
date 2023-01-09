public class Exercise2 {
    public static void LeftRotateString(String str,int n){
        String str1=str.substring(0,n);
        String str2=str.substring(n);
        str=str2+str1;
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str="abcdef";
        LeftRotateString(str,2);
    }

}
