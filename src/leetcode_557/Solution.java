package leetcode_557;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int l=0,r=0;
        char[] chars = s.toCharArray();
        for (;r<chars.length;){
            if (chars[r] == ' ' || r == chars.length-1){
                int i;
                if (r == chars.length-1)
                    i = r;
                else
                    i = r-1;
                while (i>=l){
                    sb.append(chars[i]);
                    i--;
                }
                if (r != chars.length-1)
                    sb.append(" ");
                l = r+1;
                r = l;
            }
            else
                r++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String testString = "I love u";
        System.out.println(s.reverseWords(testString));
    }
}
