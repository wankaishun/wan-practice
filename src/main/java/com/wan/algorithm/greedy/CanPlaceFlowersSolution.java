package com.wan.algorithm.greedy;

/**
 * @author wan
 * @Description: 605. 种花问题
 * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 *
 * 给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：flowerbed = [1,0,0,0,1], n = 1
 * 输出：true
 * 示例 2：
 *
 * 输入：flowerbed = [1,0,0,0,1], n = 2
 * 输出：false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/can-place-flowers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/3/7 11:27
 */
public class CanPlaceFlowersSolution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if((flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) || n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if((i-1 <0 || flowerbed[i-1] == 0) && flowerbed[i] == 0 && (i+1 == flowerbed.length || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n = n -1;
                if(n == 0) {
                    return true;

                }           //1010001
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] p = {0,0,1};
        System.out.println(canPlaceFlowers(p, 1));
    }
}
