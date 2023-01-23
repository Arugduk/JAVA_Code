public class Exercise2 {
    public static boolean isPalindrome(int x){
        char[] num=Integer.toString(x).toCharArray();
        for(int i=0;i<num.length/2;i++){
            if(num[i]!=num[num.length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221221));
    }
}
