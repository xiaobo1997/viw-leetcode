import java.util.LinkedHashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU 缓存
 */

 //LeetCode 热题 100

// @lc code=start
class LRUCache {

    //利用LinkedHashMap
    private int cap;
    private Map<Integer,Integer> cache = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.cap = capacity;
    }


    public int get(int key) {
        //如果不存在直接返回-1
        if(!cache.containsKey(key)){
            return -1;
        }
        //把当前元素 放到尾部 最新的
        makeKey(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        //已经存在了，覆盖
        if(cache.containsKey(key)){
            cache.put(key,value);
            makeKey(key);
            return;
        }
        //如果大于size 说明要移除头部元素
        if(cache.size()>=this.cap){
            int oldKey = cache.keySet().iterator().next();
            cache.remove(oldKey);
        }
        cache.put(key,value);
    }

    //把当前元素重新放到尾部
    private void makeKey(int key){
        int value = cache.get(key);
        cache.remove(key);
        cache.put(key,value);
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

