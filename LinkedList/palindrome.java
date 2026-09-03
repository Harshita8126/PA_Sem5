public class palindrome {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public static Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node rev(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static boolean pal(Node head){
        Node mid=findmid(head);
        Node first=head;
        Node second=rev(mid);
        while(second!=null){
        if(first.data!=second.data){
            return false;

        }
        first=first.next;
        second=second.next;
    }
        return true;
    }
   
   
    public static void main(String[] args) {
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(30);
    head.next.next.next=new Node(20);
    head.next.next.next.next=new Node(10);
    
        System.out.println(pal(head));
    }
}

// 10 20 30 20 10 
//middle node ke liye pehle slow fast pointer use kiya --30 mila ab reverse me middle node se aage vala reverse krdiya
// 10 20 30 10 20  
// fir if se compare kiya ki agar brabr nhi hai to tbhi false vrna next next aur end me true rreturn krdiya .


