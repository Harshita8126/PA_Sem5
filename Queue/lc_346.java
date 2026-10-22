// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class lc_346 {
    public static void main(String[] args) {
        MovingAverage obj= new MovingAverage(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
        // System.out.println("Try clicking the Run button.");
    }
}
class MovingAverage{
    Queue<Integer> q;
    int size;
    MovingAverage(int size){
        this.size=size;
        q= new LinkedList<>();
    }

    double next(int value){
        q.add(value);
        if(q.size()>size){
            q.poll();
        }
        int sum =0;
        for(int num:q){
            sum+=num;
        }
        return (double) sum/q.size();
        
    }
}