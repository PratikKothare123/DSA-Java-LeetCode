
import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 1. Opening bracket encountered
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // 2. Closing bracket encountered
                if (s.isEmpty()) {
                    return false;
                }

                // Check for matching opening and closing pairs
                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '{' && ch == '}') ||
                    (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({[]})";  // true
        // String str = "({[))]})";  // false

        System.out.println(isValid(str)); // prints true
    }
}