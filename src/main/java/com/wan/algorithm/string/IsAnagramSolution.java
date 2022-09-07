package com.wan.algorithm.string;

/**
 * @author wan
 * @Description: 优先字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn96us/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/19 17:19
 */
public class IsAnagramSolution {
    public static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        if(s1.length != t1.length) {
            return false;
        }
        int[] a = new int[26];
        for (int i = 0; i < s1.length; i++) {
            a[s1[i] - 'a']++;
        }
        for (int i = 0; i < t1.length; i++) {
            a[t1[i] - 'a']--;
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "rat";
        String b = "car";
        System.out.println(isAnagram(a, b));
    }
}
