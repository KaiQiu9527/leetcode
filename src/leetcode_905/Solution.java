package leetcode_905;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 *
 * 你可以返回满足此条件的任何数组作为答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int l=0,r=A.length-1;
        while (l<r){
            while (l<A.length && A[l]%2 == 0){
                l++;
            }
            while (r>=0 && A[r] %2 !=0){
                r--;
            }
            if (l>r)
                break;
            else {
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] testArray = {0,2};
        int[] result = new Solution().sortArrayByParity(testArray);
        for (int i : result)
            System.out.println(i);
    }
}
