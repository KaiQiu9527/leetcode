package leetcode_1299;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *
 * 完成所有替换操作后，请你返回这个数组。
 */

public class Solution {
    public static int[] replaceElements(int[] arr) {
        int currIndex = arr.length-2;
        int maxValue= arr[arr.length-1];
        //如果只有一个，无法比较，将其设为-1返回
        if (currIndex <0)
            return new int[]{-1};
        //如果大于一个，则可以比较，从右往左
        for (; currIndex>=0 ; currIndex--){
            if (arr[currIndex]<=maxValue)
                arr[currIndex] = maxValue;
            else {
                int temp = arr[currIndex];
                arr[currIndex] = maxValue;
                maxValue = temp;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        int[] testArr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(testArr)));
    }
}
