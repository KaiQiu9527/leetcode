package leetcode_1122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

/**
 * 给你两个数组，arr1 和 arr2，
 *
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 *
 *  
 *
 * 示例：
 *
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-sort-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        //第一步：将arr1中数据分配到各桶中
        int[] bucket=new int[1001];
        int[] res=new int[arr1.length];
        for (int data:arr1)
            bucket[data]++;
        //第二步：按照arr2的顺序收集桶中数据
        int j=0;
        for (int data:arr2){
            while (bucket[data]-->0)
                res[j++]=data;
        }
        //第三步：按升序顺序收集桶中其他数据
        for (int i=0;i<1001;i++){
            while (bucket[i]-->0)
                res[j++]=i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] result = new Solution().relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6});
        for (int i : result){
            System.out.println(i);
        }
        //[2,3,1,3,2,4,6,7,9,2,19]
        //[2,1,4,3,9,6]
    }
}
