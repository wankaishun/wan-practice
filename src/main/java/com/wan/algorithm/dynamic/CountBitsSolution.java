package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 比特位计数
 * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * 示例 1:
 *
 * 输入: 2
 * 输出: [0,1,1]
 * 示例 2:
 *
 * 输入: 5
 * 输出: [0,1,1,2,1,2]
 * 进阶:
 *
 * 给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
 * 要求算法的空间复杂度为O(n)。
 * 你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作。
 * 通过次数146,028提交次数185,460
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/counting-bits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/7/29 16:40
 */
public class CountBitsSolution {
    public static int[] countBits(int n) {
//        int[] arr = new int[n+1];
//        int high = 0;
//        arr[0] = high;
//        for (int i = 1; i <= n; i++) {
//            if((i&(i-1)) == 0) {
//                high = i;
//            }
//            arr[i] = arr[i - high] +1;
//        }
//         return  arr;


        int[] arr = new int[1+n];
        arr [0] = 0;
        for (int i = 1; i <= n; i++) {
            if((i&1) == 1) {
                arr [i] = arr[i>>1] +1;
            } else {
                arr [i] = arr[i>>1];
            }
        }
        return arr;
    }
    

    public static void main(String[] args) {
        for (int i : countBits(5)) {
            System.out.print(i + " ");
        }
    }
}
