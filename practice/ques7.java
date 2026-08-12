package practice;

import java.util.Scanner;

public class ques7 {
    public static void checkyr(int year){
        if((year%400==0)|| (year%100!=0 && year%4==0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year=sc.nextInt();
        checkyr(year);
        sc.close();
    }
}
