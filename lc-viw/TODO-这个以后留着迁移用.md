[TOC]

# lc-viw

##  base&api

### 位运算
![](https://xiaoboblog-bucket.oss-cn-hangzhou.aliyuncs.com/blog/20230727020609.png)

```java
- @Test
public void contextLoads() {
var a = 1;
var b = 3;
System.out.println(a^b);//2  
System.out.println(a|b);//3
System.out.println(a&b);//1
System.out.println(~a);//-2
System.out.println(a>>1);//0
System.out.println(a>>2);//0
System.out.println(b>>1);//1
System.out.println(b>>2);//0
System.out.println(b>>>1);//1
System.out.println(b>>>2);//0
System.out.println(b<<1);//6
System.out.println(b<<2);//12
}
```

#### (int.MAX_VALUE + int.MAX_VALUE)/2的问题 

```java
 int的最大值为2147483647
当两个最大值相加就超过最大值了
(2147483647+ 2147483647)/2  = -1
(2147483647 + 2147483647) >> 2 = -1
使用无符合右移 (2147483647 + 2147483647) >>> 1 = 2147483647 

```
### 字符串


```- @Test
    public void sttringtest() {
        //String
        String str = "abc";
        char c = str.charAt(0);// 返回指定字符
        char[] chars = str.toCharArray();//返回字符数组
        int indexOf = str.indexOf('c');//返回第一次出现指定字符的索引
        //StringBuilder
        var sb = new StringBuilder();
        sb.append("d");
        sb.toString();
    }
```


### 数组

```

public void array() {
var arr = new int[2];// = var arr1 = new int[]{2,1};
var arr2 = new int[2][2];// = var arr21 = new int[][]{{1,2},{3,4}};
var x = arr2.length;
var y = arr2[0].length;
Arrays.sort(arr);

Arrays.fill(arr,-1);//将指定的 int 值分配给指定的整数数组的每个元素

}

```

### list

```java
var list = new ArrayList<Integer>();
        var list2 = new ArrayList<List<Integer>>();// List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.size();// list的容量
        list.add(0);// 添加指定元素
        list.add(1);
        list.get(0);// 获取指定索引的元素
        list.remove(0);// 删除指定元素
        list.isEmpty();// 是否空
        Arrays.sort(new int[] { 1, 2 });// 排序
        var arr = new int[] { 1, 2, 3 };
        var arrList = Arrays.asList(arr);
        arrList.stream().forEach(System.out::println);
        var res = new int[2];
        var testList = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3));
        testList.subList(1, 4).stream().forEach(System.out::print);//112
        list.stream().mapToInt(Integer::intValue).toArray();//list to arr
```

### 栈
```
- public void stack() {
var stack = new Stack<Integer>();
stack.isEmpty();//栈是否为空
stack.push(1);//指定元素入栈 = addElement(1);
stack.pop();//返回并删除栈顶元素
stack.peek();//返回栈顶元素
stack.search(1);//返回从上到下元素出现位置(从1开始)，
}
```
### 队列

```

java
@Test
public void queue(){
Deque deque = new LinkedList<Integer>();
deque.isEmpty();//是否为空
deque.addFirst(1);//从首插入
deque.addLast(2);//从尾插入
deque.contains(1);//是否存在指定元素
deque.getFirst();//获取并返回首元素
deque.getLast();//获取并返回尾元素
deque.offer(1);//从尾插入成功返回true失败返回false
deque.offerFirst(1);//从首插入，成功true，失败false
deque.peek();//返回首元素
deque.peekLast();//返回尾元素
deque.poll();//返回并删除首元素
deque.pollLast();//返回并删除尾元素
deque.add(1);//尾插
}
```
### 基于堆的优先级队列
```
- @Test
    public void queueHeap(){
        //基于堆的优先级队列(自然排序)
        var p= new PriorityQueue<Integer>();
        p.add(2);//插入指定元素
        p.offer(1);//和add一样
        p.peek();//返回头部，不删除
        p.poll();//返回并删除头部元素
        p.remove();//返回并删除头部元素
        p.contains(2);//是否存在指定元素
        p.offer(3);
        Iterator<Integer> iterator = p.iterator();
        System.out.println(iterator.hasNext());
        p.stream().forEach(System.out::println);
    }
```


### set
```
- public void set(){
//去除
var set = new HashSet<Integer>();
set.isEmpty();//是否为空
set.add(1);//插入元素
set.add(1);//插入元素
set.remove(1);//删除指定元素
set.contains(1);//是否查找指定元素
set.size();//元素数量
}
```

### map
```
- public void map(){
var map = new HashMap<Integer,Integer>();
map.getOrDefault(1,0);//获取key为1的value,如果没有就赋此key的value为0
map.containsKey(1);//是否存在key为1
map.containsValue(1);//是否存在value为1
map.entrySet();//转成 entry(k,v)的Set
map.keySet();//获取key组成的set
map.values();//获取value组成的集合
map.remove(1);//删除指定元素
map.remove(1, 1);//删除指定元素 成功返回true 失败返回 false
}
```
## 排序

## 数组

### 统计&求次数 

#### 剑指 Offer 03. 数组中重复的数字

找出数组中重复的数字。


在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3 

##### set

```
public int findRepeatNumber(int[] nums) {
    Set<Integer> res = new HashSet<>();
    for(int num : nums) {
        if(res.contains(num)) return num;
        res.add(num);
    }
    return -1;
}
```

#### 剑指 Offer 53 - I. 在排序数组中查找数字 I

统计一个数字在排序数组中出现的次数。

示例 1:

输入: nums = [5,7,7,8,8,10], target = 8
输出: 2
示例 2:

输入: nums = [5,7,7,8,8,10], target = 6
输出: 0

```java

public int search(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>();
    if(nums.length==0){
        return 0;
    }
   for(int i = 0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
        }else {
            int temp = map.get(nums[i]);
            map.put(nums[i],temp+1);
        }
    }
    return map.get(target)==null?0:map.get(target);

}
```
#### 136. 只出现一次的数字

给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:

输入: [2,2,1]  [10,10,01]
输出: 1
示例 2:

输入: [4,1,2,1,2]
输出: 4

##### 位运算 

```java

public int singleNumber(int[] nums) {
    int temp =0;
    for(int i =0;i<nums.length;i++){
        //相同为0 1^2=01^10=11=3  1^1=1
        temp ^= nums[i];
    }
  return temp;
}
```
##### hashmap
```java
		- class Solution {
public int singleNumber(int[] nums) {
var map = new HashMap<Integer,Integer>();
if(nums.length==1) return 0;
for(int num  : nums){
// 遍历nums 放入map中，第一次出现value为0+1，否则就是累加1
map.put(nums,map.getOrDefault(nums,0)+1);
}
for(  int key : map.keySet() ){
if(map.get(key)==1) return key;
}
return 0;
}
}
```

##### hashset
  
##### 排序搜索

```java
		- class Solution {
public int singleNumber(int[] nums) {
if(nums.length == 1) return 0;
//先排序
Arrays.sort(nums);
// 遍历nums,步长为2，起始为1。ex:1 1 2 2 3 4 4
for(int i = 1;i<nums.length-1;i+=2){
if(nums[i] != nums[i-1]) return nums[i-1] ;
}
return 0;
}
}
```

- 137. 只出现一次的数字 II
给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。

示例 1：

输入：nums = [2,2,3,2]
输出：3
示例 2：

输入：nums = [0,1,0,1,0,1,99]
输出：99

	- 求和法

		- class Solution {
public int singleNumber(int[] nums) {
var numsCount = 0L;
var setCount = 0L;
var set = new HashSet<Integer>();
for(int num : nums){
numsCount += num;
if(set.contains(num)) continue;
setCount +=num;
set.add(num);
}
return (int)((3*setCount-numsCount)/2);
}
}

	- 位运算
主要是还原那

		- class Solution {
public int singleNumber(int[] nums) {
// 1 1 1 2 2 2 3
// 01 01 01 10 10 10 11 = 044 每一位1加起来
// 01 01 01 10 10 10 = 033%3 = 0
// 044%3 = 11 = 3

int res = 0;
//数组每一位数字不超过32位
for(int i = 0 ; i<32 ;i++){
int count = 0;//统计数组每一个数字转二进制有多个1
for(int j = 0;j<nums.length;j++){
var m = nums[j] >> i;
//统计有多少个1
if( (m & 1) == 1) count++;
}
//统计的1次数 包含了目标值的1
if( count%3 !=0 ){
//把目标值在个位出现1 十位出现1 百位出现1 这种 还原回去原数字 0 | 1 << 0 = 1 ;  1 | 1 << 2 = 1|2 = 3;
res = res | 1 << i;
}
}
return res ;
}
}

- 260. 只出现一次的数字 III
给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。

 进阶：你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？

 示例 1：

输入：nums = [1,2,1,3,2,5]
输出：[3,5]
解释：[5, 3] 也是有效的答案。
示例 2：

输入：nums = [-1,0]
输出：[-1,0]


	- set遍历

		- class Solution {
public int[] singleNumber(int[] nums) {
//set 去重
var set = new HashSet<Integer>();
for(int i : nums){
//如果set存在这个元素了，remove
if( set.contains(i) ){
set.remove(i);
continue;
}
//添加到set
set.add(i);
}
//set剩下的就是目标元素
var res = new int[2];
int idx = 0;
for(int i : set ){
res[idx++] = i;
}
return res;
}
}

### 前后指针

- 剑指 Offer 57. 和为s的两个数字
输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。

 

示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[2,7] 或者 [7,2]
示例 2：

输入：nums = [10,26,30,31,47,60], target = 40
输出：[10,30] 或者 [30,10]


	- class Solution {
public int[] twoSum(int[] nums, int target) {
    // 1.双指针 一个前一个后 小了就左走，大了向右走
    int start = 0,end=nums.length-1;
    while(start<end){
        int s = nums[start]+nums[end];
        if(s<target) start++;
        else if(s>target) end--;
        else {
        return new int[]{nums[start],nums[end]};
    }
    }
    return new int[0];
}
}

### 快慢指针

- 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

 示例：

输入：nums = [1,2,3,4]
输出：[1,3,2,4] 
注：[3,1,2,4] 也是正确的答案之一。


	- class Solution {
public int[] exchange(int[] nums) {

    int len=nums.length;
    if(len==1) return nums;
    int j=0;
    for(int i=0;i<len;i++){//i is on the right,j is on the left 
        if((nums[i]%2!=0)){ // 寻找奇数 交换位置
           int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }       
    }
    return nums;
}
}

- 283. 移动零

给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]


	- public void moveZeroes(int[] nums) {
int j = 0 ;
for(int i = 0;i<nums.length;i++){
if(nums[i]!=0 ){
int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j ++;
}
}
}

### 求和  连续

- 剑指 Offer 42. 连续子数组的最大和

	- class Solution {
public int maxSubArray(int[] nums) {
    /**
    -2 1 -3 4
    1. -2
    2. -2  < -2 + 1 = 1
    3. 1 > -2+1+(-3) = 1
    4. 1 > -2+1+(-3)+4 = 1 最大的  -2 1
    */
   int res = nums[0];
   for(int i = 1;i<nums.length;i++){
       nums[i] += Math.max(nums[i-1],0);
        res = Math.max(res,nums[i]);
   }
   return res;
}
}

- 剑指 Offer 61. 扑克牌中的顺子

	- class Solution {
public boolean isStraight(int[] nums) {
/**
    排序+遍历，
    0 0 1 3 4  => 1 2 3 4 5 
    4-nums[2] = 3 <5 
    */
int joker = 0;
    Arrays.sort(nums);
for(int i = 0;i<4;i++){
if(nums[i]==0) joker ++;
else if(nums[i]==nums[i+1]) return false;
}
int min = nums[joker];
return nums[4]-min<5;
}
}

- 1.两数之和

	- public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int j = 0; j<nums.length;j++){
        int temp = target - nums[j];
        if (map.containsKey(temp)) {
            return new int[]{j,map.get(temp)};
        }else
        {
            map.put(nums[j],j);
        }
    }
    return new  int[2];
}

- 15. 三数之和

	- 哈希表
	-  双指针

		- class Solution {
    //三指针  -2  -1  0  1  2    left mid right 初始位置是 -2  -1  2
    //-2-1+2 < 0  mid右移 -2 0 2  = 0 
    public List<List<Integer>> threeSum(int[] nums) {
        //返回结果
        var resultArr = new ArrayList<List<Integer>>();
        //小于直接返回
        if( nums.length < 3 ) return resultArr;
        //排序
        Arrays.sort(nums);
        //第一位>0 不符合
        if(nums[0]>0) return resultArr;

        for(int left = 0 ; left<nums.length-2 ; left ++){
            // 目标值target  + 从第一位开始遍历 = 0 才符合要求 转成两数问题
            int target = 0 - nums[left];
            //去重 left 和 mid 相同，left跳过 如 -1 -1 -1 0 1 1 2 ；-1 -1  2  ；-1 -1 2 都满足
            if( left > 0 && nums[left] == nums[left-1]  ) continue;
            // 中间的指针  
            int mid = left + 1;
            //最左边的指针
            int right = nums.length - 1;
            //把left 到 right中的值都走完一遍
            while(mid < right){
                if(nums[mid]+nums[right] == target ){
                    //符合要求，保存结果
                    resultArr.add(Arrays.asList(nums[left],nums[mid],nums[right]));
                    //两个while排除 -1 -1 -1 0 0 1 1 1中的重复情况，
                    while(mid < right && nums[mid]==nums[mid+1]) mid ++ ;
                    while(mid < right && nums[right]==nums[right-1]) right --;
                    mid ++;
                    right --;
                }else if(nums[mid]+nums[right] > target){
                    right -- ;
                }else{
                    mid ++ ;
                }

            }

        }

        return resultArr;
    }

}

- 18. 四数之和

	- 多指针(和三数之和解法一样)

		- 
class Solution {
    //多指针 left midL midR right 
    public List<List<Integer>> fourSum(int[] nums, int target) {
        var res = new ArrayList<List<Integer>>();
        if(nums.length <4) return res;
        Arrays.sort(nums);
        for(int left = 0; left < nums.length - 3; left ++){
            //去重
            if( left >0 && nums[left] == nums[left-1]) continue;
            // 固定a b c d中的a  移动 b 再去 寻找 c d ，c d走完 再移动b，直到走完 
            for(int midL = left + 1; midL < nums.length -2 ; midL ++){
                //去重
                if(midL > left + 1 && nums[midL] == nums[midL -1 ]) continue;
                // 左边两个指针a b c d 中的 c d
                int midR = midL +1;
                int right = nums.length - 1;
                //循环走完 a b c d 中 b以后的所有数
                while(midR < right){
                    int sum = nums[left] + nums[midL] + nums[midR] + nums[right];
                    // 符合条件
                    if ( sum == target) {
                        res.add(new ArrayList<>(Arrays.asList(nums[left],nums[midL],nums[midR],nums[right])));
                        //两个while去重 和三数之和一样
                        while( midR < right && nums[midR] == nums[midR+1]) midR++;
                        while(midR < right && nums[right] == nums[right-1]) right--;
                        //去重再移动指针
                        midR ++;
                        right --;
                    }else if(sum > target){
                        // 大了  a b c d 的d向前走
                        right --;
                    }else{
                        //小了  a b c d 的c 向后走
                        midR ++;
                    }
                }
            }
        }
        return res;
    }
}


