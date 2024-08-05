package dsa;

public class LL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class to manage the list operations
    static class LinkedList {
        private Node head;

        // Constructor to initialize an empty list
        public LinkedList() {
            this.head = null;
        }

        // Method to add a new node to the end of the list
        public void append(int data) {
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

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Method to delete a node by value
        public void delete(int value) {
            if (head == null) return;

            if (head.data == value) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != value) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    // Main method to test the LinkedList
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add nodes to the list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        // Print the list
        System.out.println("Linked List:");
        list.printList();

        // Delete a node
        list.delete(3);
        System.out.println("Linked List after deleting 3:");
        list.printList();
    }
}
