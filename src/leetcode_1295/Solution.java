package leetcode_1295;

//给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。

public class Solution {
    public int findNumbers(int[] nums) {
        int howmany = 0;
        for (int i : nums){
            if (String.valueOf(i).length() %2 == 0)
                howmany++;
        }
        return howmany;
    }

    public static void main(String[] args) {
        int testNums[] = {111,222,3333,4,55};
        Solution s = new Solution();
        System.out.println(s.findNumbers(testNums));
    }
}
