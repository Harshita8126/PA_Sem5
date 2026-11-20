public class gfg_kthlargestinbst {
     static int count=0;
    static int ans=-1;
    public int kthLargest(Node root, int k) {
        // code here
        count=0;
        ans=-1;
        findk(root,k);
        return ans;
        
        
    }
    public void findk(Node root,int k){
        if(root==null) return ;
        findk(root.right,k);
        if(count>=k) {
            return;
        }
        count++;
        if(count==k){
            ans=root.data;
            return ;
        }
        findk(root.left,k);
    }
}
