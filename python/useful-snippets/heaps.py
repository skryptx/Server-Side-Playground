""" this module contains heaps basic operations"""

## By default heaps are minheap in python , i.e. min element at top
import heapq

min_heap = [[1, "eat"], [0, "code"]]
heapq.heapify(min_heap)

heapq.heappush(min_heap, [0, "act"])
print(min_heap)
print(heapq.heappop(min_heap))
print(heapq.heappop(min_heap))
print(heapq.heappop(min_heap))

## heap is always a list, it can be list of list or tuples and so on
## it compares first element , if they are same then goes to second element
## heap updates the data in place

## python does not have max heap but can be implemented the below way
## we can convert a heap to max heap by multiplying
## element by minus(-) before pushing it to heap
max_heap = []
heapq.heappush(max_heap, 19 * -1)
heapq.heappush(max_heap, 5 * -1)
heapq.heappush(max_heap, 9 * -1)
heapq.heappush(max_heap, 4 * -1)

print(heapq.heappop(max_heap) * -1)
print(heapq.heappop(max_heap) * -1)
print(heapq.heappop(max_heap) * -1)
print(heapq.heappop(max_heap) * -1)
