package leetcode_977;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 */

public class Solution {
    public int[] sortedSquares(int[] A) {
        Arrays.sort(A);
        for (int i=0; i<A.length; i++){
            int j = A[i];
            A[i] = j*j;
        }
        Arrays.sort(A);
        return A;
    }
}
