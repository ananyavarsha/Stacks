import java.util.EmptyStackException;

public class Stack {

    private ListNode top;
    private int length;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Stack() {
        length = 0;
        top = null;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display() {
        ListNode current = top;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public void push(int value) {
        ListNode temp = new ListNode(value);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int data = top.data;
        top = top.next;
        length--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(6);
        s.display();
        System.out.println();
        System.out.println("popped item is " + s.pop());
        s.display();
    }
}
