import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position < 1) {
            System.out.println("Invalid position.");
        } else if (position == 1) {
            insertAtBeginning(data);
        } else {
            Node current = head;
            int count = 1;
            while (count < position - 1 && current.next != head) {
                current = current.next;
                count++;
            }
            if (count == position - 1) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Invalid position.");
            }
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head, prev = null;
        while (current.data != data) {
            if (current.next == head) {
                System.out.println("Element not found.");
                return;
            }
            prev = current;
            current = current.next;
        }
        if (current.next == head && prev == null) {
            head = null;
            return;
        }
        if (current == head) {
            prev = head;
            while (prev.next != head)
                prev = prev.next;
            head = current.next;
            prev.next = head;
        } else if (current.next == head) {
            prev.next = head;
        } else {
            prev.next = current.next;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("List:  ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class pro_9 {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, value, position;

        do {
            System.out.println("1. Insert at the beginning of the list");
            System.out.println("2. Insert at the end of the list");
            System.out.println("3. Insert at a given position");
            System.out.println("4. Delete a node from the list");
            System.out.println("5. Traverse the list");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to be inserted: ");
                    value = sc.nextInt();
                    list.insertAtBeginning(value);
                    break;
                case 2:
                    System.out.print("Enter the value to be inserted: ");
                    value = sc.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 3:
                    System.out.print("Enter the value to be inserted: ");
                    value = sc.nextInt();
                    System.out.print("Enter the position: ");
                    position = sc.nextInt();
                    list.insertAtPosition(value, position);
                    break;
                case 4:
                    System.out.print("Enter the value to be deleted: ");
                    value = sc.nextInt();
                    list.delete(value);
                    break;
                case 5:
                    list.printList();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 6);
    }
}


