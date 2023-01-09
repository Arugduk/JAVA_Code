public class Exercise1 {
    public static void fnid_val(int [][]arr,int row,int col,int num){
        int i=0;
        int j=col;
        while (true){
            if(i==row+1||j==-1){
                System.out.println("不存在该整数。");
                break;
            }else if(arr[i][j]<num){
                i++;
            }else if(arr[i][j]>num){
                j--;
            }else if(arr[i][j]==num){
                System.out.println("val: "+arr[i] [j]+" row: "
                        +i+" col: "+j);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        fnid_val(array, 3, 3, 15);
    }
}
