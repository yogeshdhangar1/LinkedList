import javax.xml.soap.Node;
import java.util.*;
public class LinkedList {
    Node head;
    int size;

    class Node {
        int data;
        Node ref;

        public Node(int data) {
            this.data = data;

        }
    }

        public void addValue(int data) {
            Node newNode = new Node(data);
            newNode.ref = head;
            head = newNode;
            Node temp = head;
            if (temp == head) {
                head = temp;
            }
            size+=1;
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
       list.addValue(70);
       list.addValue(30);
       list.addValue(56);
        list.display();
    }
}
