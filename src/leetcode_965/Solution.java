package leetcode_965;

import java.util.HashSet;
import java.util.Set;

/**
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    Set<Integer> set = new HashSet<>();
    public boolean isUnivalTree(TreeNode root) {
        set.add(root.val);
        go(root.left);
        go(root.right);
        return set.size()==1;
    }

    void go(TreeNode root){
        if (root == null)
            return;
        set.add(root.val);
        go(root.left);
        go(root.right);
    }
}
