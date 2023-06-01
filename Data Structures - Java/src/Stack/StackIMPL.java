package Stack;

import java.util.Scanner;

public class StackIMPL {
    private int arr[];
    private int top;
    private int capacity;

    StackIMPL(int capacity){
        arr = new int[capacity];
        this.capacity=capacity;
        top=-1;
    }
    public void push(int item){
        if (isFull()) {
            System.out.println("Stack Full");
        }else if (isEmpty()){
            top=0;
            arr[top]=item;
        }else {
            top++;
            arr[top]=item;
        }

    }
    public boolean isFull(){
        if (top>=capacity-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }
        return false;
    }
    public void pop(){
        if (isEmpty()){
            System.out.println("The Stack is empty");
        }
        else {
            System.out.println("The top most element is"+arr[top]);
            top--;
        }
    }
    public void traverse(){
        for (int i=0; i<=top; i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=s.nextInt();

        StackIMPL si = new StackIMPL(size);

        si.push(4);
        si.push(5);
        si.push(6);
        si.push(7);

        si.traverse();

        si.pop();
        si.traverse();
    }
}
