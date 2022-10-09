import javax.xml.soap.Node;
import java.util.*;
public class LinkedList {
    Node head;
    class Node {
        int data;
        Node ref;
        int size;

        public Node(int data) {
            this.data = data;

        }
    }

    public void addFirst(int  data) {
        Node newNode = new Node(data); // newNode=>[5|null]
        newNode.ref = head;
        head = newNode;
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
       list.addFirst(70);
       list.addFirst(30);
       list.addFirst(56);
        list.display();
    }
}
