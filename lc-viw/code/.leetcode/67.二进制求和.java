import java.math.BigInteger;

/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger bi1  = new BigInteger(a,2);
        BigInteger bi2 = new BigInteger(b,2);
        BigInteger res = bi1.add(bi2);
        return res.toString(2);
    }
}
// @lc code=end

