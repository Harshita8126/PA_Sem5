public class reverse_in_k {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node revk(Node head,int k){
            Node curr=head;
            Node prev=null;
            int count=0;
            while(curr!=null && count<k){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(curr!=null){
                head.next=revk(curr, k);
                //yha pe recursive call krdiya pehle har it ke liye revk(curr,k) calc hoga 
            }
            return prev;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head = revk(head, 2);

        print(head);
    }
}
