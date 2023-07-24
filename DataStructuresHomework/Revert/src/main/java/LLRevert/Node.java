package LLRevert;

public class Node {
    private Node previous;

    private Node next;

    private int node;

    public Node(int data) {
        this.node = data;
    }

    public void append(Node node) {
        if (this.next == null) {
            this.next = node;
            node.previous = this;
        } else {
            this.next.append(node);
        }

    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node pre) {
        this.previous = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setNode(int data) {
        this.node = data;
    }

    public boolean hasPrevious() {
        return this.previous != null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public int getNode() {
        return node;
    }
}
