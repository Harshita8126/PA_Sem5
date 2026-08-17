public class reverse {
    static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node rev(Node head){
    Node prev=null;
    Node curr=head;
    while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}
public static void print(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}


public static void main(String[] args) {
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(30);
    head.next.next.next=new Node(40);
    System.out.println("org");
    print(head);
    head=rev(head);
    System.out.println("reversed");
    print(head);

    
}
}
