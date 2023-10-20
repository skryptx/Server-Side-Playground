""" This modules has the arithmetic operations on negative and positive 
numbers """
import math

positive_no = 10
negative_no = -10

""" MODULAR """

# positive numbers works normally
print(positive_no % 3)  # ans: 1

# negative number does not work sometimes,so instead use fmod from math library:
# fmod returns float
print(int(math.fmod(negative_no, 3)))  # ans: -1

""" DIVISION """

# Division(/) return float by default so need to use // instead
print(positive_no / 3)  # ans: 3.3333333
print(positive_no // 3)  # ans: 3

# Division return float by default do not use // in case of negative
print(negative_no // 3)  # ans: -4 -> abnormal result

# best method
print(int(negative_no / 3))  # ans: -3 -> use in case you need integer value

"""
Other python math operations
"""

print(math.pow(3, 2))  # returns float
print(math.sqrt(10))
print(math.ceil(-3.1))  # ans = -3
print(math.floor(-3.1))  # ans = -4

# Max / Min Int

print(float("inf"))
print(float("-inf"))
