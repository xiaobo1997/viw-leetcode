/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    // babc  left=0 right=2
    private int leftIndex,rightIndex;

    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        for(int i = 0;i<s.length()-1;i++){
            found(s,i,i);
            found(s,i,i+1);
        }
        return s.substring(leftIndex,leftIndex+rightIndex);
    }

    private void found(String s, int left,int right){
        while(left>=0 && 
                right<s.length() &&
                s.charAt(left)==s.charAt(right)
                ){
            left--;
            right++;
        }
        if(rightIndex < right - left - 1){
            leftIndex = left + 1;
            rightIndex = right - left - 1;
        }
    }
}
// @lc code=end