### 最大最小查找

- 剑指 Offer 11. 旋转数组的最小数字
输入：[3,4,5,1,2]
输出：1

	- class Solution {
public int minArray(int[] numbers) {
    /**
    遍历一边数组，或者二分查找，
    */
    int left = 0,rigth= numbers.length -1;
    while(left<rigth){
        int mid = left+(rigth-left)/2;
        if(numbers[mid]>numbers[rigth]) left = mid+1;
        else if (numbers[mid]<numbers[rigth]) rigth= mid;
        else  rigth -- ;
    }
    return numbers[left];
}
}

- 剑指 Offer 53 - II. 0～n-1中缺失的数字

	-  class Solution {
public int missingNumber(int[] nums) {

        for(int i = 0; i<nums.length;i++ ){
            if(  i != nums[i]){
                return i;
            }
        }
        return nums.length;
}
}

-  448. 找到所有数组中消失的数字

	- class Solution {
// 1 2 2 3  => -1 -2 -2 3
   public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list = new LinkedList<>();
    int length = nums.length;
    for(int i=0;i<length;i++){
        int cur = Math.abs(nums[i]);// 防止 明明已经是-1 再赋值一次变 +1
        int  index =  cur - 1; // 当前索引
        if(nums[index]>0){ // 正的变负的
            nums[index] = -nums[index];
        }
    }
    for(int i = 0;i<length;i++){
        if(nums[i]>0){
            list.add(i+1);
        }
    }
    return list;
}
}

- 剑指 Offer 39. 数组中出现次数超过一半的数字

	- 方法1排序

		- class Solution {
public int majorityElement(int[] nums) {
    Arrays.sort(nums);
return nums[(nums.length-1)/2];
}
}

	- 方法2 投票

		- class Solution {
public int majorityElement(int[] nums) {
    int res = 0;
    int count = 0;
    for(int i:nums){
        if(count==0) res = i; 
        if(i == res ) {
count++;
        }else{
            count--;
        }
    }
    return res;
}
}

### 实现

- 剑指 Offer 30. 包含min函数的栈

	- class MinStack {
Stack<Integer> a;
Stack<Integer> b;


/** initialize your data structure here. */
public MinStack() {
    a = new Stack<>(); // 
    b = new Stack<>();// 放最小值
}

public void push(int x) {
    a.add(x);
    if(b.empty() || x<=b.peek()){
        b.add(x);
    }
}

public void pop() {
    if(a.pop().equals(b.peek())){
        b.pop();
    }
}

public int top() {
  return a.peek();
}

public int min() {
  // 直接栈顶的就是最小的
    return b.peek();
}
}

###  交集

- 350. 两个数组的交集 II

	- class Solution {
public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
int i = 0, j = 0;
    List<Integer> list = new ArrayList<>();
while (i < nums1.length && j < nums2.length) {
if (nums1[i] == nums2[j]) {
            list.add(nums1[i]);
            i++;
            j++;
} else if (nums1[i] < nums2[j]) i++;
else  j++;
}
int[] res = new int[list.size()];
int index = 0;
for (int num : list) {
        res[index++] = num;
}
return res;
}
}

### 双指针

- 209. 长度最小的子数组

	- 滑动窗口-双指针

		- class Solution {
//双指针   指针之间的就是窗口， 1 1 2 3  target = 3  left 索引0 right起始索引0;当right索引为2 此时 1 1 2 此时 len = 3
//left索引为1  1 2 仍然满足条件，len = 2 ，left再走 不满足，right往前走 为3
public int minSubArrayLen(int target, int[] nums) {
//数组长度
int length = nums.length;
//符合结果最小的长度
int minLen = 2<<16;
//左指针
int left = 0;
//窗口内的值相加的结果
int sum = 0;
for(int right = 0; right<length ; right ++){
        sum += nums[right];
//如果当前左指针左边的值相加 大于 目标值，说明符合条件，记下此时窗口长度
while(sum >= target){
            minLen = Math.min(minLen,right - left + 1);
//left往前走 看是否还满足条件，往前走，sum就要相应减少
            sum -= nums[left];
            left ++;
        }
    }
return minLen == 2<<16 ? 0 : minLen;
}
}

- 27. 移除元素

	- 暴力破解 

		- class Solution {
//暴力破解 1 2 2 1 3 val=2; 当idx=1 value=2 向后遍历寻找第一个!=2的值 此时idx=3 value=1 让 nums[idx=1]=nums[idx=3]
// 此时变为 1 2 1 3 如果idx 不 减1 下一次就++idx从 idx=2开始了 idx=1的2就无法排除
public int removeElement(int[] nums, int val) {
int len = nums.length;
if(len == 0) return 0;
//去重后的长度
int resLen = 0;
for(resLen = 0; resLen < len ; ++resLen ){
//符合条件
if(nums[resLen] == val){
//后面的全部前移1步
for(int j = resLen ; j<len-1 ; j++){
nums[j] = nums[j+1];
}
//res相应减1
resLen --;
//移完以后 长度减少1
len --;
}
}
return resLen;
}
}

	- 双指针

		- class Solution {

public int removeElement(int[] nums, int val) {
   //双指针 1 2 2 1 3  val=2; idx=0 存储 idx=3 存储 idx=4存储
   int len = nums.length;
   if(len == 0) return 0;
   int resLen = 0;
   for(int j = 0 ; j< len ;++j){
//符合条件 跳过
if(nums[j] == val) continue;
//重新存储
nums[resLen++] = nums[j];
   }
   return resLen;
}
}

### 应用

- 485. 最大连续 1 的个数

	- 计数器

		- class Solution {
public int findMaxConsecutiveOnes(int[] nums) {
//计数器
//一个临时count
int count = 0;
//一个比较 上一次count 和 这一次count
int maxcount = 0;
for(int i = 0;i<nums.length ;i ++){
// 符合条件 count计数 +1
if(nums[i]==1) count ++;
else {
//获取当前连续为1 的count
maxcount = Math.max(maxcount,count);
//遇到了不是1的 count重新计数
count= 0;
}
}
return Math.max(count,maxcount);
}
}

-  219. 存在重复元素 II

	- 哈希表

		- class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k)
{
Map<Integer,Integer> map= new HashMap<Integer,Integer>(nums.length);
for(int i =0;i<nums.length;i++){
//遍历获取元素
Integer index = map.get(nums[i]);
//如果之前不存在就存 key为nums元素，value为nums元素对应idx
if(!map.containsKey(nums[i])){
map.put(nums[i],i);
//存在元素 符合 |i-j| <=k
}else if(null!=index&&i-index<=k){
return true;
}else{
//解决 1 0 1 1需要加这个
map.put(nums[i],i);
}
}
return false;
}
}

- 66. 加一

	- 按情况讨论

		- class Solution {
public int[] plusOne(int[] digits) {
// 一共三种情况 第一种 11 + 1 第二种 19+1 第三种 99 + 1
// 长度
int len = digits.length;
// 遍历 数组
for(int i = len - 1;i >=0;i--){
// 如果在 第一位 到 最后一位 出现了不为9的数字，说明不需要进位，只需要相应位的数字+1
if(digits[i]!=9){
//当前出现了 不为9的数字，该数+1；
digits[i]++;
return digits;
}
//出现的数字都是9，说明相应数字都要从9 变为0，+1
digits[i] = 0;
}
//赋一个新数字，因为进1位了
digits = new int[len+1];
//把第一位设置为1
digits[0] = 1;
return digits;
}
}

- 75. 颜色分类

	- 多指针，切分,while循环

		- class Solution {
public void sortColors(int[] nums) {
// 多指针，三向切分 left  i  right 1 0 2 1  => left=1  i=1  right=1 
int len = nums.length;
int left = 0 ;
    int i = left;
int right = len - 1 ;

while( i <= right){
// 把 i 和 right交换
if(nums[i] == 2) {
swap(nums,i,right);
// right缩小
right -- ;
// 把 0 交换到前面去 同时 i 和 左指针都需要前进
}else if(nums[i] == 0) swap(nums,i++,left++);
// 为1 前进
else i++;
}

}
void swap( int[] nums, int i ,int j){
int temp = nums[i];
nums[i] = nums[j];
nums[j] = temp;
}
}

- 1052. 爱生气的书店老板

	- 窗口

		- class Solution {
public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//分三个窗口，左窗口 left  中间可以连续的窗口 大小为minutes  右边窗口 right
int windSum = 0; //窗口中的和
int leftSum = 0; // 左边符合条件的和
int rightSum = 0;// 右边符合条件的和
int len = customers.length;//长度

//窗口值
for(int i = 0 ; i< minutes; ++i){
if(grumpy[i] == 0) windSum +=customers[i];
    }
// 右窗口的值
for(int i = minutes; i < len ; ++ i){
if(grumpy[i] == 0) rightSum +=customers[i];
    }

//符合条件的窗口和的最大值
int resMax = windSum + leftSum + rightSum;
int left = 1;
int right = minutes;
while(  right < customers.length){
if(grumpy[left] == 0) leftSum += customers[left-1];
if(grumpy[right]==0) rightSum -= customers[right];

        windSum = windSum - customers[left-1] + customers[right];

        resMax = Math.max(resMax,windSum + leftSum + rightSum);
        left++;
        right++;
    }

return resMax;



}
}

- 560. 和为K的子数组(前缀和)

	- 双for暴力

		- class Solution {
public int subarraySum(int[] nums, int k) {
// 双 for 循环
int len = nums.length;
int sum = 0 ;
int res = 0;
for(int i = 0;i < len; i ++){
for(int j = i; j < len  ; j ++){
            sum += nums[j];
if(sum== k ) res ++;
        }
//清0，重新统计
        sum = 0;
    }
return res;
}
}

	- 前缀和+ hashMap

- 54. 螺旋矩阵

	- 上下左右，处理边界条件

		- class Solution {
public List<Integer> spiralOrder(int[][] matrix) {
/**
* 1 2 3
* 4 5 6
* 7 8 9
* =>
* 1 2 3 6 9 8 7 4 5 arr[1][0] = 4
*/
var res = new ArrayList<Integer>();
// 上下左右
int left = 0, right = matrix[0].length - 1;
// top = 每一次从上到下遍历
int top = 0, down = matrix.length - 1;
while (true) {
/**
* 1 2 3
* 4 5 6
* 7 8 9
* 第一次，1 2 3 开始向下遍历 6 9
*/
for (int i = left; i <= right; i++) {
res.add(matrix[top][i]);// 从左到右
}
top++;//层高 减少1 也就是说等下就从 从 6开始 向下遍历 top=1
if (top > down)
break;
/**
* 1 2 3
* 4 5 6
* 7 8 9
* 第二次 从3 开始向下遍历 6 9
* top = 1 , down = 2
* res.add(matrix[1][2]); res.add(matrix[2][2]);
*/
for (int i = top; i <= down; i++) {
res.add(matrix[i][right]);// 从上到下
}
right--;//要从左到右，right减少1 也就是 要从8开始 right=1
if (left > right)
break;
/**
* right = 1 left = 0 一共两个元素 8 7
*/
for (int i = right; i >= left; i--) {
res.add(matrix[down][i]);// 从右到左
}
down--;//从下到上 1已经添加， 7也已经添加 down=1
if (top > down)
break;
/**
* down = 1 top=1 只有4添加进去
*/
for (int i = down; i >= top; --i) {
res.add(matrix[i][left]);// 从下到上
}
left++;//向右推进1 left=1 也就是从 5 开始
//此时此刻 left = 1 right =1 down = 1 top=1
if (left > right)
break;
}
return res;
}
}

- 59. 螺旋矩阵 II

	- 和54反着来

		- class Solution {
public int[][] generateMatrix(int n) {
var res = new int[n][n];
int left = 0;//从左到右开始的idx
int right = n-1;//从右到左开始的idx
int top = 0;//从上到下的idx
int buttom = n-1;//从下到上的idx
int num = 1;//数组中的元素
int numsize = n*n;
while(true){
for(int i = left; i<=right ;i ++){
res[top][i] = num++;
}
top++;//从上到下的idx + 1
if(num > numsize) break;
for(int i = top ; i<= buttom; ++i){
res[i][right] = num ++;
}
//从右到左的 idx -1
right -- ;
if(num > numsize) break;
for(int i = right; i>=left;--i){
res[buttom][i] = num++;
}
// 从下到上的 idx -1
buttom --;
if(num > numsize) break;
for(int i = buttom;i>=top;--i){
res[i][left] = num++;
}
// 第一轮 走完了
left++;
if(num > numsize) break;
}
return res;
}
}

- 41. 缺失的第一个正数

	- 两次关键for循环
第一次让值变下标
第二次正常i=1.i++；找出缺失的数字

		- class Solution {
public int firstMissingPositive(int[] nums) {
// 1 2 4 缺3 3 1 2 缺4 2 3 4 缺1 1 2 -1 4 缺3 缺排序后的第一个正整数
// 如 2 1 3
// 如果长度为0 缺1
if(nums.length == 0) return 1;
//新创建一个数组
var res = new int[nums.length+1];
//遍历原数组
for(int x : nums){
//返回的是正整数 >0 才添加
//值是多少 下标就是多少 如原 2 1 3 res变为 idx=2 idx_v=2 idx=1 idx_v=1 idx=3 idx_v=3
if(x>0 && res.length > x) res[x] = x;
}
//再一次遍历数组
for(int i = 1;i<res.length ;i ++){
//如果下标无法和正常的i 对应 说明缺少
if(res[i] !=i ) return i;
}
return res.length;// 1 2 3 返回 4 就是 res的长度，前面在 原数组上 +1了
}
}

-  233. 数字 1 的个数

	-  规律
每一位 要么>1 ；要么 = 1；要么< 1

		- class Solution {
public int countDigitOne(int n) {
    //1014   从低到高  
    // 4 > 1  (101 + 1)*1 = 102  =  ( 高位  + 1 ) + 1
    // 1 = 1  10 * 10 + 1+4 = 105 =  （高位 * 当前位(十位)  + 当前位值(1) + 低位(4)） 
    // 0 < 1  1*100         = 100 =  （高位 * 当前位）
    // 1 = 1  0*1000 + 1 + 014 = 15 = (高位  * 当前位(千位) + 当前位值(1)+ 低位(014))
    //  102 + 105  + 100  + 15 = 322
    int high = n;//高位
    int low = 0;//低位
    int cur = 0;//当前位
    int count = 0;
    int num =1;
    while(high !=0 || cur !=0){
        cur = high % 10;
        high /=10;
        if(cur == 0) count  += high * num;
        else if(cur ==1) count += high * num + 1 + low;
        else count += (high+1) * num;
        low = cur * num + low;
        num *= 10;
    }
    return count;
}
}

