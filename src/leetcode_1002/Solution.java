package leetcode_1002;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public List<String> commonChars(String[] A) {
        Map<Character,Integer> chars = new HashMap<>();
        for (char c : A[0].toCharArray()){
            if (chars.containsKey(c)){
                chars.put(c,chars.get(c)+1);
            } else {
                chars.put(c,1);
            }
        }

        for (char c : chars.keySet()){
            int max = chars.get(c);
            for (int i=1; i<A.length; i++){
                int num = 0;
                for (char cc : A[i].toCharArray()){
                    if (cc == c)
                        num++;
                }
                if (num<max)
                    max = num;
            }
            chars.put(c,max);
        }

        List<String> returnList = new LinkedList<>();
        for (char c : chars.keySet()){
            if (chars.get(c) !=0){
                for (int i=0; i<chars.get(c); i++){
                    returnList.add(String.valueOf(c));
                }
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        String[] testArray = new String[]{"bella","label","roller"};
        Solution s = new Solution();
        s.commonChars(testArray);
    }
}
