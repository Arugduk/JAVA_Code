import java.util.Arrays;

/*
2、给定两个有序【升序的】整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有
序数组。
请你 合并 nums2 到 nums1 中，使合并后的数组同样按 升序 排列。
注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
示例 1：
输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
输出：[1,2,2,3,5,6]
解释：需要合并 [1,2,3] 和 [2,5,6] 。
class Solution {
public int lengthOfLastWord(String s) {}
}
合并结果是 [1,2,2,3,5,6] 。
示例 2：
输入：nums1 = [1], m = 1, nums2 = [], n = 0
输出：[1]
解释：需要合并 [1] 和 [] 。
合并结果是 [1] 。
示例 3：
输入：nums1 = [0], m = 0, nums2 = [1], n = 1
输出：[1]
解释：需要合并的数组是 [] 和 [1] 。
合并结果是 [1] 。
注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
 */
public class Exercise2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        if(m==0){
            //nums1= Arrays.copyOf(nums2,n);
            //这里nums1是传过来的引用，将函数拷贝的返回值给了nums1，改变的只是nums1这个形参的值，原本nums1数组里的数并未改变；
            //所以是错的
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }else if(n==0){
            return;
        }
        int temp=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[temp];
            temp++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