## 字符串

### 统计

- 剑指 Offer 50. 第一个只出现一次的字符

	- class Solution {
public char firstUniqChar(String s) {
    Map<Character,Boolean> map = new HashMap<>();
    char[] ch = s.toCharArray();
    for(char c : ch){
        map.put(c,!map.containsKey(c));
    }
    for(char c : ch){
        if(map.get(c)) return c;
    }
    return ' ';
}
}

- 剑指 Offer 15. 二进制中1的个数

	- 方法1

		- public class Solution {

public int hammingWeight(int n) {

    int temp = 0;
    if(Integer.toBinaryString(n).length()>32) return 0;
    for(char c :Integer.toBinaryString(n).toCharArray()){
        if(c == '1'){
            temp++;
        }
    }
    return temp;
}
}

	- 方法2 位运算

		- public class Solution {
public int hammingWeight(int n) {
int res = 0;
while(n!=0){
        res ++;
        n = (n-1)&n; // 110 & 111 => 110
}
return res;
}
}

- 387. 字符串中的第一个唯一字符

	- class Solution {
public int firstUniqChar(String s) {
    /**
    map遍历一遍，key存索引，value存char
    */
    Map<Character,Integer> map = new HashMap<>();
    char[] cs = s.toCharArray();
    for(char c :cs)
        map.put(c,map.getOrDefault(c,0)+1);
    for(int i =0;i<s.length();i++)
        if(map.get(cs[i])== 1) return i;
    return -1;
}
}

- 459. 重复的子字符串

	- 字符串截取
父串包含子串

		- class Solution {
public boolean repeatedSubstringPattern(String s) {
// abab + abab = abababab => a + bababa + b bababa 包含 abab true
// aba + aba = abaaba => a+ baab + a baab 不包括 aba
String temp = s + s;
temp = temp.substring(1,temp.length()-1);
if(temp.contains(s)) return true;
return false;
}
}

### 翻转 旋转 反转

- 翻转

	- 剑指 Offer 58 - I. 翻转单词顺序

		- public String reverseWords(String s) {
String[] strs = s.trim.spilt("\\s+");
 StringBuilder res = new StringBuilder();
 for(int i = strs.length()-1;i>=0;i--){
if(strs[i]==" ") continue;
     res.append(strs[i]+" ");
 }
 return res;
 }

	- 151. 翻转字符串里的单词
input:"aa  b  c  "
output:"c b aa"

		- 分割+for循环

			- class Solution {
    public String reverseWords(String s) {
        var res = new StringBuffer();
        String[] strArr = s.split("\\s+");
        int size = strArr.length;
        for(int i = size-1;i>=0;i--){
            res.append(strArr[i]+" ");
        }
        return res.toString().trim();
    }
}

		- api

- 旋转

	- 剑指 Offer 58 - II. 左旋转字符串

		- //方法2  
  class Solution {
public String reverseLeftWords(String s, int n) {
    StringBuilder res = new StringBuilder();
    for(int i = n; i < s.length(); i++)
        res.append(s.charAt(i));
    for(int i = 0; i < n; i++)
        res.append(s.charAt(i));
    return res.toString();
}
}

- 反转

	- 557. 反转字符串中的单词 III
输入："Let's take LeetCode contest"
输出："s'teL ekat edoCteeL tsetnoc"

		- public String reverseWords(String s) {
// 遍历 s 然后 遇到空格就reverse
String[] sArr = s.split(" ");
int start = 0;
StringBuilder sb = new StringBuilder();
for(String ss : sArr){
int curSLen = ss.length();
char[] curChar = ss.toCharArray();
for(int i = 0;i<curSLen/2;i++){
char temp = curChar[i];
curChar[i] = curChar[curSLen-i-1];
curChar[curSLen-i-1] = temp;
}
sb.append(curChar);
sb.append(" ");
}
// 转string 去除最后一个" "
return sb.toString().trim();
}

	- 7. 整数反转

		- class Solution {
public int reverse(int x) {
// 123 = 3  123/10 = 12
int res = 0,temp =0,flag = 0 ;
while(x!=0){
         temp = x;
          flag = res;
         res = res*10+temp;
if(res/10 !=flag) return 0;//超过int了
         x/=10;
}
return res;
}
}

	- 344. 反转字符串
原地交换

		- class Solution {
public static void reverseString(char[] s){
//  a=1 b=2  => a=2  b=1  
// a=1^2=01^10 = 11 =3  b=01^11 =2   a=11^10 = 01= 1 
// a = a^b  b=a^b  a = a^b   a<=>b
int n = s.length;
int index = n-1;
for (int i = 0; i < n / 2; ++i) {
int j = index - i;
        s[i] ^= s[j];
        s[j] ^= s[i];
        s[i] ^= s[j];
}
    System.out.println(s);
}
}

	-  541. 反转字符串 II

		- 字符数组替换

			-  class Solution {
public String reverseStr(String s, int k) {
char[] chs = s.toCharArray();
for(int i = 0;i<chs.length;i+=(2*k)){
//剩下的字符长度 abcd k=2 反转 ab => bacd
int remaining = Math.min(chs.length-1,i+k-1);
reverse(chs,i,remaining);
}
return String.valueOf(chs);
}
//交换位置
void swap(char[] ch,int i ,int j){
char temp = ch[i];
ch[i] = ch[j];
ch[j] = temp;
}
//
void reverse(char[] ch,int i ,int j){
while(i<j){
swap(ch,i,j);
i++;
j--;
}
}
}

	- 剑指Offer 05.替换空格

		-  正则表达式

			-  class Solution {
public String replaceSpace(String s) {
    if ("".equals(s)) {
        return s;
    }
    if (null==s) {
        return null;
    }
    String a = "[\\s~\\t]";
    Pattern p = Pattern.compile(a);
    Matcher matcher = p.matcher(s);
    return matcher.replaceAll("%20");
}
}

### 回文

-  125. 验证回文串

	-  class Solution {
public boolean isPalindrome(String s) {
/**
    双指针，一个从左到右  一个从右到左 忽略大小写 和字符
    */
int len = s.length();
int a = 0,b =len-1;
while(a<b){
// 如果是字母或者是数字就退出 比较
while (a < b && !Character.isLetterOrDigit(s.charAt(a))) {
++a;
}
// 如果是字母或者是数字就退出
while (a < b && !Character.isLetterOrDigit(s.charAt(b))) {
--b;
}

if (a < b) {
//比较两个字母是否一致
if (Character.toLowerCase(s.charAt(a)) != Character.toLowerCase(s.charAt(b))) {
return false;
}
++a;
--b;
}

}
return true;
}
}

### 实现 

-  28. 实现 strStr()

	- 链接==> 看字符串匹配算法模型

### 匹配 等

-  前缀

	- 14. 最长公共前缀
字符串数组 的公共前缀

		- class Solution {
public String longestCommonPrefix(String[] strs) {
if((strs==null)|| (strs.length == 0) ) return "";
    Arrays.sort(strs);
char[] min =  strs[0].toCharArray();
char[] max = strs[strs.length-1].toCharArray();
    StringBuilder res = new StringBuilder();
for(int i = 0 ; i<min.length;i++){
if(min[i]==max[i] )  res.append(min[i]);
else break;
}
return res.toString();
}
}

-  字符串匹配算法模型

	- BF

		- 28. 实现 strStr()
子串匹配父串时的第一个索引

			-  api

				-  class Solution {
public int strStr(String haystack, String needle) {
return haystack.indexOf(needle);
}
}

			-  匹配

				- class Solution {

public int strStr(String haystack, String needle) {
    /**
    abc  b     3   1
    */
    int a=0,b=0,bigLen=haystack.length(),chileLen=needle.length(),bigIndex=0;
    while( (a<bigLen)&&(b<chileLen) ){ // 2<3  1<1  false
        if(haystack.charAt(a)==needle.charAt(b)) { // a!=b   b=b
            a++;b++;    // a=2  b = 1
        }else { 
            a= ++bigIndex; // a =1
            b=0; // 0
        }
    }
   return b>=chileLen?bigIndex:-1;
}
}

			-  BF:
从前往后

				- class Solution {
public int strStr(String haystack, String needle) {
// BF算法 字符匹配
int hayLen = haystack.length();
int needLen = needle.length();
if(hayLen < needLen) return -1;//父串小于子串
if(needLen == 0) return 0;// 子串为0
// abcd cd 匹配到 idx=0 idx=1 idx=2 还不满足 就返回 -1 所以是 hayLen - needLen + 1=3
for(int i = 0;i < hayLen - needLen + 1 ; i ++){
int j ;
//去匹配子串 i+j 是父串的位置， j 是子串位置
for(j = 0;j<needLen;j++){
if(haystack.charAt(i+j) != needle.charAt(j) ) break;
}
if(j == needLen) return i;
}
return -1;
}
}

	- BM：
从后往前
	-  KMP

-  32. 最长有效括号

	- 暴力遍历法

		- class Solution {
    public int longestValidParentheses(String s) {
        //暴力法遍历，ex:())
        int count = 0,max=0;
        for(int i = 0;i<s.length();i++){  // i=0
            count =0;
            for(int j = i;j<s.length();j++){ // j=0
                if('('==s.charAt(j)) count ++; //'('==s.charAt(0)  count=1
                else count--;
                if(count<0) break;// 右括号更多，后面不管有啥都无法匹配
                
                if(count==0){       // i=0 j=1  count =0    j-i+1 = 1-0+1 > 0   max=2
                    if(j-i+1>max) max = j-i+1;//比之前的长度更长
                }
            }
        }
        return max;
    }
}

	- 栈
	- 迭代

		- https://leetcode.wang/leetCode-32-Longest-Valid-Parentheses.html

-  38. 外观数列

	- class Solution {
    public String countAndSay(int n) {
        //1
        //11 = 1个1
        //21 = 2个1
        //1211 = 1个2 1个1
        //111221 = 1个1  1个2 2个1
        //3个1 2个2 1个1
        if(n==1) return "1";
        String str = countAndSay(n-1);
        return say(str);
    }
    String say(String str){
        String res = "";
        //count统计次数 left是每一次字符串最左边的第一个字符 用来统计有几个相同的
        int count =1,j = 0, left = str.charAt(0)-'0';
        //这里的i是从1开始
        for(int i=1;i<str.length();i++){
            int right = str.charAt(i)-'0';
            //如果第一个字符和后面的字符相同 就要统计次数 
            if(left==right){
               count++; 
            }else{
                //如果不相同 说明出现一次， 就是 一个当前值 比如 1个1  count是1 
                res+=String.valueOf(count);
                //注意这里是拼接上j所在的字符
                res+=str.charAt(j);
                //把i给当前j 前面的已经统计完了
                j=i;
                //出现给left赋值，前面的统计完了
                left = str.charAt(j)-'0';
                //count重新赋1
                count=1;
            }
        }   
        //如11 1出现了两次 把出现的次数拼接上去 那么现在就是2
        res+=String.valueOf(count);
        //拼接上 出现次数的 值
        res+=str.charAt(j);
        return res;
    }
}

## 栈和队列

### 应用

- 20. 有效的括号
以正确的顺序闭合。

	- class Solution {
public boolean isValid(String s) {
// ({)} false  {()} true
char[] ch = s.toCharArray();
  Stack<Character> stack = new Stack<>();
for(char c : ch){
if(c=='('||c=='{'||c=='[') stack.push(c);//入栈
if(stack.isEmpty()) return false;
if(c == ')' && stack.pop() != '(' ) return false;
if(c == '}' && stack.pop() != '{' ) return false;
if(c == ']' && stack.pop() != '[' ) return false;
}
return stack.isEmpty();
}
}

- 1047. 删除字符串中的所有相邻重复项

	- 栈

		- class Solution {
    public String removeDuplicates(String s) {
        // abbaca  => 入栈
        // 栈顶--栈底
        // 1.   a
        // 2.   ba
        // 3.   a
        // 4.   0
        // 5.   c
        // 6   ac
        // return  ca
        Stack<Character> stack = new Stack();
        char[] chs = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(stack.isEmpty() || chs[i] !=stack.peek()  ) stack.push(chs[i]);
            else stack.pop();
        }
        
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}

- 150. 逆波兰表达式求值

	- 栈

		- class Solution {
    public int evalRPN(String[] tokens) {
        //栈， [2 1 + 3 *] 找到符号前面的两个数字进行运算， (2 + 1) * 3 
        // apply stack  find 
        Stack<Integer> stack = new Stack();
        for(String s : tokens){
           
            //if the following conditoins are matched
            if("+".equals(s)||"-".equals(s)||"*".equals(s)||"/".equals(s)){
                 //return two  top of stack  and  the first two symbols are numbers
                int a = stack.pop();
                int b = stack.pop();
                if("+".equals(s)) stack.push(a+b);
                else if("-".equals(s)) stack.push(b-a); // 本来是4-3 但是4先入栈的 所有 要 b-a
                else if("*".equals(s)) stack.push(a*b);
                if("/".equals(s)) stack.push(b/a);
            }else
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
        
    }
}

- 347. 前 K 个高频元素
返回前k个多次出现的数字

	- 优先级队列

		- class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // return first k number  input: 1 1 2 2 3 k=2 output:1 2  k=1 output:1
        if(k<1) return new int[]{};
        var map = new TreeMap<Integer,Integer>();
        for(int i : nums)
             map.put(i,map.getOrDefault(i,0)+1);
        // 堆 从大到小排序
        var MKheap = new PriorityQueue<Map.Entry<Integer,Integer>>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            MKheap.add(entry);
        List<Integer> resList = new LinkedList<>();
        while(resList.size() < k){
            Map.Entry<Integer,Integer> entry = MKheap.poll();
            resList.add(entry.getKey());
        }
        
        var res = new int[k];
        for(int i = 0 ;i<k;i++){
            res[i] = resList.get(i);
        }
        return res;
    }
}

- 402 移掉 K 位数字

	-  栈(贪心)
单调栈

		- class Solution {
    public String removeKdigits(String num, int k) {
        // num = "1432219", k = 3 output "1219"  移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
        // num = "10200", k = 1 output "200" 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
        //use stack  ex:10200  k=1  0不入栈  0020 反转 0200  charAt(0)=='0' => del idx=0 => return
        /**
                        0
                    0   0
                2   2   2
            0   0   0   0
        1
        */
        int len =  num.length();
        if(k==len) return "0";
        var stack = new Stack<Character>();
        int i = 0;
        while(i<len){
            //1在栈顶 0小于栈顶，1出栈，0入，保证栈底是最小值
            while(k>0&& !stack.isEmpty() &&stack.peek()>num.charAt(i)){
                 stack.pop();
                 k--;
            }
            // 入栈
            stack.push(num.charAt(i));
            i++;
        }
        // 10200 前面k已经相应减少了
        while(k>0){
             stack.pop();
             k--;
        }
        // 解决 0 在首位置的情况 ，然后反转
        var  res = new StringBuilder();
        while(!stack.isEmpty())
            res.append(stack.pop());
        //sb.reverse();

        //
        while(res.length()>1 && res.charAt(res.length()-1)=='0')
            res.deleteCharAt(res.length()-1);
        return res.reverse().toString();
    }
}

