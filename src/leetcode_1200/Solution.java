package leetcode_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你个整数数组 arr，其中每个元素都 不相同。
 *
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-absolute-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int[] absArray = new int[arr.length-1];
        int minAbs = Integer.MAX_VALUE;
        for (int i=0; i<absArray.length; i++){
            int abs = Math.abs(arr[i+1]-arr[i]);
            absArray[i] = abs;
            if (abs<minAbs)
                minAbs = abs;
        }
        List<List<Integer>> returnList = new ArrayList<>();
        for (int i=0; i<absArray.length; i++){
            if (absArray[i] == minAbs) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                returnList.add(pair);
            }

        }
        return returnList;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3,8,-10,23,19,-4,-14,27};
        System.out.println(new Solution().minimumAbsDifference(testArray));
    }

}
