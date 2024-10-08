import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
//LeetCode 热题 100
// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // ()[
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

// @lc code=end
class A {

    public boolean isValid(String s) {
        // ()
         Stack<Character> stack = new Stack();
         for(char c:s.toCharArray()){
                if(c=='(') stack.push(')');
                else if(c=='[') stack.push(']');
                else if(stack.pop()!=c||!stack.isEmpty()){
                    return false;
                }
         }

         return true;
    }

}
