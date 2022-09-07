package com.wan.algorithm.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wan
 * @Description: 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 *  
 *
 * 示例 1：
 *
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 *
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 *
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/24 15:34
 */
public class LetterCombinationsSolution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        backTrack(combinations, phoneMap, 0, digits, new StringBuffer());
        return combinations;

    }
    public void backTrack(List<String> combinations, Map<Character, String> phoneMap, int index, String digits, StringBuffer combination) {
        if(digits.length() == index) {
            combinations.add(combination.toString());
        }else {
            String a = phoneMap.get(digits.charAt(index));
            for (int i = 0; i < a.length(); i++) {
                combination.append(a.charAt(i));
                backTrack(combinations, phoneMap, index++, digits, combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
