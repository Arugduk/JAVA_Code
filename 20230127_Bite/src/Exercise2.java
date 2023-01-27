/*
2、给定一个整数类型的数组 nums ，请编写一个能够返回数组“中心索引”的方法。我们是这样定义数组中心索引
的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。如果数组不存在中心索引，那么我们应该
返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个.OJ链接 【LeetCode题号: 724. 寻找数
组的中心下标】
示例 1：
输入：nums = [1, 7, 3, 6, 5, 6]
输出：3
解释：
中心下标是 3 。
左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ，
右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11 ，二者相等。
示例 2：
输入：nums = [1, 2, 3]
输出：-1
解释：
数组中不存在满足此条件的中心下标。
示例 3：
输入：nums = [2, 1, -1]
输出：0
解释：
中心下标是 0 。
左侧数之和 sum = 0 ，（下标 0 左侧不存在元素），
右侧数之和 sum = nums[1] + nums[2] = 1 + -1 = 0 。

 */
public class Exercise2 {
    public static int pivotIndex(int[] nums){
        //total=sum*2+nums[i]
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int sum=0;
        for(int i=0;sum<total/2;i++){
            if(sum*2+nums[i]==total){
                return i;
            }else {
                sum+=nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={2,1,-1};
        System.out.println(pivotIndex(nums));
    }
}