###  实现

- 225. 用队列实现栈

	- LinkedList

		- class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        this.queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        queue.add(x);
        for(int i = 0;i<queue.size()-1;i++)
            queue.add(queue.poll());
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

- 232. 用栈实现队列

	- 两个Stack
一个input，一个output

		- class MyQueue {
    //实例化两个栈
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();
    public MyQueue() {}
    
    public void push(int x) {
        input.push(x);
    }
    //删除并返回第一个元素
    public int pop() {
       peek();
       return output.pop();
    }
    //返回第一个元素，同是每一次插入input 都会 插入到output，只不过方向相反
    public int peek() {
        if(output.empty())
            while(!input.empty())
                output.push(input.pop());
        return output.peek();
    }
    public boolean empty() {
        return input.empty() && output.empty();
    }
}

- 剑指 Offer 09. 用两个栈实现队列

	- class CQueue {
LinkedList<Integer> a;
LinkedList<Integer> b;
public CQueue() {
    a = new LinkedList<>();
    b = new LinkedList<>();
}

public void appendTail(int value) {
    a.addLast(value);
}

public int deleteHead() {
    if(a.size()!=0) return a.pollFirst();
    return -1;
}
}

## 链表

### 倒数k 倒序 间隔k

- 剑指 Offer 06. 从尾到头打印链表

	- class Solution {
public int[] reversePrint(ListNode head) {
 LinkedList<Integer> linkedList = new LinkedList<>();
    //把head放入栈中
    while (null!=head){
        linkedList.addLast(head.val);//尾插
        head  = head.next;//把下一个节点给当前节点
    }
    int[] arr = new int[linkedList.size()];
    for (int i = linkedList.size()-1,j=0; i >=0&&j<linkedList.size(); i--,j++) {
        arr[j] = linkedList.get(i);
    }
    return  arr;
}
}

- 剑指 Offer 22. 链表中倒数第k个节点

	- class Solution {
public ListNode getKthFromEnd(ListNode head, int k) {
    // le在后，cur在前  隔着k个单位距离
    ListNode le=head,cur=head;
    for(int i =0;i<k;i++){
        le = le.next;
    }
    while(le!=null){
        le=le.next;
        cur = cur.next;
    }
    return cur;
}
}

### 公共

- 剑指 Offer 52. 两个链表的第一个公共节点

	- /**
1.主要是通过 a+b = b+a，
2.两个指针，a 走完 自己的走 链表b的， b走完自己的走 链表a的
3.如果他们有相交，他们就会相遇
*/
public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
ListNode a = headA;
ListNode b = headB;
while(a!=b){
    //
    a = a==null?headB:a.next;
    b = b==null?headA:b.next;
}
   return a;
}
}

### 快慢指针

- 链表中点

	- 876. 链表的中间结点

		- 子主题 1

			- class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;//
        int total = 0;
        while(curr!=null){
            total ++;
            curr = curr.next;
        }

        total =  total/2 +1;//后面那个
        ListNode cur = head;

        for(int i = 1;i<total;i++)
            cur = cur.next;
        return cur;
    }
}

	- 234. 回文链表

		- class Solution {
public boolean isPalindrome(ListNode head) {
    /**
    利用栈解决
    */
    ListNode temp = head;
    Stack<Integer> stack = new Stack();
    // 把链表放入栈中，
    while(temp!=null){
        stack.push(temp.val);
        temp = temp.next;
    }
    while(head!=null){
        if(head.val != stack.pop()){
            return false;
        }
        head = head.next;
    }
    return true;
}
}

	- 143. 重排链表

		- 拆分

			- class Solution {
    public void reorderList(ListNode head) {
        //1 2 3 4 5 6=> 头尾头尾头尾的取,1 6 2 5 3 4
        //分两半1 2 3;4 5 6 ， 4 5 6 反转  6 5 4
        // 1 2 3
        // 6 5 4 
        // => 分别取头节点 => 1 6 2 5 3 4
        //快慢指针 先取 中间节点
        if(null==head||null==head.next) return ;
        ListNode cur = head,fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            cur = cur.next;
            fast = fast.next.next;
        }
        ListNode left = head;//主链
        ListNode right = reverseList(cur.next);//后半反转的单链
        cur.next = null;
        while(null!=left&&right!=null){
            ListNode rightNext = right.next;//先把5取出来
            right.next = left.next; //
            
            left.next = right;
            left = right.next; 
            right = rightNext;
        }   
    }
    //反转单链
    ListNode reverseList(ListNode head){
        ListNode cur = head, pre = null;
        while(cur!=null){
            ListNode temp =  cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        //这里返回的是pre，也就是一开始为null。因为判断条件是 cur!=null
        return pre;
    }
}

- 结构判断

	- 141. 环形链表
判断链表中是否有环。

		- public class Solution {
public boolean hasCycle(ListNode head) {
    /**
    快慢指针 一个走两步  一个走一步
    */
    if(head==null) return false;
    ListNode slow = head,fast = head;
    while(fast!=null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) return true; 
    }
    return false;
}
}

	- 142. 环形链表 II

		- hashset

			- public class Solution {
    public ListNode detectCycle(ListNode head) {
        /**
         * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
         */
        //利用hashSet遇到有重复的说明就 遇到了链表和环的第一个节点
        var set = new HashSet<ListNode>();
        ListNode cur = head;
        while(cur!=null){
            set.add(cur);
            cur = cur.next;
            if(set.contains(cur)) return cur;
        }
        return null;
    }
}

		- 快慢指针

### 双指针

- 160. 相交链表

	- hashset

		- public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //剑指offer
        ListNode tempA = headA, tempB = headB;
        var setA =  new HashSet<ListNode>();
        while(tempA != null){
            setA.add(tempA);
            tempA = tempA.next;
        }
        while(tempB!=null){
            if(setA.contains(tempB))
                return tempB;
            tempB = tempB.next;
        }
        return tempB;

    }
}

	- 双指针

- 328. 奇偶链表

	- 拆分再连接

		- public ListNode oddEvenList(ListNode head) {
        //奇数编号的node放前面 编号1 编号2 编号3 ... 
        // 1(p1) 2(p2) 3 4 5 => 1 3 5 2 4
        if (null == head || null == head.next) return head;
        ListNode odd = head, even = head.next, pre = even;
        while (p2 != null && p2.next != null) {
            //1 2 3 4 5 6 让 1->3->5   2->4->6 再 5->2
            /** start: odd = 1  even = 2
             * 1   / 3    /5
             *   \2    \4    \6
             * 
             * 1----3 \  /5
             *    2/    4   \6
             * odd移到3
             * 1---3
             * 
             */
            odd.next =  even.next;
             odd = odd.next; 
             even.next = odd.next;
             even = even.next;
        }
        //循环结束 p1 = 5 pre = 2 4 => p1 5 2 4  head = 1 3
        odd.next = pre;
        return head;
    }

### 删除

- 剑指 Offer 18. 删除链表的节点

	- class Solution {
public ListNode deleteNode(ListNode head, int val) {

    if(val == head.val && head.next !=null){
        return head.next;
    }
    ListNode pre = null;
    ListNode cur = head;
    while(cur.val != val){
        ListNode temp = cur.next;
        pre = cur;
        cur = temp;
    }
    pre.next = cur.next;
    return head;
}
}

- 83. 删除排序链表中的重复元素

	- class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(null != cur ){
            while(cur.next != null && cur.val == cur.next.val )
                cur.next = cur.next.next;
            cur = cur.next;
        }
        return head;
    }
}

- 82. 删除排序链表中的重复元素 II

	- /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode resNode =new ListNode(-1,head);// 
        ListNode cur = resNode;
        int tempNodeVal = 0; 
            while(cur.next !=null && null != cur.next.next ){
                if(cur.next.val == cur.next.next.val){
                    tempNodeVal = cur.next.val;
                    while(cur.next!=null && cur.next.val == tempNodeVal){
                        cur.next = cur.next.next;
                    }
                }else{
                    cur = cur.next;
                }    
            }
            return resNode.next;
    }
}

### 合并

- 剑指 Offer 25. 合并两个排序的链表

	- public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
   ListNode temp  = new ListNode(0);
   ListNode cur = temp;
   while(l1!=null && l2!=null){
       // l1的值<l2的值
       if(l1.val<l2.val){
        cur.next = l1;
        l1 = l1.next;
       }else{
        // l1>l2 || l1=l2
        cur.next = l2;
        l2 = l2.next;
       }
        cur = cur.next; // 移动cur指针 往前走
   }
   //合并最后一个节点 a 123  b 123 此时a 还有3 b空 c 11223 把a中的3放在最后面
   cur.next = l1!=null?l1:l2;
   return temp.next;
}

- 21. 合并两个有序链表

	- 迭代

		-  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          //迭代,两个都有序
        var temp = new ListNode(0);
        var res = temp;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }else{
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if(l1!=null) temp.next = l1;
        if(l2!=null) temp.next= l2;
        return res.next;
    }

	- 递归

		-     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if(l1==null) return l2;
      if(l2==null) return l1;
        
       if(l1.val<=l2.val){
           l1.next = mergeTwoLists(l1.next,l2);
           return l1;
       }else{
           l2.next = mergeTwoLists(l1,l2.next);
           return l2;
       }
    }

- 23. 合并K个升序链表

	- 暴力

		-  public ListNode mergeKLists(ListNode[] lists) {
  	var valList = new ArrayList<Integer>();
	for(ListNode ln : lists){
	   while(ln!=null){
		valList.add(ln.val);
		ln = ln.next;
	}	
       }
     Collections.sort(valList);//排序
     var tempHead = new ListNode(0);
    ListNode h = tempHead;
    for(int i :valList){
	var temp = new ListNode(i);//create new ListNode
	h.next = temp;
	h = h.next;//指针前移
    }
    h.next = null;
   return tempHead.next;
        
    }

	- 优先级队列

		- public ListNode mergeKLists(ListNode[] lists) {
		if (null == lists || lists.length == 0)
			return null;
		var queue = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);// 优先级队列
		for (ListNode node : lists)
			if (node != null)
				queue.add(node);
		var preHead = new ListNode(0);
		var head = preHead;
		while (!queue.isEmpty()) {
			head.next = queue.poll();
			head = head.next;
			if (head.next != null)
				queue.add(head.next);
		}
		return preHead.next;
	}

### 反转

- 剑指 Offer 24. 反转链表

	- // 方法2  前后指针 cur  pre  
 public ListNode reverseList(ListNode head) {
    ListNode cur = null,pre = head;
    while(pre!=null){
        ListNode temp = pre.next;
        pre.next = cur;
        cur = pre;
        pre = temp;
    }
    return cur;
}

- 92. 反转链表 II
反转指定区间

	- 反转+前移

		- class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 思路：先遍历到m处，翻转，再拼接后续，注意指针处理
        // 输入: 1->2->3->4->5->null, m = 2, n = 4 => 2到4 翻转   1 4 3 2 5
        if(null==head)return null;
        ListNode newHead = new ListNode(0);//构建新头节点
        newHead.next = head;
        ListNode pre = newHead;
        // 0(pre)->1->2->3->4->5->null
        for(int i = 0;i<left-1;i++) pre = pre.next;
        // 0 -> 1(pre) -> 2 -> 3 -> 4 ->5 -> null
        
        // 0-> 1(pre) -> 2(cur)  -> 3 -> 4 ->5 -> null
        ListNode cur = pre.next;

        // 0-> 1(pre) -> 2(cur)  -> 3(then) -> 4 ->5 -> null
        ListNode then = cur.next;

        // 1. 1 3 2 4 5 
        // 2. 1 4 3 2 5
        for(int i = 0 ; i< right-left ; i++){
           cur.next  = then.next; // 
           
           then.next  = pre.next;// 

           pre.next  =  then;// 

           then = cur.next; // 
           
        }
        return newHead.next;
    }
}

### 其他

- 19. 删除链表的倒数第 N 个结点

	- 间隔

		- public ListNode removeNthFromEnd(ListNode head, int n) {
        //删除倒数n节点
        //遍历一次链表
        var dummy = new ListNode(0);
        dummy.next = head;
        //两个指针p2先走n步,p1和p2再一起走
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        for(int i = 1;i<=n+1;i++) p2=p2.next;
        while(p2!=null){
            p1= p1.next;
            p2=p2.next;
        }
        p1.next=p1.next.next;//改变指针,删除指定节点
        return dummy.next;
    }

- 138. 复制带随机指针的链表

	- map

		- public Node copyRandomList(Node head) {
		// deep clone list, every one node have random pointer
		if (head == null)
			return null;
		var map = new HashMap<Node, Node>();
		Node h = head;// a sup head node
		while (h != null) {
			var temp = new Node(h.val);
			map.put(h, temp);// key:current node;value:val node
			h = h.next;
		}
		h = head;// reset h
		while (null != h) {
			if (h.next != null)
				map.get(h).next = map.get(h.next);
			if (h.random != null)
				map.get(h).random = map.get(h.random);
			h = h.next;
		}
		return map.get(head);
	}

- 707. 设计链表

	- class MyLinkedList {

    class Node {
        Node next = null;
        int val = 0;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size)
            return -1;
        Node curr = this.head;
        while (index-- > 0)
            curr = curr.next;
        return curr.val;
    }

    public Node getNodeAt(int index) {
        Node curr = head;
        while (index-- > 0)
            curr = curr.next;
        return curr;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.next = null;
            this.tail = node;
        }
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > this.size)
            return;
        if (index == 0)
            addAtHead(val);
        else if (index == this.size)
            addAtTail(val);
        else {
            Node prev = getNodeAt(index - 1);
            Node forw = prev.next;
            Node curr = new Node(val);
            prev.next = curr;
            curr.next = forw;
            this.size++;
        }
    }

    public void deleteFirst() {
        if (this.size == 0)
            return;
        else if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node curr = this.head;
            Node forw = curr.next;
            curr.next = null;
            this.head = forw;
        }
        this.size--;
    }

    public void deleteLast() {
        if (this.size == 0)
            return;
        else if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node secondLast = getNodeAt(this.size - 2);
            secondLast.next = null;
            this.tail = secondLast;
        }
        this.size--;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= this.size)
            return;
        if (index == 0) deleteFirst();
        else if (index == this.size - 1) deleteLast();
        else {
            Node prev = getNodeAt(index - 1);
            Node curr = prev.next;
            Node forw = prev.next.next;
            prev.next = forw;
            curr.next = null;
            this.size--;
        }
    }
}

## 二分查找及其变种

### 367. 有效的完全平方数
给定一个 正整数 num ，编写一个函数，
如果 num 是一个完全平方数，则返回 true ，否则返回 false 。

