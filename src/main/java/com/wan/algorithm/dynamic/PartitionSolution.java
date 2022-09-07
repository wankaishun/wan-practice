package com.wan.algorithm.dynamic;

import java.util.List;

/**
 * @author wan
 * @Description: 131. 分割回文串
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 *
 * 回文串 是正着读和反着读都一样的字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "aab"
 * 输出：[["a","a","b"],["aa","b"]]
 * 示例 2：
 *
 * 输入：s = "a"
 * 输出：[["a"]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-partitioning
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/9 13:58
 */
public class PartitionSolution {
    public List<List<String>> partition(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {

            }
        }
        // aaabab   aa aba b / aaa bab   / a a a bab /a aa bab /aa a bab/ a a aba b
        return null;
    }
}
