package leetcode_944;

import java.util.Arrays;
import java.util.Collections;

/**
 * 给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
 *
 * 你需要选出一组要删掉的列 D，对 A 执行删除操作，使 A 中剩余的每一列都是 非降序 排列的，然后请你返回 D.length 的最小可能值。
 *
 * 删除 操作的定义是：选出一组要删掉的列，删去 A 中对应列中的所有字符，形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。（可以参见 删除操作范例）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-columns-to-make-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int minDeletionSize(String[] A) {
        int result = 0;
        for (int i=0; i<A[0].length(); i++){
            StringBuilder sb = new StringBuilder();
            int nums = A.length;
            for (int j=0; j<nums; j++){
                sb.append(A[j].toCharArray()[i]);
            }
            String originalString = sb.toString();
            char[] sortString = originalString.toCharArray();
            Arrays.sort(sortString);
            String sortedString = String.valueOf(sortString);
            if (!originalString.equals(sortedString))
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] testString = {"zyx", "wvu", "tsr"};
        System.out.println(s.minDeletionSize(testString));
    }
}