- public boolean isPerfectSquare(int num) {
// 完全平方数 1+3+5 = 9 = （3^3）
int low = 1,high = num;
// while(num>0){
// num -= low;
// low +=2;
// }
// return num==0;
//二分
while(low<=high){ // 1 <= 9 1<=4
int mid = low+ (high-low)/2; // 1+4=5
int tmp = num/mid; // 9/5=1
if(tmp==mid){ // 1==5
if(num%mid==0) return true;
low = mid+1;
} else if(tmp>mid){ // 1>5
low = mid+1;
}else { // 1<5
high = mid-1; //5-1=4
}
}
return false;
}

### 704. 二分查找

- public int search(int[] nums, int target) {
	int left = 0;
	int right = nums.length-1;
	while(left<=right){
	int mid = (left+right)>>1;
	if(nums[mid]==target) return mid;
	else if(nums[mid]<target) left = mid+1;
	else right = mid-1;
	}            
	return -1;	
    }

### 34. 在排序数组中查找元素的第一个和

- 线性扫描

	- public int[] searchRange(int[] nums, int target) {
        //找到目标值的第一次出现和最后一次出现的位置，
        //线性扫描
        int[] res = {-1,-1};
        //从左到右扫描
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target ){
                res [0] = i;
                break;
            }
        }
        if(res[0] == -1) return res;
        //从右到左扫描
        for(int j = nums.length-1;j>=0;j--){
             if(nums[j] == target ){
                res [1] = j;
                break;
            }
        }
        return res;
    }

###  35. 搜索插入位置

- 解1

	- public int searchInsert(int[] nums, int target) {
        //如果没有找到指定数字，需要返回这个数字应该插入的位置。
        int low = 0,high = nums.length-1;
        while(low<=high){
            int mid = (low+high) >> 1;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

### 74. 搜索二维矩阵

- public boolean searchMatrix(int[][] matrix, int target) {
      int i = 0,j=matrix[0].length-1;
      while(i<matrix.length&&j>=0){
        if(matrix[i][j]==target) return true;
        else if(matrix[i][j]>=target) j--;
        else i++;
      }
      return false;
    }

###  153. 寻找旋转排序数组中的最小值

-  解1

	-  public int findMin(int[] nums) {
        //给定一个特殊升序数组，即一个排序好的数组，把前边的若干的个数，一起移动到末尾，找出最小的数字。
        int start = 0,end = nums.length-1;
        while(start<end){
            int mid = (start+end)>>1;
            if(nums[mid]>nums[end]) start = mid+1;
            else end = mid;
        }
        return nums[start];
    }

### 154. 寻找旋转排序数组中的最小值 II

### 33. 搜索旋转排序数组

- public int search(int[] nums, int target) {
        //4,5,6,7,0,1,2  t=3 output=-1
        //4,5,6,7,0,1,2 t=0 output=4
        int low = 0,high = nums.length-1;
        while(low<high){
           int mid = (low+high)/2;//get mid index
           if(nums[mid]==target)return mid;// get target
           if(nums[mid]>=nums[low]){
                // ex:4 5 6 7 1 2 3 t=1  low=4 high=3 mid=7
                if(target>=nums[low]&& target<nums[mid]) high= mid-1;
                else low = mid +1;  
           }else {
                //ex: 4..7..3   mid>low
                //if target<3  must in 4-7
                if(target>nums[mid]&&target<=nums[high]) low = mid+1;
                else high = mid-1;
           }
        }
        return nums[low]==target?low:-1;
    }

### 81. 搜索旋转排序数组 II

## 二叉树

### 遍历-前序中序后序

- 144. 二叉树的前序遍历

	- 迭代
	- 递归

		- public List<Integer> preorderTraversal(TreeNode root) {
List<Integer> res = new LinkedList<>();
dfs(root,res);
return res;
}
void dfs(TreeNode root,List res){
if(root==null) return ;
res.add(root.val);
dfs(root.left,res);
dfs(root.right,res);
}

- 94. 二叉树的中序遍历

	- 迭代
	- 递归

		- class Solution {
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    dfs(res,root);
    return res;
}
// dfs 
void dfs(List res,TreeNode root){
    if(root==null) return ;
    dfs(res,root.left);
    res.add(root.val);
    dfs(res,root.right);
}
}

- 145. 二叉树的后序遍历

	- 迭代

		- public List<Integer> postorderTraversal(TreeNode root) {
        var res = new ArrayList<Integer>();
        var stack = new Stack<TreeNode>();
        TreeNode p = root,last=null;//
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();//返回并删除栈顶元素
            /**
             *   a
             * b   c 
             */
            if(p.right==null||p.right==last){
               res.add(p.val);
                last = p;
                p = null;//防止重复push
            }else{
                stack.push(p);
                p = p.right;                
            }     
        }
        return res;
    }

	- 递归

		-  public List<Integer> postorderTraversal(TreeNode root) {
        var res = new LinkedList<Integer>();
        traver(res,root);
        return res;
    }
    void traver(List<Integer> res,TreeNode root){
        if(root==null)return ;
        traver(res,root.left);
        traver(res,root.right);
        res.add(root.val);
    }

- 层序

	- 102. 二叉树的层序遍历

		- class Solution {
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> resList = new ArrayList<>();
Queue<TreeNode> queue = new LinkedList<>();
if(root!=null) queue.add(root);
while(!queue.isEmpty()){
    List<Integer> tmp = new ArrayList<>();
for(int i = queue.size();i>0;i--){ // int i = 0;i<queue.size();i++
        TreeNode node =  queue.poll();
        tmp.add(node.val);
if(node.left!=null) queue.add(node.left);
if(node.right!=null) queue.add(node.right);
}
    resList.add(tmp);
}
return resList;
}
}

	- 剑指 Offer 32 - II. 从上到下打印二叉树 II

		- class Solution {
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> resList = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if(root!=null) queue.add(root);
    while(!queue.isEmpty()){
        List<Integer> tmp = new ArrayList<>();
        for(int i = queue.size();i>0;i--){
            TreeNode node =  queue.poll();
            tmp.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        resList.add(tmp);
    }
    return resList;
}
}

### 祖先问题

- 剑指 Offer 68 - II. 二叉树的最近公共祖先

	- class Solution {
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null) return null; // 如果树为空，直接返回null
    if(root == p || root == q) return root; // 如果 p和q中有等于 root的，那么它们的最近公共祖先即为root（一个节点也可以是它自己的祖先）
    TreeNode left = lowestCommonAncestor(root.left, p, q); // 递归遍历左子树，只要在左子树中找到了p或q，则先找到谁就返回谁
    TreeNode right = lowestCommonAncestor(root.right, p, q); // 递归遍历右子树，只要在右子树中找到了p或q，则先找到谁就返回谁
    if(left == null) return right; // 如果在左子树中 p和 q都找不到，则 p和 q一定都在右子树中，右子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
    else if(right == null) return left; // 
    else return root; //否则，当 left和 right均不为空时，说明 p、q节点分别在 root异侧, 最近公共祖先即为 root
}
}

- 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先

	- class Solution {
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    /**
    要么全在左(自己或者公共)。要么全在右(自己或者公共)。或者 一边一个(根节点)，
    */
    while(root!=null){
        if(root.val>q.val && root.val >p.val) root = root.left;
        else if(root.val <q.val && root.val < p.val) root = root.right;
        else break;
    }
    return root;
}
}

### 二叉树的属性

- 深度 高度 直径

	- 剑指 Offer 55 - I. 二叉树的深度

		- bfs 实现

			- class Solution {
public int maxDepth(TreeNode root) {
    if(null == root ) return 0;
    List<TreeNode> queue  = new LinkedList<>();
    queue.add(root);
    int res = 0;
    while(!queue.isEmpty()){
  List<TreeNode>   tmp = new LinkedList<>();
        for(TreeNode node : queue){
            if(node.left != null) tmp.add(node.left);
            if(node.right != null) tmp.add(node.right);
        }
        queue = tmp;
        res++;
    }
    return res;
}
}

		- dfs实现

			- class Solution {
public int maxDepth(TreeNode root) {
  // DFS
     if(root == null) return 0;
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}
}

	- 543. 二叉树的直径

		- class Solution {
int res =0;
public int diameterOfBinaryTree(TreeNode root) {
 dfs(root);
return res;
}
int dfs(TreeNode node){
if(node == null) return 0 ;
int L = dfs(node.left);
int R  = dfs(node.right);
res = Math.max(res,L+R);
return Math.max(L,R)+1;
}
}

	- 111. 二叉树的最小深度

		- 递归

			-  public int minDepth(TreeNode root) {
        // 返回从根节点到叶子节点最小深度。
       if(root==null) return 0;
       if(root.left==null) return minDepth(root.right)+1;//节点左为空 选择右边的
       if(root.right==null) return minDepth(root.left)+1;//和上面反过来
       return Math.min(minDepth(root.left),minDepth(root.right))+1;//如果这个节点左右都不为空就选小的
    }

- 节点

	- 222. 完全二叉树的节点个数

		- 暴力递归

			-  public int countNodes(TreeNode root) {
       //给一个完全二叉树，输出它的节点个数。
      if(root==null) return 0;
      return countNodes(root.left)+countNodes(root.right)+1;
    }

	-  404. 左叶子之和

		-  递归

			- public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        int leftValue = sumOfLeftLeaves(root.left);
        int rightValue = sumOfLeftLeaves(root.right);

        int midValue = 0;
        //通过父节点判断是否是左节点
        //左子树左叶子之和，和 右子树左叶子之和
        if(root.left!=null && root.left.left==null && root.left.right==null)
            midValue = root.left.val;
        int sum = midValue + leftValue + rightValue;
        return sum;
    }

		- 迭代

- 验证 平衡 对称 镜像 父子

	- 剑指 Offer 55 - II. 平衡二叉树(深度不超过1)
110. 平衡二叉树 给定一个二叉树，
判断一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。

		- class Solution {
public boolean isBalanced(TreeNode root) {
    /**
    先计算此树的深度，和之前[剑指 Offer 55 - I. 二叉树的深度]一样
    然后比较每一个节点的左右差
    */
    //计算每一个节点的左右节点的深度
    if(root==null) return true;
    return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1 && isBalanced(root.left)&& isBalanced(root.right);
 }
    // 计算节点深度
   int maxDepth(TreeNode root){
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    } 
}

	- 剑指 Offer 28. 对称的二叉树

		- class Solution {
public boolean isSymmetric(TreeNode root) {
    /**
    递归遍历，也可以 BFS，虽然更加麻烦一点，
    需要注意root == null的情况
    */
if(root==null) return true:
   return isSymmetric(root.left,root.right);
}
boolean isSymmetric(TreeNode left,TreeNode right){
    if(null == left && null == right) return true;    
    if(null == left || null == right || left.val != right.val ) return false;
    // 如果是对称的 那么互换位置也是一样的
    return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
}
}

	- 572. 另一个树的子树
两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
s 的一个子树包括 s 的一个节点和这个节点的所有子孙。
s 也可以看做它自身的一棵子树。

		- class Solution {
//都为null 说明相等 当有一方已经遍历完，但另一颗还未遍历完时，返回false
public boolean isSubtree(TreeNode root, TreeNode subRoot) {

if(null == root || subRoot == null) return false;
if(null==root&&subRoot==null) return true;
/*
t为s的子树，共有三种情况：1. t和s相同；2. t是s的某个左子树；3. t是s的某个右子树
*/
return isSame(root,subRoot) || isSame(root.left,subRoot) || isSame(root.right,subRoot);
}
boolean isSame(TreeNode q,TreeNode p){
if(q == null && p == null) return true;
if(q == null || p == null) return false;
if(q.val != p.val) return false;
return isSame(q.left,p.left) && isSame(q.right,p.right);
}
}

- DFS 路径

	- 257. 二叉树的所有路径

		- 递归

			-  public List<String> binaryTreePaths(TreeNode root) {
        // 返回所有从根节点到叶子节点的路径。
        var res = new ArrayList<String>();
        if(root!=null) searchTP(root,"",res);
        return res;
    }
    void searchTP(TreeNode root,String temp,List<String> res){
        /**
         *  1
         *2   3  
         */
        if(root.left==null && root.right==null) res.add(temp+root.val);//root=1 不满足
        // 1.left!=null 递归,然后 temp+root.val+"->" 就变成 ""+1+"->" = "1->" 然后root=2  temp+val 变成了  "1->"+2  = "1->2" 
        if(root.left!=null)searchTP(root.left,temp+root.val+"->",res);
        if(root.right!=null)searchTP(root.right,temp+root.val+"->",res);
    }

		- BFS

	- 112. 路径总和

		- public boolean hasPathSum(TreeNode root, int targetSum) {
        //给定一个sum，判断是否有一条从根节点到叶子节点的路径，该路径上所有数字的和等于sum
        if(root==null) return false;
        if(root.left==null&&root.right==null&&root.val==targetSum) return true;
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
    }

- 搜索

	- 513. 找树左下角的值

		- BFS

			- public int findBottomLeftValue(TreeNode root) {
        /**找到最后一行最左边的值
         *    1
         * 2/   \3
         *     4/
         *输出4 
         */
        var queue = new LinkedList<TreeNode>();
        if(root!=null) queue.add(root);
        int res = 0;
        while(!queue.isEmpty()){
          int size = queue.size();
          for(int i = 0;i<size;i++){
            var node = queue.poll();
            if(i==0)res = node.val;
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
          }
        }
        return res;
    }

### 二叉树的修改和构造

- 翻转二叉树 

	- 剑指 Offer 27. 二叉树的镜像

		- class Solution {
public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left =  mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
}
}

	- 226. 翻转二叉树

		- class Solution {
public TreeNode invertTree(TreeNode root) {

if(root==null) return null;
    TreeNode temp = root.left;
    root.left =  invertTree(root.right);
    root.right = invertTree(temp);
return root;
}
}

