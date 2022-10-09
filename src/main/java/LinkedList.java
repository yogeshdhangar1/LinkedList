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
    public void insert(int data,int index){
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size){
            addLast(data);
        }
        Node temp = head;
                for(int i =0;i<index;i++){
                    temp = temp.ref;
                }
                Node newNode = new Node(data);
          temp.ref=newNode;
         size++;
    }
    public void deleteFirst() {
        head = head.ref;

    }

    int size() {
        int count = 0;

        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.ref;
        }
        return count;
    }
    public void deleteLast() {
        if (head == null)
            System.out.println("List is empty");
        else if (head.ref == null)
            head = null;
        else {
            Node temp = head;

            while (temp.ref.ref != null) {
                temp = temp.ref;
            }

            temp.ref = null;

        }
    }
    public Object search(int  input) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == input)
                return temp.data;

            temp = temp.ref;

        }
        return null;
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
       list.addLast(70);
       list.insert(30,1);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.addFirst(56);
        list.insert(30,1);
        list.addLast(70);
        list.display();
        list.search(30);
        list.display();
    }
}
