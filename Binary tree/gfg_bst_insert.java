public class gfg_bst_insert {
     public Node insert(Node root, int key) {
        // code here
        if(root==null) return new Node(key);
        if(root.data<key){
            root.right= insert(root.right,key);
            
        }
        else if(root.data>key){
            root.left=insert(root.left,key);
        }
        return root;
    }
}