- 恢复 构造

	- 105.二叉树的中序遍历和后序遍历还原二叉树。

		- 递归

			- public TreeNode buildTree(int[] preorder, int[] inorder) {
        //前序中序构造函二叉树 
        //前:1 2 3 4 5 
        //中:4 2 5 1 3
        return   buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    TreeNode buildTree(int[] preorder,int preLeft,int preRight,int[] inorder,int inLeft,int inRight){
        //分割，构造左子树，构造右子树
        //终止条件
        if(preLeft>preRight||inLeft>inRight) return null;
        //寻找根节点
        int index = preLeft,root_val = preorder[preLeft];//index用来在中序中寻找root的下标
        var root = new TreeNode(root_val);//构造root
        for(int i = inLeft;i<=inRight;i++){
            //寻找中序中root的下标
            if(inorder[i]==root_val){
                index = i;
                break;
            }
        }
        //递归构造左右子树index=3   
        //preLeft=0,preLeft+(index-inLeft)=0+(3-0),inLeft=0,index-1 =3-1
        root.left = buildTree(preorder,preLeft+1,preLeft+(index-inLeft),inorder,inLeft,index-1);
        root.right = buildTree(preorder,preLeft+(index-inLeft)+1,preRight,inorder,index+1,inRight);
        return root;
    }

	- 108. 将有序数组转换为二叉搜索树

		- class Solution {
public TreeNode sortedArrayToBST(int[] nums) {
return dfs(nums,0,nums.length-1);
}
TreeNode dfs(int[] nums,int leftIndex , int  rightIndex){
if(leftIndex > rightIndex) return null;
    TreeNode root = new TreeNode(nums[(leftIndex+rightIndex)/2]);
    root.left =  dfs(nums,leftIndex,(leftIndex+rightIndex)/2-1);
    root.right = dfs(nums,(leftIndex+rightIndex)/2+1,rightIndex);
return root;
}
}

	- 106. 从中序与后序遍历序列构造二叉树

		- 递归

			- public TreeNode buildTree(int[] inorder, int[] postorder) {
        //二叉树的中序遍历和后序遍历还原二叉树和105差不多
        return buildeTree(inorder,0,inorder.length,postorder,0,postorder.length);
    }
    TreeNode buildeTree(int[] inorder,int i_start,int i_end,
                        int[] postorder,int p_start, int p_end){
        if(i_end - i_start < 1) return null;
        if(i_end - i_start ==1) return new TreeNode(inorder[i_start]);
        int root_val = postorder[p_end-1];//构造根节点
        var root = new TreeNode(root_val);
        int root_index = 0;//在中序中根节点的下标
        for(int i = i_start;i<i_end;i++){
            if(inorder[i]==root_val){
                root_index = i;
                break;
            }
        }
        root.left =buildeTree(inorder,i_start,root_index,
                postorder, p_start, p_start + (root_index - i_start));
        root.right = buildeTree(inorder, root_index + 1, i_end,
                postorder, p_start + (root_index - i_start), p_end - 1);
        return root;
    }

		- 栈

			- public TreeNode buildTree(int[] inorder, int[] postorder) {
        //中序 后序 栈
        if(postorder.length==0) return null;
        var roots = new Stack<TreeNode>();//根节点栈
        int post = postorder.length-1;//后序长度
        int in = inorder.length-1;//中序长度
        var curRoot = new TreeNode(postorder[post]);//构造根节点
        var root = curRoot;
        roots.push(curRoot);//根节点
        post--;//后序长度减1
        //右 右  
        while(post>=0){
            if(curRoot.val==inorder[in]){
                while(!roots.isEmpty()&&roots.peek().val == inorder[in]){
                    curRoot = roots.peek();
                    roots.pop();
                    in--;
                }
                curRoot.left = new TreeNode(postorder[post]);//出现相等构造左子节点
                curRoot = curRoot.left;
                roots.push(curRoot);
                post--;//指针从后往前               
            }else{
                //构造右子树
                curRoot.right = new TreeNode(postorder[post]);
                curRoot = curRoot.right;
                roots.push(curRoot);
                post--;//指针从后往前
            }
        }
        return root;
    }

	- 654. 最大二叉树

		- 队列

			- /**
     * 二叉树的根是数组中的最大元素。 
     * 左子树是通过数组中最大值左边部分构造出的最大二叉树。 
     * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
     * https://img-blog.csdnimg.cn/20210204154534796.png
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        //找到最大值，分割数组，构造左树，构造右树   前序递归
        if(nums==null||nums.length==0)return null;
        var stack = new ArrayDeque<TreeNode>(nums.length>>1);//构造队列 长度数组的一半
        for(int num : nums){
            var cur = new TreeNode(num);//构造头节点
            while(!stack.isEmpty()&&stack.peek().val<num)
                cur.left=stack.pop();//左
            if(!stack.isEmpty())
                stack.peek().right = cur;//右
            stack.push(cur);
        }
        return stack.peekLast();
    }

- 第k大，顺序大 倒序大等等

	- 剑指 Offer 54. 二叉搜索树的第k大节点

		- dfs

			- class Solution {
public int kthLargest(TreeNode root, int k) {
    /**
    中序遍历每一个节点 存入数组中，排序 取出来第k个元素
    倒中序 （二叉搜索树的一个特性：通过中序遍历所得到的序列，就是有序的。）
    */
    List<Integer> list = new ArrayList<>();
    dfs(root,list);
    return list.get(list.size()-k);
}
  // 中序遍历
void dfs(TreeNode root,List list){
    if(root == null) return;
    dfs(root.left,list);
    list.add(root.val);
    dfs(root.right,list);
}
}

- 合并

	- 617. 合并二叉树

		- class Solution {
public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    /**
    DFS 或者是BFS  同时递归两树，终止条件是 node1和node2同时为null
    把 树2加到树1上面
    */
    if(root1==null||root2==null) return root1==null?root2:root1;
    return dfs(root1,root2);
}
TreeNode dfs(TreeNode r1,TreeNode r2){
    if(r1==null||r2==null) return r1==null?r2:r1;
    r1.val += r2.val;
    r1.left = dfs(r1.left,r2.left); // 都是从根节点开始的 把 r1和r2的值相加 放到r1上面去
    r1.right = dfs(r1.right,r2.right);// 从根节点开始的
    return r1;
}
}

### 分治树分治

- 二叉搜索树

	- 98. 验证二叉搜索树

		- 递归

			-  TreeNode max;
    /**
     * 验证二叉树搜索
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        //中序递归，看是否有序，二叉树搜索中不能有重复元素,并且左边小于右边
        if(root==null) return true;
        boolean isLeft = isValidBST(root.left);
        if(!isLeft) return false;
        if(max!=null&&root.val<=max.val) return false;
        max = root;
        boolean isRight = isValidBST(root.right);
        return isRight;
    }

		- 迭代

			- TreeNode max;
    /**
     * 验证二叉树搜索
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        //迭代
        if(root==null)return true;
        var stack = new Stack<TreeNode>();
        TreeNode pre = null;
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;//左节点
            }
            var pop = stack.pop();//stack全是左树节点
            if(pre!=null&&pop.val<=pre.val) return false;
            pre = pop;
            root=pop.right;//右节点
        }
        return true;
    }

- 104. 二叉树的最大深度

	- 递归

		-  /**
     * 二叉树的最大深度
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

- 110. 平衡二叉树

	- 先求高度

		-  /**
     * 判断一棵树是否是平衡二叉树
     * 它是一棵空树或它的左右两个子树的高度差的绝对值不超过 1，并且左右两个子树都是一棵平衡二叉树。
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        if(Math.abs(left-right)>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    //先求高度
    int treeDepth(TreeNode root){
        if(root==null) return 0;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return Math.max(left,right)+1;
    }

	- 优化上面的解法

		- /**
     * 判断一棵树是否是平衡二叉树
     * 它是一棵空树或它的左右两个子树的高度差的绝对值不超过 1，并且左右两个子树都是一棵平衡二叉树。
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        return treeDepth(root)!=-1;
    }
    //优化，避免求高度重复调用 提取返回
    int treeDepth(TreeNode root){
        /**
        if(root==null) return 0;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return Math.max(left,right)+1;
        */
        if(root==null) return 0;
        int left = treeDepth(root.left);
        if(left==-1) return -1;
        int right = treeDepth(root.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left, right)+1;
    }

- 124. 二叉树中的最大路径和

	- 分治法

		- 如果考虑每次都经过根节点的情况

			-  /**
     * 考虑一条路径，可以从任意节点开始，每个节点最多经过一次，问经过的节点的和最大是多少。
     *      3
     *    -2   1
     *   3  4
     * 考虑每次都经过根节点的情况
     * 左3+(-2)+3 或者是  4+(-2)+3
     * 右 1+3
     * @param root
     * @return
     */
    public int maxPathSum(TreeNode root) {
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        return root.val+left+right;
    }
    int helper(TreeNode root){
        if(root==null) return 0;
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        return root.val +Math.max(left, right);
    }

		- /**
     * 考虑一条路径，可以从任意节点开始，每个节点最多经过一次，问经过的节点的和最大是多少。
     *      3
     *    -2   1
     *   3  4
     * 考虑经过根节点的情况，考虑不经过根节点的情况
     * @param root
     * @return
     */
    int max = Integer.MIN_VALUE;//全局变量来保存当前最大值
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    int helper(TreeNode root){
        if(root==null)return 0;
        int left = Math.max(helper(root.left), 0);//如果是负的 就不考虑这个节点
        int right = Math.max(helper(root.right), 0);
        max = Math.max(max,root.val+left+right);//包含当前根节点的最大值
        return root.val+Math.max(left, right);//返回当前根节点包括左子 或者返回 根加右子的路径和
    }

- 236. 二叉树的最近公共祖先

	- 分治递归

		- /**
     * 给定二叉树的两个节点，找出两个节点的最近的共同祖先。
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //分治
        if (root == null || root == p || root == q ) {
            return root;
        } 
        TreeNode leftCommonAncestor =  lowestCommonAncestor(root.left, p, q); 
        TreeNode rightCommonAncestor =  lowestCommonAncestor(root.right, p, q); 
        //在左子树中没有找到，那一定在右子树中
        if(leftCommonAncestor == null){
            return rightCommonAncestor;
        }
        //在右子树中没有找到，那一定在左子树中
        if(rightCommonAncestor == null){
            return leftCommonAncestor;
        }
        //不在左子树，也不在右子树，那说明是根节点
        return root;        
    }

	- 栈

		- /**
     * 给定二叉树的两个节点，找出两个节点的最近的共同祖先。
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 栈
        if (root == p || root == q)
            return root;
        var stack = new Stack<TreeNode>();
        var cur = root.left;
        // 判断两个节点是否在左树
        boolean pLeft = false;
        boolean qLeft = false;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (cur == p)pLeft = true;// p在左
            if (cur == q)qLeft = true;//q在左
            cur = cur.right;//在右
        }
        // 两个节点都在左子树
        if (pLeft && qLeft) {
            return lowestCommonAncestor(root.left, p, q);
            // 两个节点都在右子树
        } else if (!pLeft && !qLeft) {
            return lowestCommonAncestor(root.right, p, q);
        }
        // 一左一右
        return root;
    }

- 分治法模板

	- 先分别处理局部，再合并结果

分治法模板
1.递归返回条件
2.分段处理
3.合并结果

public ResultType traversal(TreeNode root) {
    // null or leaf
    if (root == null) {
        // do something and return
    }
    // Divide
    ResultType left = traversal(root.Left)
    ResultType right = traversal(root.Right)
    // Conquer
    ResultType result = Merge from left and right
    return result
}

### BFS应用

- 102. 二叉树的层序遍历

	- DFS

		-  /**
     * 二叉树的层次遍历，输出一个 list 的 list。
     * 中序DFS
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        var res = new ArrayList<List<Integer>>();
        DFS(root,0,res);
        return res;
    }
    private void DFS(TreeNode root,int level,List<List<Integer>> res){
        if(root==null) return;
        //level是当前层索引
        if(res.size()<=level) res.add(new ArrayList<Integer>());
        res.get(level).add(root.val);
        DFS(root.left,level+1,res);
        DFS(root.right,level+1,res);
    }

	- BFS

		- /**
     * 二叉树的层次遍历，输出一个 list 的 list。
     * BFS
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        var queue = new LinkedList<TreeNode>();
        var res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            var temp = new LinkedList<Integer>();
            int size = queue.size();
            for(int i = 0;i<size;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
            }
            res.add(temp);
        }
        return res;
    }

- 107. 二叉树的层序遍历 II

给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层序遍历为：

[
  [15,7],
  [9,20],
  [3]
]

	- DFS和102一样

		- /**
     *树的层次遍历，从底部，一层一层的输出。
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        var res = new ArrayList<List<Integer>>();
        dfs(root,0,res);
        return res;
    }
    void dfs(TreeNode root,int level,List<List<Integer>> res){
        if(root==null)return;
        if(res.size()<=level) res.add(0,new ArrayList<>());//从下往上 每次增加list从头增加
        res.get(res.size()-1-level).add(root.val);//
        dfs(root.left,level+1,res);
        dfs(root.right,level+1,res);
    }

	- BFS

		- /**
     *树的层次遍历，从底部，一层一层的输出。
     *BFS
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        var queue = new LinkedList<TreeNode>();//放每一层的节点
        var res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int curLevelSize = queue.size();
            var temp = new LinkedList<Integer>();
            for(int i = 0;i<curLevelSize;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left); 
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                temp.add(queue.poll().val);//返回并删除队首元素
            }
            res.add(0,temp);//注意这里是从队首添加的，和102的区别
        }
        return res;
    }

- 103. 二叉树的锯齿形层序遍历
给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。

例如：
给定二叉树 [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回锯齿形层序遍历如下：

[
  [3],
  [20,9],
  [15,7]
]

	- BFS+双栈

		-  /**
     * 相当二叉树的层次遍历 从左到右 再 从右到左
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        var res = new ArrayList<List<Integer>>();
        if (root == null)
            return res;
        TreeNode curHead = root;
        // 两个栈 一个用来从左到右  一个用来存储 从右到左
        var stack1 = new Stack<TreeNode>();
        var stack2 = new Stack<TreeNode>();
        stack1.push(curHead);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            var temp = new ArrayList<Integer>();
            //从左到右
            while (!stack1.isEmpty()) {
                curHead = stack1.pop();
                temp.add(curHead.val);
                if (curHead.left != null)
                    stack2.push(curHead.left);
                if (curHead.right != null)
                    stack2.push(curHead.right);
            }
            res.add(temp);
            temp = new ArrayList<Integer>();// 需要一个新的temp
            ////从右到左
            while (!stack2.isEmpty()) {
                curHead = stack2.pop();
                temp.add(curHead.val);
                if (curHead.right != null)
                    stack1.push(curHead.right);
                if (curHead.left != null)
                    stack1.push(curHead.left);
            }
            if(!temp.isEmpty()) res.add(temp);
        }
        return res;
    }

### 二叉搜索树应用

- 701. 二叉搜索树中的插入操作

给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。

注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回 任意有效的结果 。
示例 1：
输入：root = [4,2,7,1,3], val = 5
输出：[4,2,7,1,3,5]
解释：另一个满足题目要求可以通过的树是：

	- 递归

		- //递归终止条件 返回新节点，就把这个返回的节点和上层节点建立了关联
        /**
         *     4
         *    2  5 
         *   1
         * val=3
         *    4
         *   2  5
         *  1 3 
         */
        if(root==null) return new TreeNode(val);
        //搜索树的是有方向的  中序是升序
        if(root.val>val) root.left = insertIntoBST(root.left, val);
        if(root.val<val) root.right = insertIntoBST(root.right, val);
        return root;
    }

	- 迭代

- 属性

	- 700. 二叉搜索树中的搜索
给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。

例如，

给定二叉搜索树:

        4
       / \
      2   7
     / \
    1   3

