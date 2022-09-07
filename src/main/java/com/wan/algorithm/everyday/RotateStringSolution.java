package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 796. 旋转字符串
 * 给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。
 *
 * s 的 旋转操作 就是将 s 最左边的字符移动到最右边。 
 *
 * 例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcde", goal = "cdeab"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "abcde", goal = "abced"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/4/7 17:03
 */
public class RotateStringSolution {
    public static boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            if((s.substring(i,s.length()) + s.substring(0,i)).equals(goal)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde","abced"));
    }
}
