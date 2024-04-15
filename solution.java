Here is a Java console application that solves the problem:

```java
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of operations:");
        int n = scanner.nextInt();
        int[] pushed = new int[n];
        int[] popped = new int[n];
        System.out.println("Enter the pushed sequence:");
        for (int i = 0; i < n; i++) {
            pushed[i] = scanner.nextInt();
        }
        System.out.println("Enter the popped sequence:");
        for (int i = 0; i < n; i++) {
            popped[i] = scanner.nextInt();
        }
        System.out.println("Is the sequence valid? " + validateStackSequences(pushed, popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int x : pushed) {
            stack.push(x);
            while (!stack.empty() && i < popped.length && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return i == popped.length;
    }
}
```

This console application first asks the user to input the number of operations, then the sequences of pushed and popped operations. It then checks if the sequence is valid by simulating the stack operations and comparing the popped elements with the given popped sequence. If all elements in the popped sequence are popped from the stack in the correct order, the sequence is valid.