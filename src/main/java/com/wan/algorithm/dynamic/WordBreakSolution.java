package com.wan.algorithm.dynamic;

import java.util.Arrays;
import java.util.List;

/**
 * @author wan
 * @Description: 139. 单词拆分
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典，判定 s 是否可以由空格拆分为一个或多个在字典中出现的单词。
 *
 * 说明：拆分时可以重复使用字典中的单词。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 *
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 * 示例 3：
 *
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-break
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/17 9:50
 */
public class WordBreakSolution {
    public static  boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] b = new boolean[length+1];
        b[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0 ; j < i; j++) {
                if(b[j] && wordDict.contains(s.substring(j,i))) {
                    b[i] = true;
                    break;
                }
            }
        }
        return b[s.length()];
    }

    public static void main(String[] args) {
        String[] str = {"apple", "pen"};
       List<String> list = Arrays.asList(str);
        System.out.println(wordBreak("applepenapple", list));
    }
}
