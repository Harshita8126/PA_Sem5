public class nth_node {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node nth(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            //ye tbhi exceute hoga agar jo node di hai vo number of nodes se jyaada h 
            if(fast==null){
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(30);
    head.next.next.next=new Node(40);
    head.next.next.next.next=new Node(50);
    Node ans=nth(head, 3);
    System.out.println(ans.data);

    
}
}