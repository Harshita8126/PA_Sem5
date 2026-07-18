package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class lc442_duplicatesInArray {
     public List<Integer> findDuplicates(int[] nums) {
       // freq array was created 
       // if a freq of num==2 add it into ans .
        List<Integer> ans= new ArrayList<>();
        int[] freq= new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
