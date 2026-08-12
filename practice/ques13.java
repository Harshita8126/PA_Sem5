package practice;

import java.util.Scanner;

public class ques13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
