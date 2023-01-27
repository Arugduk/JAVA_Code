import java.util.Arrays;

/*
1、给定一个非负整数数组 A ，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素(注意：不
是排序，只是奇数在前偶数在后哈！).OJ链接 【LeetCode题号: 905. 按奇偶排序数组】
输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class Exercise1 {
    public static int[] sortArrayByParity(int[] nums){
        int[] nums2=Arrays.copyOf(nums,nums.length);
        int first=0;
        int last=nums2.length-1;
        while ((first<last)){
            while (nums2[first]%2!=0&&first<last)
                first++;
            while (nums2[last]%2==0&&first<last)
                last--;
            int temp=nums2[first];
            nums2[first]=nums2[last];
            nums2[last]=temp;
            first++;
            last--;
        }
        return nums2;
    }

    public static void main(String[] args) {
        int[] nums={1,5,3,8,55,2,64,13,12,57,1};
        int[] nums2=sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums2));
    }
}