和值: 2
你应该返回如下子树:

      2     
     / \   
    1   3


		- 递归
		- 迭代，不使用栈

			-  /**
     * 二叉搜索树是一个有序树
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(val<root.val) root = root.left;
            else if(val>root.val) root = root.right;
            else return root;
        }
        return root;
    }

	- 98. 验证二叉搜索树

		- 迭代

			- /**
     * 验证二叉搜索树
     * 中序是升序的,并且根节点的所有左子小于根,所有右大于根
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        //迭代
        if(root==null)return true;
        //用栈的特点
        /**
         * root = 2
         *  2
         * 1 3
         */
        var stack = new Stack<TreeNode>();
        TreeNode pre = null;//记录上一个遍历的节点
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);//把当前根节点放入栈 2
                root=root.left;//左节点
            }
            var pop = stack.pop();//stack全是从根开始的左树节点 栈顶是1 栈底是2
            if(pre!=null&&pre.val>=pop.val) return false;//因为中序是从小到大,直接比较相邻的
            pre = pop;//把当前栈中的节点给pre,理解为前一个节点
            root=pop.right;//有了pre这个前一个节点,这里就是取出下一个节点 也就是 3
        }
        return true;
    }

		- 递归

			- /**
     * 验证二叉搜索树 中序是升序的,并且根节点的所有左子小于根,所有右大于根
     * 
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        // 递归
        return isValidBST(Long.MIN_VALUE, Long.MAX_VALUE, root);
    }

    /**
     * 
     * @param rightValue
     * @param leftValue
     * @param root
     * @return
     */
    boolean isValidBST(long rightValue, long leftValue, TreeNode root) {
        if (null == root)
            return true;
        if (root.val >= leftValue || root.val <= rightValue)
            return false;
        return isValidBST(rightValue, root.val, root.left) && isValidBST(root.val, leftValue, root.right);
    }

	- 530. 二叉搜索树的最小绝对差

		- 迭代

			- TreeNode  pre = null;//保存上一个节点
    Stack<TreeNode> stack;
    /**
     * 给你一棵所有节点为非负值的二叉搜索树
     * 计算树中任意两节点的差的绝对值的最小值。
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        //迭代
        if(null==root) return 0;
        stack = new Stack<>();
        TreeNode cur = root;
        int res = Integer.MAX_VALUE;
        while(cur!=null || !stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);//把当前节点放入栈中
                cur = cur.left;
            }else{
                cur = stack.pop();
                if(pre!=null)
                    res = Math.min(res, cur.val-pre.val);//当前节点-上一个节点
                pre = cur;//把当前节点给pre保存下来 给后面来比较
                cur = cur.right;
            }

        }
        return res;
    }

		- 递归

			-  TreeNode pre = null;//用来保存前一个节点
    int res = Integer.MAX_VALUE;
    /**
     * 给你一棵所有节点为非负值的二叉搜索树
     * 计算树中任意两节点的差的绝对值的最小值。
     * @param root
     * @return
     */
    public int getMinimumDifference(TreeNode root) {
        if(root==null)return 0;
        getMini(root);
        return res;
    }
    /**
     * 中序遍历
     * @param root
     */
    void getMini(TreeNode root){
        if(root==null)return;
        getMini(root.left);
        if(pre!=null){
            res = Math.min(res, root.val-pre.val);//当前节点-之前保存的上一个节点
        }
        pre = root;//保存上一个节点
        getMini(root.right);
    }

	- 501. 二叉搜索树中的众数
思考:如果不是二叉树搜索树怎么解决?

		- 递归

			- int curMaxCount;// 当前出现最大频率
    int count;// 出现频率
    TreeNode pre;// 保存上一个节点
    ArrayList<Integer> tempList;// 临时保存节点val

    /**
     * 一个有相同值的二叉搜索树（BST） 找出 BST 中的所有众数（出现频率最高的元素） 2 1 2
     */
    public int[] findMode(TreeNode root) {
        tempList = new ArrayList();
        count = 0;
        curMaxCount = 0;
        pre = null;
        findMode1(root);
        int[] res = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++)
            res[i] = tempList.get(i);
        return res;
    }

    void findMode1(TreeNode root) {
        if (null == root)
            return;

        findMode1(root.left);

        int curValue = root.val;

        if (null == pre || curValue != pre.val)
            count = 1;
        else
            count++;
        if (count > curMaxCount) {
            tempList.clear();// 清空之前所有
            tempList.add(curValue);//添加list中
            curMaxCount = count;//交换最大值
        } else if (count == curMaxCount) {// 出现次数相同
            tempList.add(curValue);//直接放入
        }
        pre = root;
        findMode1(root.right);
    }

		- 迭代

			- /**
     * 迭代 一个有相同值的二叉搜索树（BST） 找出 BST 中的所有众数（出现频率最高的元素） 2 1 2
     * 定义 下面栈写法stack:1 2 3  从左到右表示 从栈底到栈顶
     * @param root
     * @return
     */
    public int[] findMode(TreeNode root) {
        /**
         *  2 
         * 1 2
         */
        TreeNode pre = null;// 临时存放上一个节点
        var count = 0;
        var maxCount = 0;// 当前最大值
        var stack = new Stack<TreeNode>();
        var list = new ArrayList<Integer>();
        //int[] res = new int[list.size()];
        TreeNode cur = root;// 当前节点  2
        while (!stack.isEmpty() || Objects.nonNull(cur)) {
            if (cur != null) {
                stack.push(cur);// 把当前节点放入栈中 stack:2 1
                cur = cur.left;// cur = 1 cur=null
            } else {
                cur = stack.pop();// 栈顶出栈，如1 赋给当前节点cur 
                if (pre == null || pre.val != cur.val)// 此时pre是指向上一个节点,如1 cur是2
                    count = 1;
                else
                    count++;
                if(count > maxCount){//当前count并之前的都要大
                    list.clear();//清空list
                    list.add(cur.val);// add.(1) 
                    maxCount = count;
                }else if(count == maxCount){
                    list.add(cur.val);
                }
                pre = cur;//把cur保存到pre，cur作为中序 就成为下一个节点
                cur = cur.right;//如果cur.right==null继续出栈，然后不为null 遍历入栈，
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

	- 538. 把二叉搜索树转换为累加树

		- 递归

			- /**
     * 给出二叉 搜索 树的根节点，该树的节点值各不相同，
     * 将其转换为累加树（Greater Sum Tree），
     * 使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和
     * 示例 inpit:[3,2,4,1]==反中序遍历=>[4,3,2,1]=> output:[7,9,4,10]
     *     3
     *   2    4
     * 1
     * 类似于数组从后向前累加 [1,2,3]=>[6,5,3]
     * 累加的顺序是右中左，反中序遍历这个二叉树，然后顺序累加
     * @param root
     * @return
     */
    int sum ;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        converBST1(root);   
        return root;
    }
    //反中序
    void converBST1(TreeNode root){
        if(root==null) return ;
        converBST1(root.right);
        //累加
        sum +=root.val;
        //重新给当前节点赋值
        root.val=sum;
        converBST1(root.left);
    }

		- 迭代
中序模板题

			- https://programmercarl.com/%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E8%BF%AD%E4%BB%A3%E9%81%8D%E5%8E%86.html#%E5%89%8D%E5%BA%8F%E9%81%8D%E5%8E%86-%E8%BF%AD%E4%BB%A3%E6%B3%95

- 结构

	- 108. 将有序数组转换为二叉搜索树

		- 引题

			- 106.从中序与后序遍历序列构造二叉树
654.最大二叉树中其实已经讲过了，如果根据数组构造一颗二叉树。
701.二叉搜索树中的插入操作
450.删除二叉搜索树中的节点

		- 递归,左闭右和

			- /**
     * 给一个升序数组,转成高度平衡二叉树搜索树,
     * 每个节点 的左右两个子树的高度差的绝对值不超过 1
     * [-10,-3,0,5,9]=>[0,-3,9,-10,null,5]或[0,-10,5,null,-3,null,9]
     *      0
     *    -3  9
     *  -10  5
     * 数组=>树本质就是寻找分割点，分割点作为当前节点，然后递归左区间和右区间。
     * 取中间值写法 int = left+((right-left)/2) 这样写是防止数组越界,但这样写
     * 当数组为偶数时间，会取靠左边的数
     * 所以数组是可以这样分为 [left,right) 左闭右和  (left,right]
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(0,nums.length,nums);
    }
    //分割 构造
    TreeNode sortedArrayToBST(int left,int right,int[] nums){
         if(left>=right) return null;
         //当前  
         if(right-left==1) return new TreeNode(nums[left]);
         //左闭右和
         int mid = left +((right-left)/2);
         //构造根
         TreeNode root = new TreeNode(nums[mid]);
         //递归构造root 的left  right
         root.left = sortedArrayToBST(left, mid, nums);
         root.right = sortedArrayToBST(mid+1, right, nums);
         return root;
    }

		- 递归

			- public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(0,nums.length,nums);
    }
    //分割 构造
    TreeNode sortedArrayToBST(int left,int right,int[] nums){
         if(left==right) return null;
        //包括左边界  不包括右边界
         int mid = (left+right)>>>1;
         TreeNode root = new TreeNode(nums[mid]);
         root.left = sortedArrayToBST(left, mid, nums);
         root.right = sortedArrayToBST(mid+1, right, nums);
         return root;
    }

		- 迭代

			- /**
     * 迭代
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        //存放节点的队列
        Queue<TreeNode> queue = new LinkedList<>();
        //储存0开始到中间值 的左边索引区间
        Queue<Integer> leftQ = new LinkedList<>();
        //储存 中间值 到 num-1 的右边 索引区间
        Queue<Integer> rightQ = new LinkedList<>();
        TreeNode root = new TreeNode(-1);
        queue.offer(root);
        leftQ.offer(0);
        rightQ.offer(nums.length-1);
        while(!queue.isEmpty()){
            int left  = leftQ.poll();
            int right = rightQ.poll();
            int mid = (left+right)>>>1;
            var node = queue.poll();
            //mid对应的为中间节点
            node.val = nums[mid];
            
            //处理左区间
            if(left<=mid-1){
                node.left = new TreeNode(-1);
                queue.offer(node.left);
                leftQ.offer(left);
                rightQ.offer(mid-1);
            }
            //处理右区间
            if(right>=mid+1){
                node.right = new TreeNode(-1);
                queue.offer(node.right);
                leftQ.offer(mid+1);
                rightQ.offer(right);
            }
        }
        return root;
    }

	- 450. 删除二叉搜索树中的节点

		- 递归

			- /**
     * 给定一个二叉搜索树的根节点 root 和一个值 key，
     * 删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。
     * 返回二叉搜索树（有可能被更新）的根节点的引用。
     * [5,3,6,2,4,null,7] key=3
     *          5               5            5
     *        3   6  ===>     4   6    或  2    6
     *      2  4    7       2       7        4   7
     * 1.没有左右子树，直接删除即可 返回null
     * 2.有左无右，删除左，左补位，返回左
     * 3.有右无左，删除右，右补位，返回右
     * 4.有左有右，将删除节点的左子树放到删除节点的右子树的最左面节点的左孩子的位置,返回删除节点的右节点
     * 5.没找到，直接返回
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        root = delete(root,key);
        return root;
    }
    TreeNode delete(TreeNode root,int key){
        //为空直接返回
        if(root==null) return null;
        
        if(root.val > key){
            root.left = delete(root.left,key);
        }else if(root.val < key){
            root.right = delete(root.right,key);
        }else{
            if(root.left == null) return root.right;
            if(root.right==null) return  root.left;
            var temp = root.right;
            //寻找当前最左节点
            while(temp.left!=null){
                temp = temp.left;
            }
            root.val = temp.val;
            root.right = delete(root.right, temp.val);
        }
        return root;
    }

	- 669. 修剪二叉搜索树

		- 递归

			- /**
     * 
     * 递归
    给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。
    通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L) 。
    你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点
    L =  1;R = 3 
          3     =》       4
       0    4           3
         2            2        
       1            1
    */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(null==root) return null;
        //向右找
        if(root.val<low) return trimBST(root.right, low, high);
        //向左找
        if(root.val>high) return trimBST(root.left, low, high);
        // root在 [low,high] 范围内
        root.left  = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
			- 迭代

				- /**
     * 
     * 迭代
    给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。
    通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L) 。
    你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点
    L =  1;R = 3 
          3     =》       4
       0    4           3
         2            2        
       1            1
    */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null) return null;
        // root !=null 防止空指针
        while ( root!=null && (root.val<low || root.val>high)){
            if(root.val<low) root = root.right;
            if(root.val>high) root = root.left;   
        }
        TreeNode temp = root;
        //删除左子树无效节点
        while(temp !=null){
            while(temp.left !=null && temp.left.val <low){
                temp.left = temp.left.right;
            }
            temp = temp.left;
        }
        //删除右子树无效节点
        temp = root;
        while(temp !=null){
            while(temp.right!=null && temp.right.val > high){
                temp .right = temp.right.left;
            }
            temp = temp.right;
        }
        return root;
    }

- 祖先

	- 235. 二叉搜索树的最近公共祖先

普通二叉树求最近公共祖先需要使用回溯，从底向上来查找，二叉搜索树就不用了，因为搜索树有序（相当于自带方向），那么只要从上向下遍历就可以了。

		- 递归

			- /**
     * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
     * 公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。
     * [6,2,8,0,4,7,9,null,null,3,5]
     *             6
     *          2       8
     *        0   4    7   9
     *          3   5
     * p=2 q=8 out=6
     * p=2 q=4 out=2
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 左边
        if(root.val > p.val && root.val > q.val) lowestCommonAncestor(root.left, p, q);
        // 右边
        if(root.val < p.val && root.val < q.val) lowestCommonAncestor(root.right, p, q);
        return root;
    }

		- 迭代

	- 236. 二叉树的最近公共祖先

		- 递归

			- /**
     * 给定二叉树的两个节点，找出两个节点的最近的共同祖先。
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 栈
        if (root == p || root == q)
            return root;
        var stack = new Stack<TreeNode>();
        var cur = root.left;
        // 判断两个节点是否在左树
        boolean pLeft = false;
        boolean qLeft = false;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (cur == p)pLeft = true;// p在左
            if (cur == q)qLeft = true;//q在左
            cur = cur.right;//在右
        }
        // 两个节点都在左子树
        if (pLeft && qLeft) {
            return lowestCommonAncestor(root.left, p, q);
            // 两个节点都在右子树
        } else if (!pLeft && !qLeft) {
            return lowestCommonAncestor(root.right, p, q);
        }
        // 一左一右
        return root;
    }

## 动态规划

### 基础

- 剑指 Offer 10- I. 斐波那契数列

	- class Solution {
    public int fib(int n) {
        // 递归
        // 1+1+2+3+5+8
        // if(n<=1) return n;
        // return fib(n-2)+fib(n-1);
        // 动态规划
        if(n<=1) return n;
        int[] arr =new int[n+1];
        arr[0] = 0;arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i]  = (arr[i-2]+arr[i-1])%1000000007;
        }
        return arr[n];
    }
}

- 剑指 Offer 10- II. 青蛙跳台阶问题
一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶

	- class Solution {
    public int numWays(int n) {
        /**
        n = 1     1    
        n = 2    1+1
        n = 3    1+2 2+1  1+1+1
        */
        if(n<=1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3;i<=n;i++){
            dp[i] = dp[i-1] +dp[i-2];
            dp[i] =  dp[i]%1000000007;
        }
        return dp[n];
    }
}

