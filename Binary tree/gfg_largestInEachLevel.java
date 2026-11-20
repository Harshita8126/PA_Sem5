import java.util.ArrayList;
import java.util.Queue;

public class gfg_largestInEachLevel {
     public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root==null) return ans ;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                Node val=q.poll();
                max=Math.max(val.data,max);
                
                if(val.left!=null ){
                    q.add(val.left);
                }
                if(val.right!=null){
                    q.add(val.right);
                }
            }
                ans.add(max);
        }
            return ans;
        
    }
}
