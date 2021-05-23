package leetcode_1313;

import java.util.ArrayList;

public class Solution {
    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> adjusted;
        adjusted =  start(nums);
        int[] ret  = new int[adjusted.size()];
        for (int i=0; i < adjusted.size(); i++) {
            ret[i] = adjusted.get(i);
        }
        return  ret;
    }

    private ArrayList<Integer> start(int[] nums) {
        ArrayList<Integer> adjusted = new ArrayList<>();
        adjusted =  start2(nums,adjusted,0,nums.length);
        return adjusted;
    }

    private ArrayList<Integer> start2(int[] nums, ArrayList<Integer> adjusted, int l, int length) {
        if ( l+2 > length)
            return adjusted;
        int a = nums[l];
        int b =nums[l+1];
        for (int i = 0; i<a ; i++) {
            adjusted.add(b);
        }
        return start2(nums,adjusted,l+2,length);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] testArray = new int[]{1,2,3,4};
        int[] ret = s.decompressRLElist(testArray);
        for (int i : ret) {
            System.out.println(i);
        }
    }
}
