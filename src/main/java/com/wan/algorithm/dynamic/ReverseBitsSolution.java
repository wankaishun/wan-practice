package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 翻转数位
 * 给定一个32位整数 num，你可以将一个数位从0变为1。请编写一个程序，找出你能够获得的最长的一串1的长度。
 *
 * 示例 1：
 *
 * 输入: num = 1775(11011101111)
 * 输出: 8
 * 示例 2：
 *
 * 输入: num = 7(0111)
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-bits-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/8/10 17:42
 */
public class ReverseBitsSolution {

    public static  int reverseBits(int num) {
        int cur = 0;
        int insert = 0;
        int res = 1;
        for(int i = 0; i < 32; i++){
            if((num & (1 << i)) != 0){
                cur += 1;
                insert += 1;
            }else{
                insert = cur + 1;
                cur = 0;
            }
            res = Math.max(res , insert);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(1775));
    }
}
