package leetcode_709;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */

public class Solution {
    public String toLowerCase(String str) {
        int diff = 'a' - 'A';
        char[] chars = str.toCharArray();
        for (int i=0; i<chars.length; i++){
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                chars[i] += diff;
        }
        return String.valueOf(chars);
    }
}
