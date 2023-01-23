public class Exercise1 {
    public static int searchInsert(int[] nums, int target){
        int ans=0;
        while (ans<nums.length&&nums[ans]<target){
            ans++;
        }
        return ans;
    }
    //二分法
    public static int searchInsert2(int[] nums, int target) {
        int left=0,right = nums.length - 1;
        if(target < nums[left]) return 0;
        if(target > nums[right]) return nums.length;
        while(left <= right){
        //int mid = (right-left)/2 + left; 都可以
            int mid = (right+left)/2;
            if(target < nums[mid]){
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums,6));
        System.out.println(searchInsert2(nums,6));
    }
}
