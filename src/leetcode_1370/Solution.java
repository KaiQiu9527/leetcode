package leetcode_1370;

import java.util.Arrays;
import java.util.Stack;

/**
 * 给你一个字符串 s ，请你根据下面的算法重新构造字符串：
 *
 * 从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
 * 从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
 * 重复步骤 2 ，直到你没法从 s 中选择字符。
 * 从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
 * 从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
 * 重复步骤 5 ，直到你没法从 s 中选择字符。
 * 重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
 * 在任何一步中，如果最小或者最大字符不止一个 ，你可以选择其中任意一个，并将其添加到结果字符串。
 *
 * 请你返回将 s 中字符重新排序后的 结果字符串 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/increasing-decreasing-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0)
            return "";
        if (chars.length == 1)
            return s;
        Arrays.sort(chars);
        Stack<Character> stack1 = new Stack();
        Stack<Character> stack2 = new Stack();
        StringBuffer sb = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            stack1.push(chars[i]);
        }
        int count = 0;
        while (count < chars.length) {
            //从小到大排
            if (stack1.isEmpty())
                break;
            char compare = stack1.peek();
            sb.append(stack1.pop());
            for (; ; ) {
                if (stack1.isEmpty())
                    break;
                char c = stack1.pop();
                if (c == compare) {
                    stack2.push(c);
                } else {
                    sb.append(c);
                    compare = c;
                    count++;
                }
            }
            //从大到小排
            if (stack2.isEmpty())
                break;
            compare = stack2.peek();
            sb.append(stack2.pop());
            for (; ; ) {
                if (stack2.isEmpty())
                    break;
                char c = stack2.pop();
                if (c == compare) {
                    stack1.push(c);
                } else {
                    sb.append(c);
                    compare = c;
                    count++;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "spo";
        String result = sortString(s);
        System.out.println(result);
    }
}
