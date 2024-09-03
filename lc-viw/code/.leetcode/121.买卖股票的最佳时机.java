/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */
//LeetCode 热题 100
// @lc code=start
class Solution {
    //动态规划
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE,res = 0;
        for(int proice : prices){
             min = Math.min(min,proice);
             res = Math.max(res,proice-min);
        }
        return res;
    }
}
// @lc code=end
    //动态规划
    // [7,6,4,3,1]   0
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE,res=0;
        for(int i : prices){
            min = Math.min(i,min);
            res = Math.max(res,i-min);
        }
        return res;
    }
}
