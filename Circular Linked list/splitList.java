public class splitList {
      static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void spl(Node head){
        if(head==null||head.next==head){
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;

        }
        if(fast.next.next==head){
            fast=fast.next;
        }
        Node head2=slow.next;
        slow.next=head;
        fast.next=head2;

    }
    
}
