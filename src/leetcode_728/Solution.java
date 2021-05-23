package leetcode_728;

import java.util.LinkedList;
import java.util.List;

/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 *
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 *
 * 还有，自除数不允许包含 0 。
 *
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/self-dividing-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<>();
        for (int i = left; i<=right; i++){
            if (i>=1 && i<=9){
                result.add(i);
                continue;
            }
            if (i % 10 == 0)
                continue;
            if (isSDN(i) == true)
                result.add(i);
        }
        return result;
    }

    public static boolean isSDN (int num){
        char[] nums = String.valueOf(num).toCharArray();
        for (char c : nums){
            if (c == '0')
                return false;
            if (num % (c-'0') != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> result = selfDividingNumbers(1,22);
        for (int i : result)
            System.out.println(i);
    }
}
