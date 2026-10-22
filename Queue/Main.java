class implusingArray{
    int[] arr;
    int front;
    int rear;
    int size;
    implusingArray(int size){
        this.size=size;
        arr= new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int value){
        if(rear==size-1){
            System.out.println("Queue overflow");
            return ;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        arr[rear]=value;
        System.out.println(value+" Inserted");
    }
    void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[front]+" removed ");;
        front++;

    }
    void peek(){
        if(front==-1|| front>rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("front el is "+ arr[front]);


    }

    void display(){
         if(front==-1|| front>rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }


}
class Main{
    public static void main(String[] args) {
        implusingArray q= new implusingArray(5);
        // q.enqueue(10);
        // q.enqueue(20);
        // q.enqueue(30);
        // q.enqueue(40);
        // q.enqueue(50);
        q.display();
        q.dequeue();
    }
}