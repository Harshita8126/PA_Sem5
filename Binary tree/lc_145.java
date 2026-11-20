import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class lc_145 {
     public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        postorder(root,result);
        return result;
    } 
    public void postorder(TreeNode root, List<Integer> result){
        if(root==null){
            return;
        }
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);

    }
}
