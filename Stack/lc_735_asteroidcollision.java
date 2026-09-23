import java.util.Stack;

public class lc_735_asteroidcollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        for(int x:asteroids){
            if(st.isEmpty() || x>0){
                st.push(x);
                continue;
            }
            while(!st.isEmpty() && st.peek()>0 && st.peek()<-x){
                st.pop();
            }
            if(st.isEmpty()|| st.peek()<0){
                st.push(x);
            }
            else if(st.peek()==-x){
                st.pop();
            }
        }    
        int[] ans= new int[st.size()];
        for(int i=0;i<st.size();i++){
            ans[i]=st.get(i);
        }
        return ans;
        }
}
