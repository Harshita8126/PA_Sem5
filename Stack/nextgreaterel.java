import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextgreaterel {
     public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        int[] result= new int[n];
        Arrays.fill(result,-1);
        Stack<Integer> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                result[i]=st.peek();
            }
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x:result){
            ans.add(x);
        }
        return ans;
        
    }
}
