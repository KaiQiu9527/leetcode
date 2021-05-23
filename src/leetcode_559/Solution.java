package leetcode_559;

import java.util.List;

/**
 * 给定一个 N 叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int maxDepth = 0;
        for (Node child : root.children){
            int depth = maxDepth(child);
            maxDepth = Math.max(maxDepth,depth);
        }
        return maxDepth+1;
    }


}
