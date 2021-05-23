package leetcode_108;

import java.util.Arrays;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */

public class Solution {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
       return doSort(nums,0,nums.length-1);
    }

    private TreeNode doSort(int[] nums, int l, int r) {
        if (l>r)
            return null;
        TreeNode resultNode = new TreeNode(nums[(l+r)/2]);
        resultNode.left = doSort(nums,l,(l+r)/2-1);
        resultNode.right = doSort(nums,(l+r)/2+1,r);
        return resultNode;
    }

}
