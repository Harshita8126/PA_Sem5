package ArrayList;

import java.util.*;

public class lc_989_arrayAddition {
    public List<Integer> addToArrayForm(int[] num, int k) {
       
// Traversing from the last digit
// Adding digits with carry
// Storing the current digit
// Reversing the answer

        List<Integer> ans = new ArrayList<>();
        int n= num.length;
        int carry=0;
        int i=n-1;
        while(k>0||i>=0||carry>0){
            int sum=carry;
            if(k>0){
                int rem=k%10;
                sum+=rem;
                k=k/10;
            }
            if(i>=0){
                sum+=num[i];
                i--;
            }
            carry=sum/10;
            ans.add(sum%10);
        }
        Collections.reverse(ans);
        return ans;


    }
}