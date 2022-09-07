package com.wan.algorithm.sortandsearch;

/**
 * @author wan
 * @Description: 第一个错误版本
 * 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 *
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 *
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 *
 * 示例:
 *
 * 给定 n = 5，并且 version = 4 是第一个错误的版本。
 *
 * 调用 isBadVersion(3) -> false
 * 调用 isBadVersion(5) -> true
 * 调用 isBadVersion(4) -> true
 *
 * 所以，4 是第一个错误的版本。 
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnto1s/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/6/9 18:11
 */
public class FirstBadVersionSolution {
    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int res = 0;
        while(low <= high) {
            int key = (low - high) / 2 + high;
            if(!isBadVersion(key)) {
                low = key + 1;
            }else{
                high = key - 1;
            }
            res = low;
        }
        return res;
    }

    public static boolean isBadVersion(int n) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int r = arr[n-1];
        return r==0?false:true;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(40));
    }
}
