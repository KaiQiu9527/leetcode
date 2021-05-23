package leetcode_1491;

import java.util.Arrays;

/**
 * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
 *
 * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int[] returnArray = Arrays.copyOfRange(salary,1,salary.length-1);
        int sum = 0;
        for (int i : returnArray){
            sum+= i;
        }
        return (double) sum/(salary.length-2);
    }

    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6};
        System.out.println(new Solution().average(testArray));
    }
}
