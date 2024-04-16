def is_valid_push_pop_sequence(pushed, popped):
    stack = []
    j = 0
    for x in pushed:
        stack.append(x)
        while stack and j < len(popped) and stack[-1] == popped[j]:
            stack.pop()
            j += 1
    return j == len(popped)