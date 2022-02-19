public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insertFront(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    void insertAfter(int pos, int data) {
        Node new_node = new Node(data);
        if (pos == 0) {
            new_node.next = head;
            head = new_node;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }

    void addEnd(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;

    }

    void deleteNode(int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addEnd(5);
        linkedList.addEnd(7);
        linkedList.insertFront(10);
        linkedList.insertAfter(1, 101);
        linkedList.deleteNode(2);
        linkedList.printData();
    }
}
