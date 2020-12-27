package DataStructures.LinkedList;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        super();
        this.head = null;
    }

    private Node createNode(int data) {
        return new Node(data);
    }

    private void addFirst(int data) {
        Node temp = createNode(data);
        temp.next = head;
        head = temp;
    }

    private void addLast(int data) {
        Node temp = createNode(data);
        if (head == null) {
            head = temp;
            return;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
    }

    private void addAnyPos(int data, int pos) {
        if (head == null || pos == 1) {
            addFirst(data);
            return;
        } else {
            Node temp = createNode(data);
            Node ptr = head;
            for (int i = 0; i < pos - 2; i++) {
                ptr = ptr.next;
                if (ptr == null) {
                    System.out.println("Invalid position");
                    return;
                }
            }
            if (ptr.next != null) {
                temp.next = ptr.next;
            }
            ptr.next = temp;
        }
    }

    private void deleteFirst() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        head = head.next;
    }

    private void deleteLast() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else {
            Node ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next = null;
        }
    }

    private void deleteAnyPos(int pos) {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        } else if (pos == 1) {
            deleteFirst();
        } else {
            Node ptr = head;
            for (int i = 0; i < pos - 2; i++) {
                ptr = ptr.next;
                if (ptr == null) {
                    System.out.println("Invalid position");
                    return;
                }
            }
            if (ptr.next == null)
                ptr = null;
            else
                ptr.next = ptr.next.next;
        }
    }

    private void reverse() {
        Node prevNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    private void display() {
        Node ptr = head;
        System.out.print("head->");
        while (ptr != null) {
            System.out.print(ptr.data + "->");
        }
        System.out.println("null");
    }

    private Node findMiddleNode() {
        if (head == null || head.next != null)
            return head;
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr.next != null && fastPtr != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }

    private Node nthNodeFromLast(int n) {
        if (head == null)
            return null;
        Node ptr = head;
        Node nth = head;
        for (int i = 0; i < n; i++) {
            ptr = ptr.next;
            if (ptr == null)
                return null;
        }
        while (ptr != null) {
            ptr = ptr.next;
            nth = nth.next;
        }
        return nth;
    }

    private boolean detectCycle() {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != slowPtr) {
            if (fastPtr.next == null || fastPtr == null)
                return false;
        }
        return true;
    }

    private void mergeTwoList(Node list1, Node list2) {
        
    }
}