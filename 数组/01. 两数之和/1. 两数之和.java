class Solution {
    public int[] twoSum(int[] nums, int target) {
        //方法一
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return null;
        //方法二
        HashMap<Integer,Integer> valToIndex = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int need = target - nums[i];
            if(valToIndex.containsKey(need)){
                return new int[]{valToIndex.get(need), i};
            }
            valToIndex.put(nums[i], i);
        }
        return null;
    }
}