package Hashmap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class lc_451 {
      public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        StringBuilder res= new StringBuilder();
        while(!pq.isEmpty()){
            char ch= pq.poll();
            int freq= hm.get(ch);
            for(int i=0;i<freq;i++){
                res.append(ch);
            }
        }
        return res.toString();
    }
}
