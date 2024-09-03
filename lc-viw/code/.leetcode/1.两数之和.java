import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
//LeetCode 热题 100
// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if( (null == nums) || (nums.length == 0) ){
            return res;
        }
        //key:数组的值 value:下标，符合条件就从map中get就行了
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i],i);
        }
        return res;

    }
}
// @lc code=end
class  A{
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[0] = i;
                res[1] = map.get(temp);
            }
            map.put(nums[i],i);
        }

        return res;
    }
}