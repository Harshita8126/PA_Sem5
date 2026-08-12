package practice;
import java.util.*;

public class ques1 {
    public static int sum(int a ,int b){
        return a+b;
    }
    public static int diff(int a ,int b){
        return a-b;
    }
    public static int prod(int a ,int b){
        return a*b;
    }
    public static int qt(int a ,int b){
        return a/b;
    }
    public static int rem(int a ,int b){
        return a%b;
    }
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     int a= sc.nextInt();
     int b=sc.nextInt();
     System.out.println(sum(a, b));
     System.out.println(diff(a, b));
     System.out.println(prod(a, b));
     System.out.println(qt(a, b));
     System.out.println(rem(a, b));
     sc.close();
    }
}