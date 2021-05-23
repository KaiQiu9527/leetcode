package leetcode_1266;


/*
平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
你可以按照下面的规则在平面上移动：
每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
必须按照数组中出现的顺序来访问这些点。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-time-visiting-all-points
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

解法：比较x轴和y轴的距离，最大值为答案
 */




class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;

        for (int i=0; i<points.length-1; i++){
            result += calD(points[i],points[i+1]);
        }

        return result;
    }

    private int calD(int[] point, int[] point1) {
        int currentX = point[0];
        int currentY = point[1];
        int nextX = point1[0];
        int nextY = point1[1];

        int xD = Math.abs(nextX-currentX);
        int yD = Math.abs(nextY-currentY);

        int result = xD < yD ? yD : xD;
        return result;
    }
}