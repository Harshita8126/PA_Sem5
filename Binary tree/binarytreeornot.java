
public class binarytreeornot {
    static boolean isbinary(Node root){
        if(count(root)==0||count(root)==2) return true;
        return false;
    }
    static int count(Node root){
        if(root==null){
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }
     public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}