import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    //动态规划
    public int lengthOfLIS(int[] nums) {
        // [2,1,2,3]
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length];
        int res = 0;
        // [1,1,1,1]
        Arrays.fill(dp,1);
        //遍历nums
        for(int i = 0;i<nums.length;i++){
            //遍历
            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i]){
                    // 维持小数组  如i=2 计算一次 是2 那么dp[2]=2
                    //i=3 计算一次是dp[i]=2  dp[j=2]=2+1 = 3
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            //维持最大的
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
// @lc code=end