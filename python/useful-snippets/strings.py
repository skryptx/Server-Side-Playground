""" This module describes how strings work in python """

message = "Hello World's"

print(len(message))

print(message.find("o", 6))

## strings are immutable
# everytime a change is made to string, a new string is created
# so string operations are O(n) time

message[0] = "W"  # ===>>> Not Allowed

print(message)
