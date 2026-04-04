package com.collections;
import java.util.*;

public class StackDeepDive {

    public static void main(String[] args) {

        // ===============================
        // 1. Constructor
        // ===============================
        Stack<Integer> stack = new Stack<>();

        // ===============================
        // 2. Push (Add elements)
        // ===============================
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // ===============================
        // 3. Peek (Top element)
        // ===============================
        System.out.println("Peek: " + stack.peek());

        // ===============================
        // 4. Pop (Remove top)
        // ===============================
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);

        // ===============================
        // 5. Search (Tricky)
        // ===============================
        stack.push(40);
        stack.push(50);

        System.out.println("Search 20: " + stack.search(20)); // position from top
        System.out.println("Search 100: " + stack.search(100)); // -1

        // ===============================
        // 6. Empty Check
        // ===============================
        System.out.println("Is Empty? " + stack.empty());

        // ===============================
        // 7. Iteration (Tricky Order)
        // ===============================
        System.out.println("Iteration:");
        for (Integer i : stack) {
            System.out.print(i + " "); // bottom → top
        }

        // ===============================
        // 8. LIFO Behavior
        // ===============================
        System.out.println("\nLIFO Demo:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        // ===============================
        // 9. Null Handling
        // ===============================
        stack.push(null);
        stack.push(100);
        System.out.println("\nWith null: " + stack);

        // ===============================
        // 10. Inherited Methods (Vector)
        // ===============================
        stack.add(200); // allowed (not pure stack behavior)
        System.out.println("Using add(): " + stack);

        stack.remove(0); // remove by index
        System.out.println("After remove index: " + stack);

        // ===============================
        // 11. Fail-Fast Iterator
        // ===============================
        try {
            Iterator<Integer> it = stack.iterator();
            while (it.hasNext()) {
                stack.push(999); // modification
                it.next();
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Fail-Fast triggered!");
        }

        // ===============================
        // 12. Thread Safety
        // ===============================
        // Stack is synchronized (thread-safe)
        stack.push(1);

        // ===============================
        // 13. Recommended Alternative
        // ===============================
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(10);
        deque.push(20);
        System.out.println("Deque as Stack: " + deque);

        System.out.println("Done");
    }
}