public class ReverseLinkedList {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node head) {

        Node curr, prev;
        prev = null;
        curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    Node middle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    boolean isPalindrome(Node head) {
        Node middle = middle(head);
        Node last = reverse(middle);
        while (last != null) {
            if (last != head)
                return false;
            head = head.next;
            last = last.next;
        }
        return true;
    }

    void addEnd(int data) {
        ReverseLinkedList.Node new_node = new ReverseLinkedList.Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        ReverseLinkedList.Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;

    }

    void printData(Node head) {
        ReverseLinkedList.Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.addEnd(4);
        reverseLinkedList.addEnd(5);
        reverseLinkedList.addEnd(6);
        reverseLinkedList.addEnd(7);
        reverseLinkedList.printData(head);
        System.out.println(reverseLinkedList.isPalindrome(head));
        Node reversed = reverseLinkedList.reverse(head);
        System.out.println("Reversed Linked list");
        reverseLinkedList.printData(reversed);
    }
}
