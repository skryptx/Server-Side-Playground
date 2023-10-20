""" This module shows the functionalities of the deque
which has capability of both stack and queue"""
from collections import deque

queue = deque()
print(list(queue))  # ans: []
# if you print deque directly without converting to list,
# then ans will be deque([])

# append and pop for stack
# append and popleft for queue

queue.append(1)
queue.append(2)
queue.append(3)
print(list(queue))  # ans: [1,2,3]

queue.pop()
print(list(queue))  # ans: [1,2]

queue.appendleft(4)
print(list(queue))  # ans: [4,1,2]

queue.popleft()
print(list(queue))  # ans: [1,2]
