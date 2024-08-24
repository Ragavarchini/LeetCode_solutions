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
    public static void inorder(TreeNode root, ArrayList<Integer> list)
    {
        if(root == null)
         return ;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        
    }
    public int getMinimumDifference(TreeNode root) {
        if(root.left==null && root.right==null)
           return root.val;
       ArrayList<Integer> list = new ArrayList<>();
      
       inorder(root,list); 
      if(list.size()==1)
        return list.get(0);
        int ind,min=Integer.MAX_VALUE,diff;
        for(ind=1;ind<list.size();ind++)
        {
            diff = list.get(ind) - list.get(ind-1);
                if(diff<min)
                    min=diff;
        }       
        return min;
    }
}