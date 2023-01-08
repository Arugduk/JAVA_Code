import java.util.Arrays;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        Random random=new Random();
        int[][] nums=new int[3][3];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(nums));
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==j){
                    sum1+=nums[i][j];
                }else if(i+j==2){
                    sum2+=nums[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
