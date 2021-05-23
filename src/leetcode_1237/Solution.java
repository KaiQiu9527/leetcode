package leetcode_1237;

import java.util.LinkedList;
import java.util.List;

/**
 * 给出一个函数  f(x, y) 和一个目标结果 z，请你计算方程 f(x,y) == z 所有可能的正整数 数对 x 和 y。
 *
 * 给定函数是严格单调的，也就是说：
 *
 * f(x, y) < f(x + 1, y)
 * f(x, y) < f(x, y + 1)
 * 函数接口定义如下：
 *
 * interface CustomFunction {
 * public:
 *   // Returns positive integer f(x, y) for any given positive integer x and y.
 *   int f(int x, int y);
 * };
 * 如果你想自定义测试，你可以输入整数 function_id 和一个目标结果 z 作为输入，其中 function_id 表示一个隐藏函数列表中的一个函数编号，题目只会告诉你列表中的 2 个函数。  
 *
 * 你可以将满足条件的 结果数对 按任意顺序返回。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-positive-integer-solution-for-a-given-equation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class CustomFunction {
    // Returns f(x, y) for any given positive integers x and y.
    // Note that f(x, y) is increasing with respect to both x and y.
    // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
    public int f(int x, int y){
        return 0;
    };
};

public class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> returnList = new LinkedList<>();
        for(int i=1,j=1000; i<1000 && j>=1;){
            int result = customfunction.f(i,j);
                if (result == z){
                    List<Integer> nums = new LinkedList<>();
                    nums.add(i);
                    nums.add(j);
                    returnList.add(nums);
                    i++;
                    j--;
                } else {
                    if (result > z){
                        j--;
                    } else
                        i++;
                }
            }
        return returnList;
    }
}
