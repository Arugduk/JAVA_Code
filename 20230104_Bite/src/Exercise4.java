public class Exercise4 {
    public static void main(String[] args) {
        int num=1;
        for(int i=0;i<9;i++){
            num++;
            num*=2;
        }
        System.out.println(num);
        for(int j=0;j<9;j++){
            num=num/2;
            num--;
        }
        System.out.println(num);
    }
}
