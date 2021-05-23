package leetcode_806;

import java.util.HashMap;

/**
 * 我们要把给定的字符串 S 从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，那么我们应该把这个字母写到下一行。我们给定了一个数组 widths ，这个数组 widths[0] 代表 'a' 需要的单位， widths[1] 代表 'b' 需要的单位，...， widths[25] 代表 'z' 需要的单位。
 *
 * 现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？将你的答案作为长度为2的整数列表返回。
 *
 * 示例 1:
 * 输入:
 * widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
 * S = "abcdefghijklmnopqrstuvwxyz"
 * 输出: [3, 60]
 * 解释:
 * 所有的字符拥有相同的占用单位10。所以书写所有的26个字母，
 * 我们需要2个整行和占用60个单位的一行。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-lines-to-write-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

public class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int row = 1;
        int tmpRow = 0;
        for (char c : s.toCharArray()){
            tmpRow += widths[c-'a'];
            if (tmpRow <= 100)
            {
                continue;
            }
            else {
                row++;
                tmpRow = widths[c-'a'];
            }
        }
        return new int[]{row,tmpRow};
    }

    public static int main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>(){};
        marks.put("A",100);
        marks.put("B",80);
        System.out.println(marks);
        return 0;
    }
}
