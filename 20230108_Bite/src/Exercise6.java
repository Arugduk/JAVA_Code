import java.util.Arrays;

public class Exercise6 {
    public static int[] findNumberAppearOnce(int[] arr){
        int[][] hash=new int[arr.length][2];
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<hash.length;j++){
                if(arr[i]==hash[j][0]){
                    hash[j][1]++;
                    flag=true;
                }
            }
            if(flag==false){
                hash[k][0]=arr[i];
                hash[k][1]=1;
                k++;
            }
        }
        int[] appearOnce=new int[2];
        int s=0;
        for(int i=0;i<hash.length;i++){
            if(hash[i][1]==1) {
                appearOnce[s] = hash[i][0];
                s++;
            }
        }
        return appearOnce;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,3,2,1};
        System.out.println(Arrays.toString(findNumberAppearOnce(nums)));
    }
}
