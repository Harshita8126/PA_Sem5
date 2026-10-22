// package Circular Queue;
import java.util.*;
public class circularq {
    int[] arr;
    int front,rear,size,capacity;
    circularq(int capacity){
        this.capacity=capacity;
        arr= new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    void enqueue(int value){
        if(size==capacity){
            System.out.print("Queue is full");
            return ;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
        System.out.println("Element inserted " +value);
    }

    void dequeue(){
        if(size==0){
            System.out.print("Queue is empty ");
            return ;
        }
        System.out.println("removed "+arr[front]);
        front=(front+1)%capacity;
        size--;
        
    }
    void display(){
         if(size==0){
            System.out.print("Queue is empty ");
            return ;
        }
        System.out.println("Queue");
        for(int i=0;i<size;i++){
            int index=(front+i)%capacity;
            System.out.print(arr[index]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        circularq q= new circularq(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(50);
        // q.dequeue();
        q.display();
        q.display();

    }
    
}
