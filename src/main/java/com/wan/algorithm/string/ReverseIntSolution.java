package com.wan.algorithm.string;

/**
 * @author wan
 * @Description: 反转整数
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnx13t/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/14 9:32
 */
public class ReverseIntSolution {
    public static int reverse(int x) {
//        String str = ((Integer)x).toString();
//        if(x<0) {
//            str = str.substring(1,str.length());
//        }
//        char[] s = str.toCharArray();
//        for (int i = 0; i < (s.length)/2; i++) {
//            char a = s[i];
//            s[i] = s[s.length-i-1];
//            s[s.length-i-1] = a;
//        }
//        try {
//            int a = Integer.parseInt(new String(s));
//            if(x<0) {
//                return -1*a;
//            }
//            return a;
//        }catch (Exception e) {
//            return 0;
//        }
        int sum = 0;
        while(x!=0) {
            int var = x%10;
            x = x/10;
            sum = sum*10+var;

        }
        
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
