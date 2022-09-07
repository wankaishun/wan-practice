package com.wan.algorithm.array;

/**
 * @author wan
 * @Description:
 * 输入: prices = [7,1,5,3,6,7]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/4/27 18:12
 */
public class MaxProfitSolution {
    public static int maxProfit(int[] prices) {
        if(prices.length == 1) {
            return 0;
        }
        int profit = 0;
         for(int i = 0; i<prices.length-1; i++) {
             if(prices[i]<prices[i+1]) {
                 profit= profit+prices[i+1]-prices[i];
             }
         }
        return profit;
    }
    public static void main(String args[]) {
       int param[] = {7,1,5,3,6,4};
       System.out.println(maxProfit(param));
    }
}
