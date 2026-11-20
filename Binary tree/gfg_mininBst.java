public class gfg_mininBst {
    public int minValue(Node root) {
        // code here
       if(root==null) return -1;
       while(root.left!=null){
          root=root.left;
    }
    return root.data;}
}
