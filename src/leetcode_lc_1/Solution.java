package leetcode_lc_1;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return nums.length;
        int i=0, j=1;
        while (j < nums.length) {
            if (nums[i] != nums[j])
                nums[++i] = nums[j];
            j++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{1,1,2};
        System.out.println(new Solution().removeDuplicates(testArray));
    }
}
