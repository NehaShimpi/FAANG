
/*
https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/141/basic-operations-in-a-bst/1003/
Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
For example,
Given the tree:
        4
       / \
      2   7
     / \
    1   3
And the value to insert: 5
You can return this binary search tree:
         4
       /   \
      2     7
     / \   /
    1   3 5
This tree is also valid:
         5
       /   \
      2     7
     / \
    1   3
         \
          4
 */
public class InsertIntoABinarySearchTree {
    public static void main(String[] args) {
//        System.out.println(insertIntoBST(createTreeNode(new Integer[]{4, 2, 7, 1, 3}), 5));
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
//        if (root.left != null && root.val > val) root.left = insertIntoBST(root.left, val);
//        if (root.right != null && root.val < val) root.right = insertIntoBST(root.right, val);
//        if (root.left == null && root.val > val) root.left = new TreeNode(val);
//        if (root.right == null && root.val < val) root.right = new TreeNode(val);
        return root;
    }
    static class TreeNode {
        int val;
        TraverseATree.TreeNode left;
        TraverseATree.TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val +
                    ", left=" + left +
                    ", right=" + right;
        }
    }
}