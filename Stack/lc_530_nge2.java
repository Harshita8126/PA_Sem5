import java.util.Arrays;
import java.util.*;
// import implUsingArray.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] result= new int[n];
        Arrays.fill(result,-1);
        Stack<Integer> st= new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int currindex=i%n;
            while(!st.isEmpty() && st.peek()<=nums[currindex]){
                st.pop();
            }
            if(i<n){
            if(!st.isEmpty()){
                result[i]=st.peek();
            }
            }
            st.push(nums[currindex]);
        }
        return result;
    }
}