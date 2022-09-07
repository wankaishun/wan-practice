package com.wan.algorithm.everyday;

import java.util.*;

/**
 * @author wan
 * @Description: 反转字符串
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："hello"
 * 输出："holle"
 * 示例 2：
 *
 * 输入："leetcode"
 * 输出："leotcede"
 *  
 *
 * 提示：
 *
 * 元音字母不包含字母 "y" 。
 * 通过次数84,182提交次数160,769
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/19 10:00
 *
 * a、e、i、o、u
 */
public class ReverseVowelsSolution {
    public static String reverseVowels(String s) {
        String origin = "aeiouAEIOU";
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
           if(origin.indexOf(str[i])>=0 && origin.indexOf(str[j])>=0 ) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
           }
           if(origin.indexOf(str[i]) < 0) {
               i++;
           }
           if(origin.indexOf(str[j]) < 0) {
               j--;
           }
        }

        return new String(str);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("a."));
    }
}
