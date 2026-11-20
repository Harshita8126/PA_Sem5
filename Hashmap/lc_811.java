package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc_811 {
     public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String cpdomain:cpdomains){
            String[] parts= cpdomain.split(" ");
            int c=Integer.parseInt(parts[0]);
            String domain=parts[1];
            while(true){
                hm.put(domain,hm.getOrDefault(domain,0)+c);
            int index=domain.indexOf('.');
            if(index==-1){
                break;
            }
            domain=domain.substring(index+1);
            }
        
        }
    List<String> res= new ArrayList<>();
    for(String domain:hm.keySet()){
        res.add(hm.get(domain)+" "+domain);
    }
    
    return res;
    }
}
