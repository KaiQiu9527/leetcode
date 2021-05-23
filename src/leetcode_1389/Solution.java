package leetcode_1389;

import java.util.ArrayList;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            arrayList.add(index[i],nums[i]);
        }
        int [] ret = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            ret[i] = arrayList.get(i);
        }
        return ret;
    }
}
