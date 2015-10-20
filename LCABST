/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // Basic condition
        if(root==null)
            return null;
            
        int min,max;
        
        // Get min and max between p and q.
        if(p.val<q.val)
        {
            min = p.val;
            max = q.val;
        }
        else
        {
            min = q.val;
            max = p.val;
        }
        
        // LCA in left subtree.
        if(root.val > max)
            return lowestCommonAncestor(root.left, p, q);
        // LCA in right subtree.
        else if(root.val < min)
            return lowestCommonAncestor(root.right, p, q);
        // Standing on LCA.
        else
            return root;
    }
}
