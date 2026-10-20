import java.util.*;

public class PalindromeLinkedList {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {

        Stack<Character> stack = new Stack<>();

        Node current = head;

        // Step 1: Push all characters into the stack
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Step 2: Compare characters with popped elements
        current = head;

        while (current != null) {

            char ch = stack.pop();

            if (current.data != ch) {
                return false;
            }

            current = current.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Node head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('C');
        head.next.next.next = new Node('B');
        head.next.next.next.next = new Node('A');

        System.out.println(isPalindrome(head));
    }
}