package leetcode_1304;


import java.util.Arrays;

/**
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 */
public class Solution {
    public static int[] sumZero(int n) {
        int[] nums = new int[n+1];
        nums[0] = 0;
        int index = 1;
        for (int i=1; i<=n/2;i++){
            nums[index++] = i;
            nums[index++] = -i;
        }
        return n%2==0?Arrays.copyOfRange(nums,1,n+1):Arrays.copyOfRange(nums,0,n);
    }

    public static void main(String[] args) {
        int[] returnSum = sumZero(9);
        for (int i : returnSum){
            System.out.println(i);
        }
    }
}
