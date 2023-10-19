""" Tuples are with in parenthesis and they are immutable"""

tuple1 = tuple([1, 2, 3])

print(tuple1)

new_list = list(tuple1)
new_list.extend([5, 2, 6, 3])
tuple1 = tuple(new_list)

print(tuple1)
