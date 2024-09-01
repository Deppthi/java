import java.util.Scanner;
public class node{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node head=null;
    Node tail=null;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        else{
            tail.next=newNode;
            tail=newNode;       
        }
        }
        public static void printLL(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        public static void main(String[]args){
            LinkedList ll=new LinkedList();
            Scanner sc=new Scanner(System.in);
            System.out.println("Output");
            while(true){
                int data=sc.nextInt();
                if(data<0){
                    break;

                }
                ll.insert(data);
            }
            System.out.println("Linked List");
            ll.printLL();
            sc.close();
        }
    }

}   