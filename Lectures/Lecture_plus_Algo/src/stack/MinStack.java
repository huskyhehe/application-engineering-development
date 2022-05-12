package stack;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    Deque<Integer> helperStack;
    Deque<Integer> minStack;

    public MinStack() {
        helperStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.addFirst(Integer.MAX_VALUE);
    }
    // pushes the element val onto the stack.
    public void push(int val) {
        helperStack.addFirst(val);
        minStack.addFirst(Math.min(minStack.getFirst(), val));
    }

    // removes the element on the top of the stack.
    public void pop() {
        helperStack.removeFirst();
        minStack.removeFirst();
    }

    // gets the top element of the stack.
    public int top() {
        return helperStack.getFirst();
    }

    // retrieves the minimum element in the stack.
    public int getMin() {
        return minStack.getFirst();
    }
}
