package leetcode_lcp02;

/**
 * 有一个同学在学习分式。他需要将一个连分数化成最简分数，你能帮助他吗？
 *
 *
 *
 * 连分数是形如上图的分式。在本题中，所有系数都是大于等于0的整数。
 *
 *  
 *
 * 输入的cont代表连分数的系数（cont[0]代表上图的a0，以此类推）。返回一个长度为2的数组[n, m]，使得连分数的值等于n / m，且n, m最大公约数为1。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：cont = [3, 2, 0, 2]
 * 输出：[13, 4]
 * 解释：原连分数等价于3 + (1 / (2 + (1 / (0 + 1 / 2))))。注意[26, 8], [-13, -4]都不是正确答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/deep-dark-fraction
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int[] fraction(int[] cont) {
        int[] resultArray = new int[2];
        int temp = 0;
        resultArray[1] = cont[cont.length-1];
        resultArray[0] = 1+cont[cont.length-2];
        if (cont.length == 2)
            return resultArray;
        for (int i = cont.length-3; i>=0; i--){
            temp = resultArray[1];
            resultArray[1] = resultArray[0];
            resultArray[0] = temp + cont[i]*resultArray[1];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] cont = {3, 2, 0, 2};
        int[] result = new Solution().fraction(cont);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
