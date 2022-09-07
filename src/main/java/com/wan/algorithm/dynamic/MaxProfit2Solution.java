package com.wan.algorithm.dynamic;

/**
 * @author wan
 * @Description: 309. 最佳买卖股票时机含冷冻期
 * 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 *
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 *
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 * 示例:
 *
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/11/3 11:10
 */
public class
MaxProfit2Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[][] profit = new int[prices.length][3];
        profit[0][0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            // 0 持有股票 1 不持有在冷冻期 2 不持有不在冷冻期
            // i-1 持有股票 i也就天持有股票  或者 i-1 不持有股票企鹅不处于冷冻期
            profit[i][0] = Math.max(profit[i-1][0], profit[i-1][2]-prices[i]);//持有股票
            // i-1 持有股票 i不持有股票在冷冻期
            profit[i][1] = profit[i-1][0]+prices[i];
            // i-1 不持有在冷冻期  或者 i-1 不持有
            profit[i][2] = Math.max(profit[i-1][1], profit[i-1][2]);
        }
        return Math.max(profit[prices.length-1][1],profit[prices.length-1][2]);
    }
}
