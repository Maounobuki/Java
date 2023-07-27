package RedBlackTree;

public class Main {
    public static void main(String[] args) {

        RedBlackTree<Integer> tree = new RedBlackTree();
        tree.add(8);
        tree.add(6);
        tree.add(12);
        tree.add(1);
        tree.add(5);
        tree.remove(5);
        tree.print();
    }
}
