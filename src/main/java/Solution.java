import java.util.Stack;

public class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return null;
        }
        Node preHead = new Node();
        preHead.next = head;

        Stack<Node> stack = new Stack<>();
        while (head.next != null || head.child != null || !stack.isEmpty()){
            if(head.child != null){
                if(head.next != null) {
                    stack.add(head.next);
                }
                head.next = head.child;
                head.child.prev = head;
                head.child = null;
            }
            if(head.next == null && !stack.isEmpty()){
                head.next = stack.pop();
                head.next.prev = head;
            }
            head = head.next;
        }

        return preHead.next;
    }
}
