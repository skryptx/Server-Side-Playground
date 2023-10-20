""" This module has content about HashSet or normally know as Set in math """

number_set1 = set([1, 2, 3, 3, 4])
number_set2 = set([2, 4, 5, 6, 7])
print(number_set1, number_set2)
# number_set1 = {1,2,3,4}
# number_set2 = {2,4,5,6,7}

number_set1 = number_set1.union(number_set2)
print(number_set1, number_set2)
# number_set1 = {1,2,3,4,5,6,7}
# number_set2 = {2,4,5,6,7}

number_set1 = set([1, 2, 3, 3, 4])  # reset to prev value
print(number_set1.isdisjoint(number_set2))  # returns true if no common elements

# initializing set in dynamic way using comprehension
list1 = [3, 4, 5, 6, 7, 8, 9]
number_set3 = {val % 3 for val in list1}
print(number_set3)  # ans: {0,1,2}
