class Solution {
    public int[] searchRange(int[] nums, int target) {
        int m = left_bound(nums, target);
        int n = right_bound(nums, target);
        //return int[] res = {m, n};
        return new int[] {m, n};
    }
    int left_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == nums[mid]){
                right = mid - 1;
            }else if(target < nums[mid]){
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }
        }
        if(left < 0 || left >= nums.length) return -1;

        return nums[left] == target ? left : -1;

    }
    int right_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == nums[mid]){
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid - 1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }
        }
        if(right < 0 || right >= nums.length) return -1;

        return nums[right] == target ? right : -1;

    }
}