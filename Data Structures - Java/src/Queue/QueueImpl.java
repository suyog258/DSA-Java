package Queue;

import java.security.PublicKey;
import java.util.Queue;
import java.util.Scanner;

public class QueueImpl {

    private int arr[];
    private int front;
    private int rear;
    private int capacity;

    QueueImpl(int capacity){
        arr = new int[capacity];
        this.capacity=capacity;
        front=-1;
        rear=-1;
    }
    public void enqueue(int item){
        if (isFull()){
            System.out.println("Queue Full");
        } else if (isEmpty()) {
            front=0;
            rear=0;
            arr[rear]=item;
        }else {
            rear++;
            arr[rear]=item;
        }
    }
    public boolean isFull(){
        if (rear>=capacity-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (front==-1 && rear==-1){
            return true;
        }
        return false;
    }
    public void dequeue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
        }else {
            System.out.println("\nThe element deleted is "+arr[front]);
        }
    }
    public void traverse(){
        for (int i = front; i <= rear;i++){
            System.out.println(arr[i]+",");
        }
    }
    public static void main(String[] args){
        int choice;
        int item;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=s.nextInt();
        QueueImpl q= new QueueImpl(size);

        while (true){
            System.out.println("\nEnter 1.Enqueue \t2.Dequeue \t3.Traversal \t4.Exit");
            choice=s.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Item to insert");
                    item=s.nextInt();
                    q.enqueue(item);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.traverse();
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
