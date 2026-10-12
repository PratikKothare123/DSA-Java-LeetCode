package Stack;

import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottomOfStack(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottomOfStack(s,data);
        s.push(top);
    }

    public static void reverSeStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverSeStack(s);
        pushAtBottomOfStack(s, top);

    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            int top = s.pop();
            System.out.println(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverSeStack(s);
        printStack(s);

    }
}
