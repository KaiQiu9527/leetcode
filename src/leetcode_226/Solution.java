package leetcode_226;

/**
 * 翻转一棵二叉树。
 */

public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  public TreeNode invertTree1(TreeNode root) {
        if (root == null)
            return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        root.left = invertTree1(root.left);
        root.right = invertTree1(root.right);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {
        if (root == null)
            return root;
        TreeNode left = invertTree2(root.left);
        TreeNode right = invertTree2(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
