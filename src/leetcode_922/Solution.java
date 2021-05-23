package leetcode_922;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] resultArray = new int[A.length];
        for (int o=1, e=0, i=0; i<A.length; i++){
                if (A[i]%2==0)  //偶数
                {
                    resultArray[e] = A[i];
                    e += 2;
                }
                else {  //奇数
                    resultArray[o] = A[i];
                    o += 2;
                }
        }
        for (int i : resultArray){
            System.out.print(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{4,2,5,7};
        new Solution().sortArrayByParityII(testArray);
    }
}
