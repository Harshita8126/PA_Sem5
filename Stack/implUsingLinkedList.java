public class implUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            
        }
    }
    static class Stack{
        Node top;
        void push(int  value){
            Node newNode= new Node(value);
            newNode.next=top;
            top=newNode;
        }
        int pop(){
            if(top==null){
                System.out.println("Stack underflow");
                return -1;
            }
            int val=top.data;
            top=top.next;
            return val;
        }
        int peek(){
            if(top==null){
                return -1;
            }
            return top.data;
        }
        void display(){
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Stack st= new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println("popped "+st.pop());
        System.out.println("peek "+st.peek());
        st.display();
        
    }

}

