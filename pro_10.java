import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node current = head;
            Node previous = null;
            while (current != null && current.data != data) {
                previous = current;
                current = current.next;
            }
            if (current == null) {
                System.out.println("Element not found");
            } else {
                if (current == head) {
                    head = head.next;
                } else {
                    previous.next = current.next;
                }
            }
        }
    }
}

public class pro_10 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, data;

        do {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element for insertion: ");
                    data = scanner.nextInt();
                    list.add(data);
                    break;

                case 2:
                    System.out.print("Enter the element for deletion: ");
                    data = scanner.nextInt();
                    list.delete(data);
                    break;

                case 3:
                    System.out.print("List: ");
                    list.display();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
}