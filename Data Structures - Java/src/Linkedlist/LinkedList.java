package Linkedlist;

import java.util.Scanner;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAfter(int nodeVal, int data) {
        Node ptr=head;
        Node newNode = new Node(data);
        while (ptr.data!=nodeVal){
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
    }



    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int element;
        LinkedList linkedList = new LinkedList();

        while (true) {
            System.out.println("Enter your choice \n1.At First \t2.At Last \t3.After Node \t4.Display \t5.Exit");
            int choice=s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert");
                    element = s.nextInt();
                    linkedList.insertFirst(element);
                    break;
                case 2:
                    System.out.println("Enter the element to insert");
                    element = s.nextInt();
                    linkedList.insertLast(element);
                    break;

                case 3:
                    System.out.println("Enter the node value");
                    int val=s.nextInt();
                    System.out.println("Enter the element to insert");
                    element = s.nextInt();
                    linkedList.insertAfter(val,element);
                    break;

                case 4:
                    linkedList.displayList();
                    break;
                case 5:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }


    }
}


