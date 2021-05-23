package leetcode_1342;

public class Solution {
    public int numberOfSteps (int num) {
        int steps = divideBy2(num,0);
        return steps;
    }

    private int divideBy2(int num, int step) {
        int steps = step;
        if (num == 0)
            return steps;
        if (num/2*2 == num){
            return  divideBy2(num/2,steps+1);
        } else {
            return divideBy2(num-1,steps+1);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int testNum = 123;
        System.out.println(s.numberOfSteps(testNum));
    }



}


