package com.wan.algorithm.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan
 * @Description: 524. 通过删除字母匹配到字典里最长单词
 * 给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 *
 * 如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
 * 输出："apple"
 * 示例 2：
 *
 * 输入：s = "abpcplea", dictionary = ["a","b","c"]
 * 输出："a"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * 1 <= dictionary.length <= 1000
 * 1 <= dictionary[i].length <= 1000
 * s 和 dictionary[i] 仅由小写英文字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/14 10:05
 */
public class FindLongestWordSolution {
    public static String findLongestWord(String s, List<String> dictionary) {
        int size = 0;
        String backup = new String(s);
        String result = null;
        List<String> list = new ArrayList();
        int index1 = 0;
        for (int i = 0; i < dictionary.size(); i++) {
            String item = dictionary.get(i);
            int count = 0;
            for (int j = 0; j < item.length(); j++) {
                char c = item.charAt(j);
                int index = s.indexOf(c);
                if(index >=0) {
                    s = s.replace(c, ' ');
                    s = s.trim();
                    count++;
                }
            }
            if(count>=size) {
                result = item;
                size = count;
            }
            s = backup;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("abe");
        dictionary.add("abc");
        String s = "abce";
        System.out.println(findLongestWord(s, dictionary));
    }
}
