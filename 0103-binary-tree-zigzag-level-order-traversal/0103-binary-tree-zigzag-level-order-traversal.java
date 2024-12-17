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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        List<Integer> currAns = new ArrayList<>();
        int level=0;

        Stack<TreeNode> main =new Stack<>();
        Stack<TreeNode> helper =new Stack<>();

        main.push(root);

        while(main.size()>0){
            TreeNode currNode = main.pop();
            currAns.add(currNode.val);

            if(level == 0){
                if(currNode.left !=null){
                    helper.push(currNode.left);
                }
                if(currNode.right !=null){
                    helper.push(currNode.right);
                }
            }else{
                if(currNode.right !=null){
                    helper.push(currNode.right);
                }
                 if(currNode.left !=null){
                    helper.push(currNode.left);
                }
            }

            if(main.size() == 0){
                ans.add(currAns);
                currAns =new ArrayList<>();
                level = 1- level;
            main = helper;
            helper = new Stack<>();
            }

        }

        return ans;
    }
}














