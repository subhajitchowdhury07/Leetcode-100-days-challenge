/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(TreeNode root, List<String> list, String path ){
        if(root == null){
            return;
        }
        path += root.val;

        if(root.left == null && root.right == null){
            // String ab = root.val.toString();
            list.add(path);
            return;
        }
        helper(root.left, list, path+"->");
        helper(root.right, list, path+"->");

        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root,list, "");
        return list;
    }
}