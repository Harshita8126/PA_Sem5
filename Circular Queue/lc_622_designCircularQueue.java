public class lc_622_designCircularQueue {
   
    private int[] arr;
    private int front;
    private int rear;
    private int  capacity;
    private int  count;

    public lc_622_designCircularQueue(int k) {
        capacity=k;
        arr= new int[k];
        front=0;
        rear=-1;
        count=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%capacity;
        count--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return count==0;
    }
    
    public boolean isFull() {
        return count==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

