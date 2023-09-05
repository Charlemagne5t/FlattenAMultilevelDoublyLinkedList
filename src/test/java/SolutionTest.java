import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void flattenTest() {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);

        head.next = node2;

        node2.next = node3;
        node2.prev = head;

        node3.next = node4;
        node3.prev = node2;
        node3.child = node7;

        node4.next = node5;
        node4.prev = node3;

        node5.next = node6;
        node5.prev = node4;

        node6.prev = node5;

        node7.next = node8;

        node8.next = node9;
        node8.prev = node7;
        node8.child = node11;

        node9.next = node10;
        node9.prev = node8;

        node10.prev = node9;

        node11.next  = node12;

        node12.prev = node11;

        printAllNodes(head);
        printAllNodes(node7);
        printAllNodes(node11);

        new Solution().flatten(head);

        System.out.println("_____________-------------------________________-----------------___________");
        printAllNodes(head);
        printAllNodes(node7);
        printAllNodes(node11);
    }
    public void printAllNodes(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println("Node Val: " + current.val);

            if (current.next != null) {
                System.out.println("Next Val: " + current.next.val);
            } else {
                System.out.println("Next Val: null");
            }

            if (current.prev != null) {
                System.out.println("Prev Val: " + current.prev.val);
            } else {
                System.out.println("Prev Val: null");
            }

            if (current.child != null) {
                System.out.println("Child Val: " + current.child.val);
            } else {
                System.out.println("Child Val: null");
            }

            System.out.println();
            current = current.next;
        }
    }

}