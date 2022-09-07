package com.wan.algorithm.sortandsearch;

/**
 * @author wan
 * @Description: 合并两个数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 示例 2：
 *
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnumcr/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/6/2 18:13
 */
public class MergeSolution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            if(m==0) {
                for (int i = n-1; i>=0; i--) {
                    nums1[i] = nums2[i];
                }
            }
           for (int i = m-1,j=n-1; j>-1;i--,j--){
               if(j < 0 ) {
                   for(int a = i;a>=0;a--) {
                       nums1[a] = nums2[a];
                   }
                   return;
               }
               if(i<0){
                   for(int a = j;a>=0;a--) {
                       nums1[a] = nums2[a];
                   }
                   return;
               }
                if(nums1[i]<=nums2[j]) {
                    nums1[i+j+1] = nums2[j];
                    i++;
                }else {
                    nums1[i+j+1] = nums1[i];
                    j++;
                }
           }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1,1,nums2,1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

    }
}
