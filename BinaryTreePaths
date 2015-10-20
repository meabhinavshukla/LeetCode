/*
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
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
    public List<String> binaryTreePaths(TreeNode root) {
       
        // path - to store a path
        ArrayList<Integer> path = new ArrayList<Integer>();
        
        // upper index to be maintianed 
        int upperIndex=0;
        
        // answer List
        List<String> ans = new ArrayList<String>();
        
        // If root i equal to null then return empty list
        if(root==null)
            return ans;
            
        // Call the helper function to get all the paths    
        getPath(root, ans, path, upperIndex);
        return ans;
    }
    
    // Helper function, recursive solution to get all root to leaf path in the list-> ans
    public void getPath(TreeNode root, List<String> ans, ArrayList<Integer> path, int upperIndex)
    {
        
        while(true)
        {
            path.add(upperIndex, root.val);
            if(root.left==null && root.right==null)
            {
                String s = "";
                for(int a : path)
                {
                    s = s + a + "->";
                }
                s = s.substring(0, s.length()-2);
                ans.add(s);
            }
            if(root.left!=null)
                getPath(root.left, ans, path, upperIndex+1);
            
            if(root.right!=null)
                getPath(root.right, ans, path, upperIndex+1);
            
            path.remove(upperIndex);    
            break;
        }
    }
}
