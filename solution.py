Here is a Python console application that solves the problem:

```python
def is_valid_push_pop_sequence(pushed, popped):
    stack = []
    j = 0
    for x in pushed:
        stack.append(x)
        while stack and j < len(popped) and stack[-1] == popped[j]:
            stack.pop()
            j += 1
    return j == len(popped)

def main():
    pushed = list(map(int, input("Enter the pushed sequence: ").split()))
    popped = list(map(int, input("Enter the popped sequence: ").split()))
    if is_valid_push_pop_sequence(pushed, popped):
        print("The sequence is valid.")
    else:
        print("The sequence is not valid.")

if __name__ == "__main__":
    main()
```

This console application first asks the user to input the pushed sequence and the popped sequence. It then checks if the sequences are valid using the `is_valid_push_pop_sequence` function. If the sequences are valid, it prints "The sequence is valid." If not, it prints "The sequence is not valid."