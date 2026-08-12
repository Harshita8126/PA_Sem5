package practice;
import java.util.*;

public class ques2 {
    public static void swp(int m ,int n){
        m=m+n;
        n=m-n;
        m=m-n;
        System.out.println(m);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        swp(m,n);
        sc.close();

    }
}
