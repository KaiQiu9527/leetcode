package leetcode_1480;

public class Solution {
    public static int[] runningSum(int[] nums) {
        int[] returnArray = new int[nums.length];
        returnArray[0] = nums[0];
        for (int i = 1; i<nums.length; i++){
            returnArray[i] = returnArray[i-1] + nums[i];
        }
        return returnArray;
    }

    public static void main(String[] args) {
        int[] testArray = {3,1,2,10,1};
        int[] returnArray = runningSum(testArray);
        for (int i : returnArray){
            System.out.println(i);
        }
    }
}
