import java.util.*;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     // Deque  FIFO
    //     if(s.length() == 0) return 0;
    //     if(s.length() == 1) return 1;
    //     int res = 0;
    //     Deque<Character> list= new LinkedList<>();
    //     for(char c : s.toCharArray()){
    //          // 如果队列中有重复的就把最先添加的字符给移除，
    //         // 直到队列中没有重复元素为止
    //         while(list.contains(c)){
    //                 list.poll();//删除头元素
    //         }
    //          // 把当前字符添加到队列中
    //         list.offer(c);
    //         //记录最大值
    //         res = Math.max(res,list.size());
    //     }
    //     return res;
    // }

    // public int lengthOfLongestSubstring(String s) {
    //     //左窗口，右窗口
    //     int left = 0,right = 0,maxLength=0;
    //     Set<Character> window = new HashSet<>();
    //     //右窗口小于下标
    //     while(right<s.length()){
    //          // 如果窗口中包含当前元素，说明出现了重复，
    //         // 把窗口最左端的给移除掉，直到窗口不包含当前元素即可
    //         while(window.contains(s.charAt(right))){
    //             window.remove(s.charAt(left++));
    //         }
            
    //         window.add(s.charAt(right++));
    //         maxLength = Math.max(maxLength,right-left);

    //     }
    //     return maxLength;   
    // }

      public int lengthOfLongestSubstring(String s) {
        Deque<Character>  list = new LinkedList();
        int res = 0;
        if(s.length() <1) return 0; 
        for(char c : s.toCharArray()){
            
            while(list.contains(c)){
                list.poll();
            }
            list.add(c);
            res = Math.max(res,list.size());
        }

        return res;
    }

}
// @lc code=end

class A{
     public int lengthOfLongestSubstring(String s) {
        Deque<Character> list = new LinkedList();
        int res = 0;
        if(s.length()<1) return 0;
        for(char c: s.toCharArray()){
            
            while(list.contains(c)){
                list.poll();
            }

            list.add(c);
            res = Math.max(res,list.size());
        }
        
        return res;

    }
}