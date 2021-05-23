package leetcode_1431;

        import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.List;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNum = 0;
        for (int i : candies){
            if (i>maxNum)
                maxNum = i;
        }
        List<Boolean> returnList = new ArrayList<>() {
        };
        for (int i: candies){
            if (i + extraCandies >= maxNum) {
                returnList.add(true);
            } else {
                returnList.add(false);
            }
        }
        for (int i = 0; i<returnList.size(); i++)
        {
            System.out.println(returnList.get(i));
        }
        return returnList;
    }

    public static void main(String[] args) {
        kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);

    }
}
