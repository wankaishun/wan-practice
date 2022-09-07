package com.wan.algorithm.everyday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wan
 * @Description: 748. 最短补全词
 * 给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出并返回 words 中的 最短补全词 。
 *
 * 补全词 是一个包含 licensePlate 中所有的字母的单词。在所有补全词中，最短的那个就是 最短补全词 。
 *
 * 在匹配 licensePlate 中的字母时：
 *
 * 忽略 licensePlate 中的 数字和空格 。
 * 不区分大小写。
 * 如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
 * 例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
 *
 * 请你找出并返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取 words 中 最靠前的 那个。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
 * 输出："steps"
 * 解释：最短补全词应该包括 "s"、"p"、"s"（忽略大小写） 以及 "t"。
 * "step" 包含 "t"、"p"，但只包含一个 "s"，所以它不符合条件。
 * "steps" 包含 "t"、"p" 和两个 "s"。
 * "stripe" 缺一个 "s"。
 * "stepple" 缺一个 "s"。
 * 因此，"steps" 是唯一一个包含所有字母的单词，也是本例的答案。
 * 示例 2：
 *
 * 输入：licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
 * 输出："pest"
 * 解释：licensePlate 只包含字母 "s" 。所有的单词都包含字母 "s" ，其中 "pest"、"stew"、和 "show" 三者最短。答案是 "pest" ，因为它是三个单词中在 words 里最靠前的那个。
 * 示例 3：
 *
 * 输入：licensePlate = "Ah71752", words = ["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]
 * 输出："husband"
 * 示例 4：
 *
 * 输入：licensePlate = "OgEu755", words = ["enough","these","play","wide","wonder","box","arrive","money","tax","thus"]
 * 输出："enough"
 * 示例 5：
 *
 * 输入：licensePlate = "iMSlpe4", words = ["claim","consumer","student","camera","public","never","wonder","simple","thought","use"]
 * 输出："simple"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-completing-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/12/10 9:19
 */
public class ShortestCompletingWordSolution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Integer,Integer> map = new HashMap<>();
        String[] a = Arrays.copyOf(words, words.length);
        int[] state = new int[words.length];
        for (int i = 0; i < licensePlate.length(); i++) {
            Character c = licensePlate.charAt(i);
            if(c- '9' <=0) {
                continue;
            }
            for (int j = 0; j < words.length; j++) {

                int pre = words[j].length();
                words[j] = words[j].replaceFirst(Character.toLowerCase(c) + "", "");
                int cur = words[j].length();
                if(cur != pre) {
                    state[j] ++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < state.length; i++) {
            if(state[i]>max ) {
                max = state[i];
                map.put(max, i);
            }else if(state[i] == max) {
                if(a[i].length() < a[map.get(max)].length()) {
                    map.put(max, i);
                }

            }
        }
        return a[map.get(max)];
    }

    public static void main(String[] args) {
        String words[] = {"looks", "pest", "stew", "show"};
        System.out.println(shortestCompletingWord("1s3 456",words));
    }
}
