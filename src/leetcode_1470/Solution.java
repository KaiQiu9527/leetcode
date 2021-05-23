package leetcode_1470;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static int[] shuffle(int[] nums, int n) {
        int i = 0;
        int[] returnNums = new int[nums.length];
        for (int j = 0; j<n*2; j+=2){
            returnNums[j] = nums[i];
            i++;
        }
        for (int j = 1; j<n*2; j+=2){
            returnNums[j] = nums[i];
            i++;
        }
        return returnNums;
    }

    public static int[] shuffle2(int[] nums, int n) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        for (int i=0,j=n; i<n; i++,j++){
            returnList.add(nums[i]);
            returnList.add(nums[j]);
        }
        int[] returnNums = new int[nums.length];
//        for (int i = 0; i<returnList.size(); i++){
//            returnNums[i] = returnList.get(i);
//        }
        return returnNums;
    }

    public static void main(String[] args) {
        shuffle(new int[]{2,5,1,3,4,7},3);
    }

}
