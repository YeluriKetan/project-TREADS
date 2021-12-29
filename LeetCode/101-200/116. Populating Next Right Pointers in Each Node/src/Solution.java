/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        connect(root.left);
        connect(root.right);
        stitch(root.left, root.right);
        return root;
    }

    private void stitch(Node left, Node right) {
        while (left != null) {
            left.next = right;
            left = left.right;
            right = right.left;
        }
    }
}
