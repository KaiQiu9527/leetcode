package leetcode_496;

/**
 * 给你两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。
 *
 * 请你找出 nums1 中每个元素在 nums2 中的下一个比其大的值。
 *
 * nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * 输出: [-1,3,-1]
 * 解释:
 *     对于 num1 中的数字 4 ，你无法在第二个数组中找到下一个更大的数字，因此输出 -1 。
 *     对于 num1 中的数字 1 ，第二个数组中数字1右边的下一个较大数字是 3 。
 *     对于 num1 中的数字 2 ，第二个数组中没有下一个更大的数字，因此输出 -1 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/next-greater-element-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i=0; i<nums1.length; i++) {
            int a = nums1[i];
            nums1[i] = -1;
            for (int j=0; j<nums2.length; j++){
                if (nums2[j] != a)
                    continue;
                for (int k = j+1; k<nums2.length; k++) {
                    if (nums2[k] > a)
                        nums1[i] = nums2[k];
                    break;
                }
                break;
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{4,1,2};
        int[] num2 = new int[]{1,3,4,2};
        int[] result = new Solution().nextGreaterElement(num1, num2);
        for (int i : result){
            System.out.print(i);
        }
    }
}
