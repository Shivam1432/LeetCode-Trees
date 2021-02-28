/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode p=head;
        int n=0;
        while(p!=null)
        {
            n++;
            p=p.next;
        }
        p=head;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=p.val;
            p=p.next;
        }
        return buildBST(arr,0,n-1);
    }
    public TreeNode buildBST(int[] arr,int start,int end)
    {
        if(start>end)
    return null;
    int mid=start+(end-start)/2;
    TreeNode tmp=new TreeNode(arr[mid]);
    tmp.left=buildBST(arr,start,mid-1);
    tmp.right=buildBST(arr,mid+1,end);
    return tmp;
    }
}
