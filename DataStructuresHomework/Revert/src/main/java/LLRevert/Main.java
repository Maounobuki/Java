package LLRevert;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {
        LinkedNodes list = new LinkedNodes();
        System.out.println ();
        for (int i = 0; i < 10; i++) {
            int r = (int)(Math.random() * 100);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.tail = node;
        }

        // Траверс
        System.out.println(list.toString());

        // инвертированный
        System.out.println(list.reverse());

    }
}
