package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class lc_1431_candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //first maxel was calculated and then condition was applied 
        // if after adding extra candies it is greater than or equal to maxel .
        List<Boolean> ans=new  ArrayList<>();
        int maxel=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxel){
                maxel=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxel){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;

    }
}
