package leetcode_1365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
//
//换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
//
//以数组形式返回答案。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。


//更好的方法：先排序，再从左往右计算，若前一个小于自己则个数为index，若不是则个数不增加

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ret = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int times = 0;
            for (int j=0; j<nums.length; j++){
                if (nums[j] < nums[i])
                    times++;
            }
            ret[i] = times;
        }
        return ret;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        temp = Arrays.copyOf(nums, n);
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(i == 0){
                map.put(temp[i],0);
            }else{
                if(temp[i] > temp[i-1]){
                    map.put(temp[i],i);
                }else{
                    map.put(temp[i],map.get(temp[i-1]));
                }
            }
        }
        for(int i = 0; i < n; i++){
            temp[i] = map.get(nums[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int []test = {1,2,5,8,0};
        int []ret = s.smallerNumbersThanCurrent2(test);
        for (int i=0; i<ret.length; i++){
            System.out.println(ret[i]);

        }
        System.out.println("Test of Arrays.sort");
        int [] testCases = {1,53,4,0,-10,300};
        Arrays.sort(testCases);
        for (int i=0; i<testCases.length; i++){
            System.out.println(testCases[i]);

        }


    }
}
