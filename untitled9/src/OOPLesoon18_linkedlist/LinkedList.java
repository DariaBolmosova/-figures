package OOPLesoon18_linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;


    public void insertAfter(String stringData) {       //вставка в конец
        Node createNode = new Node(stringData);
        if (head == null) {
            head = createNode;
            tail = head;
        } else {
            createNode.setPrev(tail);
            tail.setNext(createNode);
            tail = createNode;
        }
    }

    public void insertBefore(String stringData) {    //вставка в начало з
        Node createNode = new Node(stringData);
        if (head == null) {
            head = createNode;
            tail = head;
        } else {
            createNode.setNext(head);
            head.setPrev(createNode);
            head = createNode;
        }
    }

    public void showAll() {
        Node currentHead = head;   //title
        System.out.println("[");
        do {
            System.out.println(currentHead.getData() + " ");
            currentHead = currentHead.getNext();     //getPrev
        }
        while (currentHead != null);
        System.out.println("]");
    }

    public Node find(String stringData) {
        Node currentNode = head;
        do {
            if (currentNode.getData().equals(stringData)) {
                return currentNode;
            }
             currentNode=currentNode.getNext();
        } while (currentNode != null);
        return null;
    }
}
