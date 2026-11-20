public class gfg_countLeaves {
    int countLeaves(Node node) {
        // code here 
        if(node==null) return 0;
        if(node.left==null && node.right==null) return 1;
        
        return countLeaves(node.left)+countLeaves(node.right);
    }
}
