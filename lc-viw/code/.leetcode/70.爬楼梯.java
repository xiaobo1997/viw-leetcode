/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
LeetCode 热题 100
// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n<=1)return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
// @lc code=end

class Solution {
    public int climbStairs(int n) {
       if(n<1) return 1;
       int[] dp = new int[n+1];
       dp[1] = 1;
       dp[2] = 2;
       for(int i =0;i<=n;i++){
            dp[i] = dp[i-1] +dp[i-2];
       }
       return dp[n];
    }
}