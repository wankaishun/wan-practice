package com.wan.algorithm.string;

/**
 * @author wan
 * @Description: 字符串第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn5z8r/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/18 16:40
 */
public class FirstUniqCharSolution {
    public static int firstUniqChar(String s) {
//        char[] c = s.toCharArray();
//        List list = new ArrayList();
//        for (int i = 0; i < c.length; i++) {
//            list.add(c[i]);
//        }
//        for (int i = 0; i < c.length; i++) {
//            list.remove((Object) c[i]);
//            if(!list.contains(c[i])){
//                return i;
//            }
//            list.add(c[i]);
//        }
//
////        return -1;
//        char[] c = s.toCharArray();
//        List list = new ArrayList();
//        Map<Object, Integer> map = new HashMap();
//        for (int i = 0; i < c.length; i++) {
//            list.add(c[i]);
//
//            if(map.containsKey(c[i])) {
//                list.remove((Object) c[i]);
//            }
//            map.put(c[i], i);
//        }
//        if(list.size()==0) {
//            return -1;
//        }
//        return map.get(list.get(0));
        int count[] = new int[26];
        char[] chars = s.toCharArray();
        //先统计每个字符出现的次数
        for (int i = 0; i < s.length(); i++)
            count[chars[i] - 'a']++;
        //然后在遍历字符串s中的字符，如果出现次数是1就直接返回
        for (int i = 0; i < s.length(); i++)
            if (count[chars[i] - 'a'] == 1)
                return i;
        return -1;
    }


    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }
}
