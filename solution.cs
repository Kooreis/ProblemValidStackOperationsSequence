Here is a C# console application that solves the problem:

```CSharp
using System;
using System.Collections.Generic;

class Program
{
    static void Main(string[] args)
    {
        int[] pushed = { 1, 2, 3, 4, 5 };
        int[] popped = { 4, 5, 3, 2, 1 };
        Console.WriteLine(ValidateStackSequences(pushed, popped));
    }

    public static bool ValidateStackSequences(int[] pushed, int[] popped)
    {
        int i = 0;
        Stack<int> stack = new Stack<int>();
        foreach (int x in pushed)
        {
            stack.Push(x);
            while (stack.Count > 0 && i < popped.Length && stack.Peek() == popped[i])
            {
                stack.Pop();
                i++;
            }
        }
        return i == popped.Length;
    }
}
```

This program checks if a sequence of pushed and popped stack operations is valid. It uses a stack to simulate the push and pop operations. It pushes the elements from the pushed array into the stack and checks if the top of the stack is equal to the current element in the popped array. If it is, it pops the element from the stack and moves to the next element in the popped array. If all elements in the popped array are successfully popped from the stack, it returns true, otherwise it returns false.