package com.wan.algorithm.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wan
 * @Description: 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/24 16:12
 */
public class LongestCommonPrefixSolution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while(true) {
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                if("".equals(str) ||j>=str.length()) {
                    return str.substring(0,j);
                }
                set.add(str.charAt(j));
                if( set.size() > 1) {
                    return str.substring(0,j);
                }


            }
             j++;

        }

    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
