public class gfg_sumOfBinarytree {
     static int sumBT(Node root) {
        // code here
        if(root==null) return 0;
        return root.data+sumBT(root.left)+sumBT(root.right);
    }
}
