import java.util.Random;

public class MONI {
    public static void main(String[] args) {
        Random random=new Random();
        int count=0;
        int sum=0;
        for(int j=0;j<=10000000;j++) {
            boolean flag=false;
            int i=0;
            for (; i < 500; i++) {
                int mudi = random.nextInt(100);
                int ans = random.nextInt(100);
                int gailv=random.nextInt(100);
                if (mudi == ans && gailv <= 49) {
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                count++;
                sum+=i;
            }
        }
        System.out.println(count/10000000.0);
    }
}
