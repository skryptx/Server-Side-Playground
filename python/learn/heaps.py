""" this module contains heaps basic operations"""
import heapq

heap = [[1, "eat"], [0, "code"]]
heapq.heapify(heap)

heapq.heappush(heap, [0, "act"])
print(heap)
print(heapq.heappop(heap))
print(heapq.heappop(heap))
print(heapq.heappop(heap))

## heap is always a list, it can be list of list or tuples and so on
## it compares first element , if they are same then goes to second element
## heap updates the data in place
