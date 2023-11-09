class Solution {
    public boolean isPerfectSquare(int num) {
        //方法二：
        int l = 0, r = num;
        while(l <= r){
            int mid = l + (r - l)/2;
            if((long)mid*mid < num){
                l = mid + 1;
            }else if((long)mid*mid > num){
                r = mid - 1;
            }else if((long)mid*mid == num){
                return true;
            }
        }
        return false;

        // //方法一： 测试用例通过了，但耗时太长。
        // for(long i = 0;i <= (long)num;i++){
        //     if((long)i * i == (long)num){
        //         return true;
        //     }
        // }

        // return false;

    }
}