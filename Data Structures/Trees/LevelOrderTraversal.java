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
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); 

        List<Integer> c;
        int n;
        TreeNode t;
        boolean rev = false;

        while(!q.isEmpty()) {
            c = new ArrayList<>();
            n = q.size();

            for(int i=0; i<n; i++) {
                t = q.poll();
                c.add(t.val);

                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
            }

            if(rev) Collections.reverse(c);
            rev = !rev;
            
            res.add(c);
        }

        return res;
    }
}
