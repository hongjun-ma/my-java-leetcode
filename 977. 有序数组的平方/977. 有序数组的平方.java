class Solution {
    public int[] sortedSquares(int[] nums) {
        // //方法一
        // int n = nums.length - 1;
        // int[] nums2 = new int[nums.length];
        // for(int i = 0; i <= n; i++){
        //     nums2[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums2);
        // return nums2;
        //方法二
        int n = nums.length - 1;
        int l = 0, r = n, p = n;
        int[] nums3 = new int[nums.length];
        while(l <= r){
            if(Math.abs(nums[l]) >= Math.abs(nums[r])){
                nums3[p] = nums[l] * nums[l];
                l++;
            }else{
                nums3[p] = nums[r] * nums [r];
                r--;
            }
            p--;
        }
        return nums3;
    }
}