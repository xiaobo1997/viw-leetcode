/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for(int i =0 ;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;

        }
        return true;       
    }
}
// @lc code=end

class Solution {
    public boolean isPalindrome(int x) {
        
    }
}