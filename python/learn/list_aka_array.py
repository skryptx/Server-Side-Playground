""" This module shows operations involving arrays(called lists in python)"""

no_list = [1, 2, 3, 4]

print(no_list)

# list1 can be treated as stack by performing push(append) and pop
no_list.append(5)
print(no_list)
print(no_list.pop())

# But list1 has additional operations like insert
no_list.insert(0, 2)  # inserts 2 at index 0
print(no_list)

#######################
### MOST IMPORTANT ####
#######################
# Initialize an array of length n with certain value(0 or anything)

n = 5
list_n_size_with_default_val = [1] * n
print(list_n_size_with_default_val)  # ans: [1,1,1,1,1],
# they all point to same object,
# in case of immutables it works but not for lists etc

# Sublist or slicing array
list1 = [1, 2, 3, 4, 5, 6]
print(list1[1:4])  # ans: [2,3,4]

# accessing negative index does not throw error in python
print(list1[-1])  # ans: 6 -> it gives last index of array


#######################
### MOST IMPORTANT ####
#######################
# Iterating the array

# Method 1: only have access to index
for i in range(len(list1)):
    print(list1[i])

# Method 2: only have access to value one by one
for val in list1:
    print(val)

# Method 3: have access to both index and value
for i, val in enumerate(list1):
    print(list1[i] == val)


# Use unpacking with multiple arrays,
#  used to combine 2 arrays, and values received are in pairs
#  one from each array
list1 = [1, 3, 5]
list2 = [2, 4, 6]
for val1, val2 in zip(list1, list2):
    print(val1, val2)


# Sort the array of numbers

list1 = [2, 6, 3, 1, 5, 9, 4]
list1.sort()  # => return nothing, it will sort in place
print(list1)
list1.sort(reverse=True)  # => reverses the list1
print(list1)

# Sort the array of strings

list1 = ["bob", "alice", "johnson"]
list1.sort()  # => will sort the list1 by names lexicographical order
print(list1)


# we can also write custom function to sort the strings by another method
# lets say we want to order the name by no. of o's
def sort_by_count_o_character(x):
    return x.count("o")


list1.sort(
    key=sort_by_count_o_character, reverse=True
)  # => ans: ['johnson', 'bob', 'alice']
print(list1)


# Comprehensions
list1 = ["bob", "alice", "johnson"]
print(
    [(list1[i], len(list1[i])) for i in range(len(list1))]
)  # (list1[i], len(list1[i])) => tuple
