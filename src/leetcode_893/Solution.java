package leetcode_893;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 你将得到一个字符串数组 A。
 *
 * 每次移动都可以交换 S 的任意两个偶数下标的字符或任意两个奇数下标的字符。
 *
 * 如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是 特殊等价 的。
 *
 * 例如，S = "zzxy" 和 T = "xyzz" 是一对特殊等价字符串，因为可以先交换 S[0] 和 S[2]，然后交换 S[1] 和 S[3]，使得 "zzxy" -> "xzzy" -> "xyzz" 。
 *
 * 现在规定，A 的 一组特殊等价字符串 就是 A 的一个同时满足下述条件的非空子集：
 *
 * 该组中的每一对字符串都是 特殊等价 的
 * 该组字符串已经涵盖了该类别中的所有特殊等价字符串，容量达到理论上的最大值（也就是说，如果一个字符串不在该组中，那么这个字符串就 不会 与该组内任何字符串特殊等价）
 * 返回 A 中特殊等价字符串组的数量。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/groups-of-special-equivalent-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int numSpecialEquivGroups(String[] A) {
        int result = 0;
        Set<String> sets = new HashSet<>();
        //sort chars in odd/even index
        for (String e : A){
            char[] chars = e.toCharArray();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            //odd
            for (int i=1; i<chars.length; i+=2){
                sb1.append(chars[i]);
            }
            //even
            for (int i=0; i<chars.length; i+=2){
                sb2.append(chars[i]);
            }
            //sort and merge
            char[] c1 = sb1.toString().toCharArray();
            char[] c2 = sb2.toString().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            //add to set, repeated one will be abandoned
            sets.add(String.valueOf(c1)+String.valueOf(c2));
        }
        return sets.size();
    }
}
