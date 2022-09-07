package com.wan.algorithm.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wan
 * @Description: 46. 全排列
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 示例 2：
 *
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出：[[1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/2/9 17:09
 */
public class PermuteSolution {
    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        List<List<Integer>>[] list = new List[nums.length];
        List aa = new ArrayList<>();;
        aa.add(nums[0]);
        list[0] = new ArrayList<>();
        list[0].add(aa);
        for (int i = 1; i < nums.length; i++) {
            list[i] = new ArrayList<>();
            List<List<Integer>> pre = list[i-1];
            for (int j = 0; j < pre.size(); j++) {
                LinkedList<Integer> l = new LinkedList(pre.get(j));
                for (int m = 0; m <= l.size(); m++) {
                    l.add(m, nums[i]);
                    list[i].add(new LinkedList<>(l));
                    l.remove(m);
                }
            }
        }
        return list[list.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {1};
        permute(nums).forEach(item -> System.out.println(item));
    }
}

