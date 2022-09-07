package com.wan.algorithm.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan
 * @Description: 6. Z 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 *  
 *
 * 示例 1：
 *
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P0      I6     N12
 * A1   L5 S7  I11 G1
 * Y2 A4   H8 R10
 * P3      I9
 * 示例 3：
 *
 * 输入：s = "A", numRows = 1
 * 输出："A"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/24 10:55
 */
public class ConvertSolution {
    public static String convert(String s, int numRows) {
        String[] arr = new String[numRows];
        if(numRows == 1 ) {
            return s;
        }
        int d = numRows+numRows-2;
        for (int i = 0; i < s.length(); i++) {
            int a = i%d;
            if(a<numRows) {
                arr[a] = arr[a] == null?s.charAt(i)+"":arr[a]+s.charAt(i);
            }else {
                arr[d-a] = arr[d-a] == null ? arr[d-a]+"":arr[d-a]+s.charAt(i);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (String s1 : arr) {
            if(s1 !=null) {
                sb.append(s1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }
}
