//1、给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。 OJ链接【LeetCode题号: 189. 旋转数组】
//示例 1:
//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右轮转 1 步: [7,1,2,3,4,5,6]
//向右轮转 2 步: [6,7,1,2,3,4,5]
//向右轮转 3 步: [5,6,7,1,2,3,4]
//示例2：
//输入：nums = [-1,-100,3,99], k = 2
//输出：[3,99,-1,-100]
//解释:
//向右轮转 1 步: [99,-1,-100,3]
//向右轮转 2 步: [3,99,-1,-100]
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums,4);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k){
        reserve(nums,0,nums.length-1);
        reserve(nums,0,k-1);
        reserve(nums,k,nums.length-1);
    }
    public static void reserve(int[] nums,int start,int end){
        int temp;
        while(start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
