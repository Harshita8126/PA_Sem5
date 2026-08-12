package practice;

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int units=sc.nextInt();
        double amt;
        if(units<=100){
            amt=units*5;
        }
        else if(units<=200){
            amt=(100*5)+(units-100)*7;
        }
        else{
            amt=100*5+100*7+(units-200)*10;
        }
        System.out.println(amt);
        sc.close();
    }
}
