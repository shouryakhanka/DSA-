import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class InBuiltExamples {
public static void main(String args[]) {
    //    Stack<Integer> stack = new Stack<>();
    //    stack.push(45);
    //    stack.push(5);
    //    stack.push(7);
    //    stack.push(0);
    //    stack.push(-3);

    //         System.out.println(stack.pop());
    //         System.out.println(stack.pop());
    //         System.out.println(stack.pop());
    //         System.out.println(stack.pop());
    //         System.out.println(stack.pop());

    // Queue<Integer> queue = new LinkedList<>();

    // queue.add(3);
    // queue.add(5);
    // queue.add(1);
    // queue.add(0);
    // queue.add(-1);

    // System.out.println(queue.remove());
    // System.out.println(queue.remove());

    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(45);
    deque.addLast(34);
    deque.removeFirst();
    // etc etc

        }
    }

