package leetcode_1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 * 示例 2：
 *
 * 输入：arr = [1,2]
 * 输出：false
 * 示例 3：
 *
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * 输出：true
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-number-of-occurrences
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr){
            if (map.containsKey(i)){
                map.put(i,(map.get(i))+1);
            }
            else {
                map.put(i,1);
            }
        }
        System.out.println(map.toString());
        Set<Integer> times = new HashSet<>();
        for (int i : arr){
            times.add(map.get(i));
        }
        return times.size() == map.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(s.uniqueOccurrences(arr));
    }
}
