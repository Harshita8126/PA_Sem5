import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<Integer> cst= new Stack<>();
        Stack<String> sst= new Stack<>();
        String cString="";
        int cnum=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                cnum=cnum*10+(ch-'0');
            }
            else if(ch=='['){
                cst.push(cnum);
                sst.push(cString);
                cnum=0;
                cString="";
            }
            else if(ch==']'){
                int c=cst.pop();
                String pString=sst.pop();
                StringBuilder temp= new StringBuilder();
                for(int i=0;i<c;i++){
                    temp.append(cString);
                }
                cString=pString+temp.toString();
            }
            else{
                cString+=ch;
            }
        }
        return cString;



    }
}