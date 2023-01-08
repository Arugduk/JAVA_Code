public class Exercise4 {
    public static int arraySum(int[] array,int len) {
        if(len==1){
            return array[0];
        }
        else
            return arraySum(array,len-1)+array[len-1];
    }

    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,6};
        System.out.println(arraySum(array1,array1.length));
    }
}
