package leetcode_897;

import java.util.ArrayList;

/**
 * 给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> nums = new ArrayList<>();
        doLoop(root,nums);
        TreeNode returnTree = new TreeNode(0);
        TreeNode curTree = returnTree;
        for (int i : nums){
            curTree.right = new TreeNode(i);
            curTree = curTree.right;
        }
        return returnTree.right;
    }

    public void doLoop(TreeNode root, ArrayList<Integer> nums){
        if (root == null)
            return;
        doLoop(root.left,nums);
        nums.add(root.val);
        doLoop(root.right,nums);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

    }

}
