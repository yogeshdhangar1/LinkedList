import javax.xml.soap.Node;
import java.util.*;
public class LinkedList {
    Node head;
    int size;
    class Node {
        int data;
        Node ref;
        int size;

        public Node(int data) {
            this.data = data;

        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }else if(head.ref == null){
            head.ref = newNode;
        }else{
            Node temp = head;
            while(temp.ref!=null){
                temp = temp.ref;
            }
            temp.ref = newNode;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode .ref = head;
        head = newNode;
    }
    public void insertAfter(int data){
        Node newNode = new Node(data);
        if(head.ref.ref!=null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.ref.ref!=null){
                temp = temp.ref.ref;
            }
            temp = newNode;
        }

    }
        public void display() {
            if (head == null) {
                System.out.println("List Is Empty");
            } else {
                Node temp = head;
                while (temp != null) {
                    if (temp.ref != null) {
                        System.out.println(temp.data + "=>");
                    } else {
                        System.out.println(temp.data);
                    }
                    temp = temp.ref;
                }
            }
        }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ///AddLast
       list.addFirst(56);
       list.addLast(30);
      list.addLast(70);
      list.display();
      list.insertAfter(90);
      list.display();
    }
}
