package abstract_data_types.queues;

import java.util.Iterator;
import java.util.LinkedList;

public class ChallengeStack {

    private LinkedList<Character> stack;

    public ChallengeStack() {
        this.stack = new LinkedList<>();
    }

    public void push(Character chr) {
        this.stack.push(chr);
    }

    public Character pop() {
        return this.stack.pop();
    }

    public Character peek() {
        return this.stack.peek();
    }

    public int getSize() {
        return this.stack.size();
    }

    public void printStack() {
        for (Character aStack : stack) {
            System.out.println(aStack);
        }
    }

    public Iterator<Character> iterateStack() {
        return stack.listIterator();
    }
}
