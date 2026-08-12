package practice;

import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int fct=1;
        for(int i=1;i<=num;i++){
            fct=fct*i;
        }
        System.out.println(fct);
        sc.close();
    }
}
