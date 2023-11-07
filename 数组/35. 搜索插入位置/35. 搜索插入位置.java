class Solution {
    public int searchInsert(int[] nums, int target) {
        return left_bound(nums, target);

    }

    int left_bound(int[] nums, int target){
        if(nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                right = mid - 1;
            }else if(target < nums[mid]){
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }
        }
        // if(left < 0 || left >= nums.length){
        //     return -1;
        // }
        //return nums[left] == target ? left : -1;
        return left;

    }
}