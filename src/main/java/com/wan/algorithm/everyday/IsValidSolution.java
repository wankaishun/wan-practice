package com.wan.algorithm.everyday;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wan
 * @Description: 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/26 17:17
 */
public class IsValidSolution {
    public static boolean isValid(String s) {
        // ( 40
        // ) 41
        // [ 91
        // ] 93
        // { 123
        // } 125
        Deque<Character> deque = new LinkedList();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = 0;
            if(!deque.isEmpty()) {
                  c = deque.peekLast();
            }
            if(c == 40 &&  s.charAt(i) == 41) {
                deque.pollLast();
            }else if(c == 91 &&  s.charAt(i) == 93) {
                deque.pollLast();
            }else if(c == 123 &&  s.charAt(i) == 125) {
                deque.pollLast();
            } else {
                deque.addLast(s.charAt(i));
            }
        }
        return deque.size() == 0 ? true:false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]{}"));
    }
}

