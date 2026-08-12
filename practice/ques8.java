package practice;

import java.util.Scanner;

public class ques8 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int perc=sc.nextInt();
        if(perc>=90){
            System.out.println("A+");
        }
        else if(perc>=80){
            System.out.println("A");
        }
        else if(perc>=70){
            System.out.println("B");
        }
        else if(perc>=60){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
