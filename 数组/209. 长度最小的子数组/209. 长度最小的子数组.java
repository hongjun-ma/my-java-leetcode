class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sumWindow = 0;
        //Integer.MAX_VALUE(固定方式)表示int数据类型的最大取值数：2 147 483 647
        int res = Integer.MAX_VALUE;

        while(right < nums.length){
            sumWindow += nums[right];
            right++;
            while(left < right && sumWindow >= target){
                res = Math.min(res, right - left);
                sumWindow -= nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}