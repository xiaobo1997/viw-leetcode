import java.util.PriorityQueue;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */
//LeetCode 热题 100
// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //优先级队列
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for(int i = 0 ;i<nums.length;i++){
            queue.add(nums[i]);
            if(queue.size()>k){
                queue.poll();
            }

        }
        return queue.poll();
    }
}
// @lc code=end

