class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
         for(int num : nums){
             set.add(num);
         }

         int res = 0;

         for(int num : set){
             if(set.contains(num - 1)){
                 continue;
             }
             int curLen = 1;
             int curNum = num;
             while(set.contains(curNum+1)){
                 curLen += 1;
                 curNum += 1;
             }
             res = Math.max(res, curLen);
         }
         return res;
    }
}