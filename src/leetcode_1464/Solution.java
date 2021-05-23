package leetcode_1464;

/**
 * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
 *
 * 请你计算并返回该式的最大值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int maxProduct(int[] nums) {
        int max1=0,max2=0,result = 0;
        if (nums.length == 2)
            return (nums[0]-1)*(nums[1]-1);
        for (int i=0; i<nums.length; i++){
            if (nums[i]>=max1){
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i]>=max2 && nums[i]<max1){
                max2 = nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}

