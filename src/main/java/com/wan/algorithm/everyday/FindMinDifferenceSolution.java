package com.wan.algorithm.everyday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wan
 * @Description: 539. 最小时间差
 * 给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：timePoints = ["23:59","00:00"]
 * 输出：1
 * 示例 2：
 *
 * 输入：timePoints = ["00:00","23:59","00:00"]
 * 输出：0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-time-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/1/18 9:30
 */
public class FindMinDifferenceSolution {
    public static int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);

        String[] first = timePoints.get(0).split(":");
        int hh = Integer.parseInt(first[0])+24;
        String aa = hh+":"+first[1];
        timePoints.add(aa);
        String previous = timePoints.get(0);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < timePoints.size(); i++) {
            String current = timePoints.get(i);
            String[] arrayCur = current.split(":");
            String[] arrayPre = previous.split(":");
            int h = Integer.parseInt(arrayCur[0])*60 - Integer.parseInt(arrayPre[0])*60;
            int m = Integer.parseInt(arrayCur[1]) - Integer.parseInt(arrayPre[1]);
            int sum =h +m<0?-(h+m):h+m;
            min = Math.min(sum, min);
            previous = current;
        }

        return min;

    }

    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
        timePoints.add("00:00");

        System.out.println(findMinDifference(timePoints));
    }
}
