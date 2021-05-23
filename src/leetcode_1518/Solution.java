package leetcode_1518;

/**
 * 小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
 *
 * 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
 *
 * 请你计算 最多 能喝到多少瓶酒。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/water-bottles
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles<numExchange)
            return numBottles;
        int drunk = numBottles + numBottles/numExchange; // 第一轮总共喝了这么多
        int empty = numBottles/numExchange + numBottles%numExchange;
        return drunk + calBottles(empty,numExchange);
    }

    int calBottles(int numBottles, int numExchange){
        if (numBottles<numExchange)
            return 0;
        int drunk = numBottles/numExchange; // 这一轮总共喝了这么多
        int empty = numBottles/numExchange + numBottles%numExchange;
        return drunk + calBottles(empty,numExchange);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numWaterBottles(9,3));
    }
}
