""" Tuples are with in parenthesis and they are immutable"""

tuple1 = tuple([1, 2, 3])

print(tuple1)

new_list = list(tuple1)
new_list.extend([5, 2, 6, 3])
tuple1 = tuple(new_list)

print(tuple1)


# Very useful feature of tuples is that they can be keys for hashMap(dictionary)
tuple_dict = {}
tuple_dict[(1, 2)] = "sinni"
tuple_dict[(1, 2)] = "sinni"
tuple_dict[(2, 3)] = "sinni"
print(tuple_dict)  # ans: {(1, 2): 'sinni', (2, 3): 'sinni'}

# Lists are not hashable
