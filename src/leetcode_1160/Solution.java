package leetcode_1160;

import java.util.ArrayList;

/**
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        int[] charactersArray = new int[26];
        for (char c : chars.toCharArray()){
            charactersArray[c-'a']++;
        }

        a: for (String word: words){
            if (word.length() > chars.length())
                continue;
            int[] tempArray = charactersArray.clone();
            for (char c : word.toCharArray()){
                if (tempArray[c-'a'] == 0)
                    continue a;
                tempArray[c-'a']--;
            }
            result += word.length();
        }

        return result;
    }

    public static void main(String[] args) {
        String[] word = new String[]{"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(new Solution().countCharacters(word,chars));
    }
}
