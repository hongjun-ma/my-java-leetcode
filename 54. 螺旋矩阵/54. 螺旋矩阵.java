class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int up = 0, low = m - 1, left = 0, right = n - 1;
        List<Integer> res = new ArrayList<>();
        //顶部下部判断条件if(up <= low)，右侧左侧判断条件if(left <= right)
        //从A往B遍历,for循环里A到B.eg:从左往右遍历for(int i = left;i <= right;i++)
        //哪部加哪再变哪.eg: 顶部res.add(matrix[up][i]);up++;
        while(res.size() < m*n){
            //顶部从左往右遍历
            if(up <= low){
                for(int i = left;i <= right;i++){
                    res.add(matrix[up][i]);
                }
                up++;
            }
            //右侧从上往下遍历
            if(left <= right){
                for(int j = up;j <= low;j++){
                    res.add(matrix[j][right]);
                }
                right--;
            }
            //下部从右往左遍历
            if(up <= low){
                for(int i = right;i >= left;i--){
                    res.add(matrix[low][i]);
                }
                low--;
            }
            //左侧从下往上遍历
            if(left <= right){
                for(int j = low;j >= up;j--){
                    res.add(matrix[j][left]);
                }
                left++;
            }
        }
        return res;
    }
}