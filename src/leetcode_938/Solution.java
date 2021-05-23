package leetcode_938;

/**
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 *
 * 二叉搜索树保证具有唯一的值。
 */

import java.util.IllegalFormatCodePointException;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    int result = 0;

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public int rangeSumBST(TreeNode root, int L, int R) {
        cal(root,L,R);
        return result;

    }

    public void cal(TreeNode node, int L, int R){
        if (node == null)
            return;
        if (node.val>=L && node.val<=R)
            result += node.val;
        if (node.val > L)
            cal(node.left,L,R);
        if (node.val < R)
            cal(node.right,L,R);
    }
}
