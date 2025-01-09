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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode root1 = root;
    while(root1 != null){
        if(root1.val == val){
            break;
        }else if(root1.val > val){
            root1 = root1.left;
        }
        else{
            root1 =root1.right;
        }
    }
        return root1;
    }
}