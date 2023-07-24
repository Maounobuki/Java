package LLRevert;

public class LinkedNodes {
    Node head;
    Node tail;


    public void append(Node node) {
        if (head.getNext() == null) {
            head.setNext(node);
            node.setPrevious(head);
        } else {
            head.getNext().append(node);
        }
    }


    public String toString() {
        Node curr = head;
        StringBuilder sBuilder = new StringBuilder();
        while (curr != null) {
            sBuilder.append(curr.getNode()).append(curr.hasNext() ? "->" : "");
            curr = curr.getNext();
        }
        return sBuilder.toString();
    }

    public String reverse() {
        Node current = head;
        Node newHead = null;
        Node newTail = null;
        while (current != null) {
            Node pre = current.getPrevious();
            Node next = current.getNext();
            if (pre == null) newTail = current;
            if (next == null) newHead = current;
            current.setNext (pre);
            current.setPrevious (next);
            current = current.getPrevious();
        }
        head = newHead;
        tail = newTail;
        return this.toString();
    }
}
