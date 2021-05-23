package leetcode_1047;

import java.util.Stack;

/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 *
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : S.toCharArray()){
            if (characterStack.isEmpty())
                characterStack.push(c);
            else {
                if (c == characterStack.peek()){
                    characterStack.pop();
                    continue;
                } else
                    characterStack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!characterStack.isEmpty()){
            sb.append(characterStack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String testString = "aaaaaaaabcdd";
        System.out.println(new Solution().removeDuplicates(testString));
    }

}
