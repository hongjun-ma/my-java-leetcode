class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int slow = 0, fast = 0;
        while(fast != nums.length){
            if(nums[slow] != nums[fast]){
                //注意下面两个语句的顺序
                slow++;
                nums[slow] = nums[fast];

            }
            fast++;
        }
        return slow + 1;
    }
}