- 70. 爬楼梯

	- 方法1

		- //  1 2 3 5 8
public int climbStairs(int n) {
int[] dp = new int[n+1];
if(n<=1) return 1;
    dp[1]= 1;dp[2] = 2;
for(int i = 3;i<=n;i++){
        dp[i] = dp[i-1] +dp[i-2];
    }
return dp[n];
}

	- 方法2

		- public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n ==2) return 2;
        int a = 1,b= 2,target;
        for( int i = 3;i<=n;i++){
            target = a;
            a = b;
            b = target + b;
        }
        return b;
    }

- 746. 使用最小花费爬楼梯

	- 方法1

		- /**
     * 使用最小花费爬楼梯
     * [1,2,3] 一共三个楼梯，每一个楼梯的值表示向上走一步或者两步的体力值
     * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
     * [10,15,20] 从 15开始出发，花费15 达到20
     * [1, 100, 1, 1, 1, 100, 1, 1, 100, 1] 从idx为0开始，跳过每一个100  花费6 idx分别为0,2,4,6,7,9
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i<dp.length;i++){
            //最开始那一步和最后那一步   只用算了其中一步
            dp[i] = Math.min(dp[i-1], dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }

- 96. 不同的二叉搜索树

	- /**
     * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种
     * n=1 一种  n=2  两种    
     *  1     1      1
     *       2         2
     * n = 3 有5种
     * dp[3] +=dp[0]*dp[2]  dp[3]+=dp[1]*dp[1] dp[3]+=dp[2]*dp[0]
     * dp[3]=1为头节点的数量+2为头节点的数量+3为头节点的数量
     * dp[i] ： 1到i为节点组成的二叉搜索树的个数为dp[i]。
     * dp[i] += dp[j - 1] * dp[i - j]; j-1 为j为头结点左子树节点数量，i-j 为以j为头结点右子树节点数量
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int j = 1;j<=i;j++){
                dp[i] +=dp[j-1] * dp[i-j];//n=2 dp[2]+=dp[0]+dp[1]=1 dp[2]+=dp[1]+dp[0]=2
            }
        }
        return dp[n];
    }

- 343. 整数拆分

	- 方法1

		- /**
     * 给定一个正整数 n，将其拆分为至少两个正整数的和，
     * 并使这些整数的乘积最大化。返回你可以获得的最大乘积。
     * input:2 output:1  e.x: 2=1+1  1*1=1
     * input:10 output:36  e.x:10=3+3+4  3*3*4=36
     * 下标   i=2      i=3      i=4       i=5
     *     dp[i]=1   dp[i]=2   dp[i]=4   dp[i]=6
     * 确定dp的初始化，确定dp的遍历顺序,确定dp公式dp[i] = max(dp[i],max((i-j)*j,dp[i-j]*j))
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        //dp[i] 为i拆分的最大乘积
        int[] dp = new int[n+1];
        dp[2] = 1;//初始化  i从3开始，j从1开始，i-j刚好是2
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i-1; j++) {
                // (i-j)*j 拆为两个数相乘
                // dp[i-j]*j 拆为多个数相乘
                dp[i] = Math.max(dp[i], Math.max((i-j)*j, dp[i-j]*j));
            }
        }
        return dp[n];
    }

- 120. 三角形最小路径和

	- 使用DFS递归

		- /**
    input=>[[2],[3,4],[6,5,7],[4,1,8,3]]
     2
    3 4
   6 5 7
  4 1 8 3
    output=>2 + 3 + 5 + 1 = 11
    使用DFS
    */
    int[][] save;
    public int minimumTotal(List<List<Integer>> triangle) {
        save = new int[triangle.size()][triangle.size()];
        return dfs(0,0,triangle,save);
    }
    int dfs(int x,int y,List<List<Integer>> triangle,int[][] saves){
        if(triangle.size()==1) return triangle.get(x).get(y);
        int left = dfs(x+1,y,triangle,saves);
        int right = dfs(x,y+1,triangle,saves);
        return Math.min(left,right)+triangle.get(x).get(y);
    }

	- DP

		-  /**
     * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
     * [
        [2],
       [3,4],
      [6,5,7],
     [4,1,8,3]
    ]
    output:2+3+5+1=11
    两层for循环 一层从上到下，一层从左到右
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                var resList = triangle.get(i);//获取倒数第二行list
                var value1 = triangle.get(i).get(j);//
                var min1 =  triangle.get(i + 1).get(j);//倒数第一行
                var min2 =  triangle.get(i + 1).get(j + 1);//倒数第一行
                var value = value1 + Math.min(min1,min2);//取最小值
                resList.set(j, value);
            }
        }
        return triangle.get(0).get(0);
    }

### 矩阵类型

- 62. 不同路径
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。

问总共有多少条不同的路径？

输入：m = 2, n = 3
输出：3
解释： 从左上角开始，总共有 3 条路径可以到达右下角。

向右 -> 向右 -> 向下
向右 -> 向下 -> 向右
向下 -> 向右 -> 向右

	- DP

		-  /**
    想象成二叉树 从头节点到叶子结点
    */
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i==0 || j==0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i][j-1]+arr[i-1][j];
                }
            }
        }
        return arr[m-1][n-1];
    }

			- https://gitee.com/xiaobo97/leetcode-master/blob/master/problems/0062.%E4%B8%8D%E5%90%8C%E8%B7%AF%E5%BE%84.md

- 64. 最小路径和
给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

说明：每次只能向下或者向右移动一步。
输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
输出：7
解释：因为路径 1→3→1→1→1 的总和最小。

	- DP

		-     /**
    只能向右或向下走
    */
    public int minPathSum(int[][] grid) {
        int m = grid.length,n = grid[0].length;
            for(int i = 0;i<m;i++){
                for(int j = 0;j<n;j++){
                    if(i==0&&j==0) continue;
                    else if(i==0)  grid[i][j] = grid[i][j-1]+grid[i][j];
                    else if(j==0)  grid[i][j] = grid[i-1][j]+grid[i][j];
                    else grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];    
                }
            }
            return grid[m-1][n-1];
    }

			- https://leetcode.cn/problems/minimum-path-sum/solution/zui-xiao-lu-jing-he-dong-tai-gui-hua-gui-fan-liu-c/

- 63. 不同路径 II 
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish”）。

现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

网格中的障碍物和空位置分别用 1 和 0 来表示。
输入：obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
输出：2
解释：3x3 网格的正中间有一个障碍物。
从左上角到右下角一共有 2 条不同的路径：
1. 向右 -> 向右 -> 向下 -> 向下
2. 向下 -> 向下 -> 向右 -> 向右


	- DP

		- class Solution {
    //遇到障碍dp[i][j]保持0
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length,n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i<m;i++){
            if(obstacleGrid[i][0]==1) break;
            dp[i][0] = 1;
        }
        for(int i = 0;i<n;i++){
            if(obstacleGrid[0][i]==1) break;
            dp[0][i] = 1;
        }

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    continue;
                }
                dp[i][j] = dp[i-1][j] +dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

### 序列类型

- 70. 爬楼梯 
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

	- 指针

		- class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        else if(n==2) return 2;
        int a=1,b=2,c;
        for(int i = 3;i<=n;i++){
            c = a;
            a = b;
            b = c+a;
        }
        return b;
    }
}

	- DP

		- class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        int[] dp =new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

- 300. 最长递增子序列
给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。

子序列 是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
输入：nums = [10,9,2,5,3,7,101,18]
输出：4
解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。

	- DP

		- class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res = 1;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}

			- https://leetcode.cn/problems/longest-increasing-subsequence/solution/zui-chang-shang-sheng-zi-xu-lie-dong-tai-gui-hua-2/

- 139. 单词拆分

### 双序列类型

- 1143. 最长公共子序列
- 72. 编辑距离

### 零钱和背包

- 416. 分割等和子集
- 01背包

	- 416. 分割等和子集
	- 1049. 最后一块石头的重量 II
	- 494. 目标和
	- 474. 一和零

- 完全背包

	- 518. 零钱兑换 II
	- 322. 零钱兑换
	- 377. 组合总和 Ⅳ
	- 70. 爬楼梯
(完全背包解法)
	- 279. 完全平方数
	- 139. 单词拆分

- 多重背包

### 买卖股票

- 121. 买卖股票的最佳时机
输入：[7,1,5,3,6,4]
输出：5

	- class Solution {
public int maxProfit(int[] prices) {
    if(prices.length==0){
        return 0;
    }
   int maxRes = 0;
    int min = prices[0];
    for(int i =1;i<prices.length;i++){
        min = Math.min(min,prices[i]);
        maxRes = Math.max(maxRes,prices[i]-min);
    }
return maxRes;
}
}

- 122. 买卖股票的最佳时机 II
[7,1,5,3,6,4] 下标1买 2卖 3买 5卖 最大7

	- class Solution {
public int maxProfit(int[] prices) {
    int result = 0;
    for(int i =1;i<prices.length;i++){
       int temp = prices[i] - prices[i-1];
        if(temp>0) result+=temp;
    }
    return result;
}
}

- 123. 买卖股票的最佳时机 III
- 188. 买卖股票的最佳时机 IV
- 309. 最佳买卖股票时机含冷冻期
- 714. 买卖股票的最佳时机含手续费

### 打家劫舍

- 198. 打家劫舍
- 213. 打家劫舍 II
- 337. 打家劫舍 III

### 子序列问题

- 子序列不连续

	- 300. 最长递增子序列
	- 1143. 最长公共子序列
	- 1035. 不相交的线

-  子序列连续

	- 53. 最大子序和

		- class Solution {
public int maxSubArray(int[] nums) {
    int sum=nums[0];
    int res=sum;
    if(nums.length==1) return nums[0];
    for(int i =1;i<nums.length;i++){
        sum = Math.max(nums[i],nums[i]+sum);
        res  =  Math.max(res,sum);
    }
    return res;
}
}

	- 674. 最长连续递增序列
	- 718. 最长重复子数组

- 编辑距离

	- 392. 判断子序列
	- 583. 两个字符串的删除操作
	- 115. 不同的子序列
	- 72. 编辑距离

- 回文

	- 647. 回文子串
	- 516. 最长回文子序列

## 滑动窗口

### 剑指 Offer 57 - II. 和为s的连续正数序列
输入：target = 9
输出：[[2,3,4],[4,5]]

- class Solution {
public int[][] findContinuousSequence(int target) {
    /**
    1. >=3 才有  从 1-（targer/2)+1 中找，超过就跳出
    2. 123456789  123=6<9 1234=10>9 234=9  34<9 345<9 45=9 
    3. 一开始先维护 三个大小的区间 
    */
    int a=1,b=2,s=3;
    List<int[]> res  = new ArrayList<>();
    while(a<b){
        if(s==target){
            int[] arr = new int[b-a+1];
            for(int k=a;k<=b;k++){
                arr[k-a] = k;
            }
            res.add(arr);
        }
        //2.3>target  说明现在的a+b大了，那就s - a 试试，然后 a右移 也就是 +1
        if(s>=target){
            s-=a;
            a++;
        }
        // 3. 3<target 说明现在的a+b小了，那就 
        if(s<target){
            b++;
            s+=b;
        }
    }
    return res.toArray(new int[0][]);
}
}

### 567. 字符串的排列

### 438. 找到字符串中所有字母异位词

### 3. 无重复字符的最长子串

### 76. 最小覆盖子串

## 回溯算法

### 组合

- 39. 组合总和
- 40. 组合总和 II
- 216. 组合总和 III
- 17. 电话号码的字母组合
- 77. 组合

### 分割

- 131. 分割回文串
- 93. 复原 IP 地址

### 子集

- 78. 子集
- 90. 子集 II

### 排列

- 46. 全排列
- 47. 全排列 II

### 棋盘问题

- 51. N 皇后
- 37. 解数独

### 其他

- 491. 递增子序列
- 332. 重新安排行程

##  设计

## 数学

### 加减乘除

- LCP 17. 速算机器人
"A" 运算：使 x = 2 * x + y；
"B" 运算：使 y = 2 * y + x。

	- public int calculate(String s) {
// 出现几个A和B 结果就是。1+2 的几倍
return (int)Math.pow(2,s.length());
}

## 分治

## 位

### 剑指 Offer 65. 不用加减乘除做加法

- 
 public int add(int a, int b) {
    while(b!=0){
        int i = (a&b) << 1;
        a ^=b;  
        b  = i;
    }
    return a;
}

### 191. 位1的个数

### 190. 颠倒二进制位

### 136. 只出现一次的数字

### 137. 只出现一次的数字 II

### 260. 只出现一次的数字 III

### 201. 数字范围按位与

## 前缀和

### 724 寻找数组的中心索引

### 523 连续的子数组和

### 560 和为 K 的子数组

### 1248 统计「优美子数组」

### 974 和可被 K 整除的子数组

## 哈希表

### 数组

- 242. 有效的字母异位词
- 383. 赎金信

### set

- 349. 两个数组的交集
- 202. 快乐数

### map

- 1. 两数之和
- 454. 四数相加 II

##  公式

### 剑指 Offer 62. 圆圈中最后剩下的数字 约瑟夫环

- class Solution {
public int lastRemaining(int n, int m) {
    //  0 1 2 3 4  m = 3    第一次删除2 第二次删除0  第三次删除4  第四次删除1
    // x = 1,1,0,3
    // int x = 0;
    // for(int i =2;i<=n;i++){
    //     x = (x+m)%i;
    // }
    // return x;
    int p=0;
for(int i=2;i<=n;i++)
{
p=(p+m)%i;  // 1,1,0,3
}
// return p+1;
return p;
}
}

## 并查集

### 684. 冗余连接

### 803. 打砖块

## 贪心

### 其他

- 455. 分发饼干
- 1005. K 次取反后最大化的数组和
- 860. 柠檬水找零

### 序列

- 376. 摆动序列
- 738. 单调递增的数字

### 股票

- 714. 买卖股票的最佳时机含手续费
- 122. 买卖股票的最佳时机 II

### 权衡

- 406. 根据身高重建队列
- 135. 分发糖果

### 区间

- 55. 跳跃游戏
- 45. 跳跃游戏 II
- 452. 用最少数量的箭引爆气球
- 435. 无重叠区间
- 763. 划分字母区间
- 56. 合并区间

###  134. 加油站

### 968. 监控二叉树

## 单调队列单调栈

### 单调栈

- 84. 柱状图中最大的矩形
- 42. 接雨水
- 剑指 Offer 59 - I. 滑动窗口的最大值
- 剑指 Offer 59 - II. 队列的最大值

### 单调队列

- 239. 滑动窗口最大值

