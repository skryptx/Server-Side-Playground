""" This modules has the arithmetic operations on negative and positive 
numbers """
import math

positive_no = 10
negative_no = -10

""" MODULAR """
# positive numbers works normally
print(positive_no % 3)
# negative number does not work sometimes,so instead use fmod from math library:
# fmod returns float
print(int(math.fmod(negative_no, 3)))
