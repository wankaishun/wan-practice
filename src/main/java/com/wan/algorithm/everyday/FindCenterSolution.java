package com.wan.algorithm.everyday;

/**
 * @author wan
 * @Description: 1791. 找出星型图的中心节点
 * 有一个无向的 星型 图，由 n 个编号从 1 到 n 的节点组成。星型图有一个 中心 节点，
 * 并且恰有 n - 1 条边将中心节点与其他每个节点连接起来。
 *
 * 给你一个二维整数数组 edges ，其中 edges[i] = [ui, vi] 表示在节点 ui 和 vi 之间存在一条边。
 * 请你找出并返回 edges 所表示星型图的中心节点。
 *
 * 示例 1：
 *
 * 输入：edges = [[1,2],[2,3],[4,2]]
 * 输出：2
 * 解释：如上图所示，节点 2 与其他每个节点都相连，所以节点 2 是中心节点。
 * 示例 2：
 *
 * 输入：edges = [[1,2],[5,1],[1,3],[1,4]]
 * 输出：1
 * @date 2022/2/18 10:00
 */
public class FindCenterSolution {
    public int findCenter(int[][] edges) {
        int[] a = edges[0];
        int[] b = edges[1];
        if(a[0] == b[0] || a[0] == b[1]) {
            return a[0];
        }else {
            return a[1];
        }
    }
}
