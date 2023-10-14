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
list = [1] * n
print(list)  # ans: [1,1,1,1,1]

# Sublist or slicing array
list = [1, 2, 3, 4, 5, 6]
print(list[1:4])  # ans: [2,3,4]

# accessing negative index does not throw error in python
print(list[-1])  # ans: 6 -> it gives last index of array


#######################
### MOST IMPORTANT ####
#######################
# Iterating the array

# Method 1: only have access to index
for i in range(len(list)):
    print(list[i])

# Method 2: only have access to value one by one
for val in list:
    print(val)

# Method 3: have access to both index and value
for i, val in enumerate(list):
    print(list[i] == val)


# Use unpacking with multiple arrays,
#  used to combine 2 arrays, and values received are in pairs
#  one from each array
list1 = [1, 3, 5]
list2 = [2, 4, 6]
for val1, val2 in zip(list1, list2):
    print(val1, val2)


# Sort the array

list = [2, 6, 3, 1, 5, 9, 4]
list.sort()  # => return nothing, it will sort in place
print(list)
list.sort(reverse=True)  # => reverses the list
print(list)
