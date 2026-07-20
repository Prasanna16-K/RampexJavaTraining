package DAY24.Classtask;


public class LinkedListImp {
    public static void main(String[] args) {
        Node n1 = new Node(4); // Created but unused node
        LinkedList li = new LinkedList();

        li.insertAtPos(0, 105);
        li.insertAtPos(1, 106);
        li.insertAtPos(2, 202);
        li.insertAtPos(3, 204);

        li.deleteAtPos(0);
        li.display();
    }
}

class Nodee {
    int val;
    Node next;

    Nodee(int value) {
        val = value;
    }
}

class Linked {
    Node head;
    int size;

    public void insertAtbeginning(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        if (head == null) {
            insertAtbeginning(val);
        } else {
            Node newnode = new Node(val);
            Node temp = head;
            while (temp.next != null) { // Safe dynamic last node locator
                temp = temp.next;
            }
            temp.next = newnode;
            size++;
        }
    }

    public void insertAtPos(int index, int value) {
        if (index == 0) {
            insertAtbeginning(value); // Increments size internally
        } else {
            Node newnode = new Node(value);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++; // Only increments for non-zero insertions
        }
    }

    public void deleteAtPos(int index) {
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) { // Dynamic loop hits every single element
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
