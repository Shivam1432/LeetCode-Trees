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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        int path[]=new int[1000];
        printPath(root,path,0);
        return sum;
    }
    public void printPath(TreeNode root,int[] path,int len)
    {
        if(root==null)
            return;
        path[len++]=root.val;
        if(root.left==null && root.right==null)
        {
            printAllPaths(path,len);
        }
        printPath(root.left,path,len);
        printPath(root.right,path,len);
    }
    public void printAllPaths(int[] path,int len)
    {
        int val=0;
        for(int i=0;i<len;i++)
        {
            val=val*10+path[i];
        }
        sum+=val;
    }
}
