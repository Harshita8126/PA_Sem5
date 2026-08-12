package practice;

import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int n =s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int dgt=s.charAt(i)-'0';
            sum+=Math.pow(dgt, n);
        }
        int num=Integer.parseInt(s);
        if(sum==num){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        sc.close();
    }
}
