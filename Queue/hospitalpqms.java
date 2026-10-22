import java.util.PriorityQueue;

public class hospitalpqms {
    public static void main(String[] args) {
        PriorityQueue pq= new PriorityQueue<>();
        int[] arr= {1,2,3,1,3};
        for(int x:arr){
            pq.add(x);
        }
        System.out.println("Highest priority:"+pq.peek());
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }

    }
}
