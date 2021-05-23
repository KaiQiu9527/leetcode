package leetcode_257;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    ArrayList<String> returnList = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return returnList;
        if (root.left == null && root.right == null){
            returnList.add(root.val+"");
            return returnList;
        }
        if (root.left != null)
            doIteration(root.left,root.val+"");
        if (root.right != null)
            doIteration(root.right,root.val+"");
        return returnList;
    }

    void doIteration(TreeNode root, String path){
        if (root == null)
            return;
        String nowPath = path+"->"+root.val;
        if (root.left == null && root.right == null){
            returnList.add(nowPath);
            return;
        } else {
            doIteration(root.left, nowPath);
            doIteration(root.right, nowPath);
        }
    }

}
