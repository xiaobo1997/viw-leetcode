/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        generate(list, "", 0, 0, n);
        return list;
    }

    void generate(List<String> list,String s,int open,int close,int max){
        if(s.length()==max*2){
            list.add(s);                
            return;                
        }
        if(open<max)
            generate(list,s+"(",open+1,close,max);
        if(close<open)
            generate(list,s+")",open,close+1,max);                
    }
}
// @lc code=end
