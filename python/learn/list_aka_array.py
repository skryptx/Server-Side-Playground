""" This module shows operations involving arrays(called lists in python)"""

no_list = [1, 2, 3, 4]

print(no_list)

# list can be treated as stack by performing push(append) and pop
no_list.append(5)
print(no_list)
print(no_list.pop())

# But list has additional operations like insert
no_list.insert(0, 2)  # inserts 2 at index 0
print(no_list)

#######################
### MOST IMPORTANT ####
#######################
# Initialize an array of length n with certain value(0 or anything)

n = 5
arr = [1] * n
print(arr)  # ans: [1,1,1,1,1]

# Sublist or slicing array
arr = [1, 2, 3, 4, 5, 6]
print(arr[1:4])  # ans: [2,3,4]

# accessing negative index does not throw error in python
print(arr[-1])  # ans: 6 -> it gives last index of array


#######################
### MOST IMPORTANT ####
#######################
# Iterating the array

# Method 1: only have access to index
for i in range(len(arr)):
    print(arr[i])

# Method 2: only have access to value one by one
for val in arr:
    print(val)

# Method 3: have access to both index and value
for i, val in enumerate(arr):
    print(arr[i] == val)
