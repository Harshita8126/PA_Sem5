package recursion;

public class lc_198houserobber {
    // at every step we have 2 choices either rob the house or skip the house . 
    // first we are calling backtrack(nums,0)
    // it will start recurison rob the house and the tree will continue until basecase meets 
    // then skip house will be calc
    // max of both is the required output 
    int backtrack(int[] nums,int index){
        if(index>=nums.length){
            return 0;
        }
        int robhouse=nums[index]+backtrack(nums,index+2);
        int skiphouse=backtrack(nums,index+1);
        return Math.max(robhouse,skiphouse);
    }
    public int rob(int[] nums) {
        return backtrack(nums,0);
    }
}

