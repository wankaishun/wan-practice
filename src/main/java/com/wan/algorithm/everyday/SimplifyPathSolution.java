package com.wan.algorithm.everyday;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wan
 * @Description: 71. 简化路径
 * 给你一个字符串 path ，表示指向某一文件或目录的 Unix 风格 绝对路径 （以 '/' 开头），请你将其转化为更加简洁的规范路径。
 *
 * 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。任意多个连续的斜杠（即，'//'）都被视为单个斜杠 '/' 。 对于此问题，任何其他格式的点（例如，'...'）均被视为文件/目录名称。
 *
 * 请注意，返回的 规范路径 必须遵循下述格式：
 *
 * 始终以斜杠 '/' 开头。
 * 两个目录名之间必须只有一个斜杠 '/' 。
 * 最后一个目录名（如果存在）不能 以 '/' 结尾。
 * 此外，路径仅包含从根目录到目标文件或目录的路径上的目录（即，不含 '.' 或 '..'）。
 * 返回简化后得到的 规范路径 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：path = "/home/"
 * 输出："/home"
 * 解释：注意，最后一个目录名后面没有斜杠。
 * 示例 2：
 *
 * 输入：path = "/../"
 * 输出："/"
 * 解释：从根目录向上一级是不可行的，因为根目录是你可以到达的最高级。
 * 示例 3：
 *
 * 输入：path = "/home//foo/"
 * 输出："/home/foo"
 * 解释：在规范路径中，多个连续斜杠需要用一个斜杠替换。
 * 示例 4：
 *
 * 输入：path = "/a/./b/../../c/"
 * 输出："/c"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/simplify-path
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/1/6 15:07
 */
public class SimplifyPathSolution {
    public static String simplifyPath(String path) {
        Deque<Character> deque = new LinkedList();
        for (int i = 0; i < path.length(); i++) {
            deque.offerLast(path.charAt(i));
        }
        Deque<Character> deque1 = new LinkedList();
        while(!deque.isEmpty()) {
            char c = deque.pollLast();
            if(c == '/') {
                continue;
            }
            if(c == '.') {
                continue;
            }
            deque1.addFirst(c);
        }
        StringBuffer s = new StringBuffer();
        for (Character character : deque1) {
            s.append(character);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/1/2//33"));
    }
}