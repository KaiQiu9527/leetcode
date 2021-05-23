package leetcode_589;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 * 返回其前序遍历: [1,3,5,6,2,4]。
 * 前序遍历：先根，后左，再右。
 *
 *
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
    List<Integer> result = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if (root == null)
            return result;
        result.add(root.val);
        for (Node child : root.children){
            doPreOrder(child);
        }
        return result;



    }

    public void doPreOrder(Node root){
        if (root != null)
            result.add(root.val);
        for (Node child : root.children){
            doPreOrder(child);
        }
    }
}
