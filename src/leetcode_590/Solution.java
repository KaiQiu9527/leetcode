package leetcode_590;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    /*
// Definition for a Node.
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
    List<Integer> result = new LinkedList<>();


    public List<Integer> postorder(Node root) {
        if (root == null)
            return result;
        doPostOrder(root);
        return result;
    }

    public void doPostOrder(Node root){
        if (root.children == null)
            result.add(root.val);
        else {
            for (Node child : root.children) {
                doPostOrder(child);
            }
            result.add(root.val);
        }



    }
}
