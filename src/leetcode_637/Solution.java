package leetcode_637;

import java.awt.font.FontRenderContext;
import java.util.*;

/**
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    Map<Integer, Integer> levels = new HashMap<>();
    Double[] sums = new Double[100];

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null)
            return null;
        levels.put(0,1);
        sums[0] = (double)root.val;
        go(root.left,1);
        go(root.right,1);
        for (int i=0; i<levels.size(); i++){
            sums[i] = sums[i]/levels.get(i);
        }
        List<Double> returnList = new LinkedList<>();
        for (double d : sums){
            returnList.add(d);
        }
        return returnList;
    }

    private void go(TreeNode root,int level){
        if (root == null)
            return;
        if (!levels.containsKey(level))
            levels.put(level,0);
        levels.put(level,levels.get(level)+1);
        sums[level] += root.val;
        go(root.left,level+1);
        go(root.right,level+1);
    }
}
