package leetcode_349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 */

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> returnList = new ArrayList<>();

        for (int i : nums1){
            set1.add(i);
        }

        for (int i : nums2){
            set2.add(i);
        }

        for (int i : set1){
            if (set2.contains(i))
                returnList.add(i);
        }

        int[] returnArray = new int[returnList.size()];
        for (int i=0; i<returnList.size(); i++){
            returnArray[i] = returnList.get(i);
        }
        return returnArray;

    }
}
