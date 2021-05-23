package leetcode_1528;

import java.util.HashMap;

public class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<>();
        for (int i=0; i<indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<indices.length; i++) {
            sb.append(map.get(i));
        }
        return sb.toString();
    }
}
