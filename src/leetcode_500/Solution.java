package leetcode_500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 */

/**
 * 发现：集合 Set复制的话，是引用复制，新旧一起修改
 */

public class Solution {
    public String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        ArrayList returnList = new ArrayList<>();

        for (int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            for (int j = 0; j<keyboard.length; j++){
                if (keyboard[j].indexOf(word.charAt(0)) != -1){
                    boolean flat = true;
                    for (char c : word.toCharArray()){
                        if (keyboard[j].indexOf(c) == -1)
                            flat = false;
                    }
                    if (flat == true)
                        returnList.add(words[i]);
                }
            }
        }

        return (String[])returnList.toArray(new String[returnList.size()]);


    }


    public static void main(String[] args) {
        String[] testString = {"Hello","Alaska","Dad","Peace"};
        Solution s = new Solution();
        String[] result = s.findWords(testString);
        for (String string : result){
            System.out.println(string);
        }
    }
}
