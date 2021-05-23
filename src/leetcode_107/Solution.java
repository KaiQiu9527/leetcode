package leetcode_107;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    HashMap<Integer, ArrayList<Integer>> trees = new HashMap<>();
    int maxLevel = 0;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        int level = 0;
        trees.put(0,new ArrayList<>());
        trees.get(0).add(root.val);
        if (root.left != null)
            doIteration(root.left,1);
        if (root.right !=null)
            doIteration(root.right,1);
        List<List<Integer>> returnList = new ArrayList<>();
        for (int i=maxLevel; i>=0; i--){
            returnList.add(trees.get(i));
        }
        return returnList;
    }

    void  doIteration(TreeNode root, int level){
        if (root == null)
            return;
        if (level>maxLevel)
            maxLevel = level;
        if (trees.get(level) == null)
            trees.put(level,new ArrayList<>());
        trees.get(level).add(root.val);
        doIteration(root.left,level+1);
        doIteration(root.right, level+1);

    }
}
