import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String s="madam";
        Deque<Character> dq=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            dq.addFirst(s.charAt(i));
        }
        StringBuilder res= new StringBuilder();
        while(!dq.isEmpty()){
            res.append(dq.removeFirst());
        }
        if(res.toString().equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}

