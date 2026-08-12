package practice;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        double perc=(total/500.0)*100;
        double avg=total/5.0;
        System.out.println(total);
        System.out.println(perc);
        System.out.println(avg);
        sc.close();
    }
}
