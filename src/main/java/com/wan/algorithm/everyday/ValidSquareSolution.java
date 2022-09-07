package com.wan.algorithm.everyday;

import java.util.Arrays;

/**
 * @author wan
 * @Description:
 * @date 2022/7/29 10:16
 */
public class ValidSquareSolution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] x = {p1[0],p2[0],p3[0],p4[0]};
        int[] y = {p1[1],p2[1],p3[1],p4[1]};
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[0] == x[1] && x[2] == x[3] && y[0] == y[1] && y[2] == y[3]) {
             return true;
        }
        if(x[1] - x[0] == x[3] - x[2] && y[1] - y[0] == y[3] - y[2]) {
            return true;
        }
        return false;
    }
}
