package Hashmap;

import java.util.HashMap;

public class lc_454 {
     public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // int count=0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         for(int k=0;k<nums3.length;k++){
        //             for(int l=0;l<nums4.length;l++){
        //                 if(nums1[i]+nums2[j]+nums3[k]+nums4[l]==0){
        //                     count++;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return count;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums1){
            for(int j:nums2){
                int sum=i+j;
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
        }
        int count=0;
        for(int k:nums3){
            for(int l:nums4){
                int complsum=k+l;
                int target=-complsum;
                count+=hm.getOrDefault(target,0);
              
            }
        }
        return count;


    }
}
