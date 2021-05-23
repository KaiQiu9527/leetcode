package leetcode_1309;

/**
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 *
 * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
 * 返回映射之后形成的新字符串。
 *
 * 题目数据保证映射始终唯一。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public static String freqAlphabets(String s) {
        StringBuffer sb = new StringBuffer();
        String[] preSplit = s.split("#");
        for (int i = 0; i < preSplit.length; i++) {

            //判断s最后不是#,则需要特别对待
            if (i == preSplit.length - 1 && s.charAt(s.length() - 1) != '#') {
                char[] split2 = preSplit[i].toCharArray();
                for (char c : split2) {
                    sb.append((char) ('a' + (c - '0') - 1));
                }
                break;
            }

            if (i == preSplit.length - 1 && s.charAt(s.length() - 1) == '#') {
                //若xx#则
                if (preSplit[i].length() == 2) {
                    sb.append((char) ('a' + (preSplit[i].charAt(0) - '0') * 10 + (preSplit[i].charAt(1) - '0') - 1));
                    break;
                } else {
                    char[] split2 = preSplit[i].toCharArray();
                    for (int j = 0; j < split2.length; j++) {
                        if (j == split2.length - 2) {
                            sb.append((char) ('a' + (split2[split2.length - 2] - '0') * 10 + (split2[split2.length - 1] - '0') - 1));
                            break;
                        }
                        sb.append((char) ('a' + (split2[j] - '0') - 1));
                    }
                    break;
                }

            }

                //如果不是，则两位数为xx#，大于两位数为多个单数字+xx#，一位数字为单数字
                if (preSplit[i].length() == 2) {
                    sb.append((char) ('a' + (preSplit[i].charAt(0) - '0') * 10 + (preSplit[i].charAt(1) - '0') - 1));
                    continue;
                } else {
                    if (preSplit[i].length() < 2) {
                        sb.append('a' + (preSplit[i].charAt(0) - '0') - 1);
                        continue;
                    } else {
                        char[] split2 = preSplit[i].toCharArray();
                        for (int j = 0; j < split2.length; j++) {
                            if (j == split2.length - 2) {
                                sb.append((char) ('a' + (split2[split2.length - 2] - '0') * 10 + (split2[split2.length - 1] - '0') - 1));
                                break;
                            }
                            sb.append((char) ('a' + (split2[j] - '0') - 1));
                        }
                        continue;
                    }
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(freqAlphabets(s));
    }
}
