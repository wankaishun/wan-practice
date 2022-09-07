package com.wan.algorithm.everyday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wan
 * @Description: 187. 重复的DNA序列
 *
所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。
在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。



示例 1：

输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
输出：["AAAAACCCCC","CCCCCAAAAA"]
示例 2：

输入：s = "AAAAAAAAAAAAA"
输出：["AAAAAAAAAA"]


提示：

0 <= s.length <= 105
s[i] 为 'A'、'C'、'G' 或 'T'
 * @date 2021/10/8 9:38
 */
public class FindRepeatedDnaSequencesSolution {
    public static  List<String> findRepeatedDnaSequences(String s) {
        if(s.length() <= 10) {
            return new ArrayList<>();
        }
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            if(i+10 <= s.length()) {
               String str = s.substring(i,i+10);
               boolean addResult = set1.add(str);
               if(!addResult) {
                   set2.add(str);
               }
            }
        }
        return new ArrayList<>(set2);
    }

    public static void main(String[] args) {
        findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT").forEach(System.out::println);
    }
}
