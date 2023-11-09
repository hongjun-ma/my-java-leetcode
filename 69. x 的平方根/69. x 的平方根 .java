class Solution {
    public int mySqrt(int x) {
        //方法二
        int left = 1;
        int right = x;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left)/2;
            if((long)mid * mid <= x){
                left = mid + 1;
                ans = mid;
            }else{
                right = mid - 1;
            }
        }
        return ans;

        //方法一
        // int ans = 0;
        // for(long i = 0; i * i <= x; i++){
        //     ans = (int)i;
        // }
        // return ans;
    }
}