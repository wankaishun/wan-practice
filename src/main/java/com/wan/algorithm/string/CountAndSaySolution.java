package com.wan.algorithm.string;

/**
 * @author wan
 * @Description: 外观数列
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 *
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 *
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * 前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 * 描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
 * 描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
 * 描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
 * 描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnpvdm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/21 16:20
 */
public class CountAndSaySolution {
    public static String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }
        String s1 = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int length = s1.length();
        char pre = s1.charAt(0);
        int count = 0;
        for(int i = 0; i<=length-1; i++) {
            char cur = s1.charAt(i);
            if(cur == pre) {
                count++;
            }
            if(cur != pre) {
                sb.append(count);
                sb.append(pre);
                count = 1;
            }
            pre = cur;
        }
        sb.append(count);
        sb.append(pre);

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
}
