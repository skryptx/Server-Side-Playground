""" This module contains implementation of hashmap aka dictionary in python"""
hashmap = {}  # initializations

hashmap["first_name"] = "sinni"
hashmap["first_name"] = "sinni"
print(hashmap)  # ans: {'first_name': 'sinni'}

print(hashmap.values())  # ans: ["sinni"] returns list of values
print(hashmap.keys())  # ans: ["first_name"]

hashmap1 = dict.fromkeys(["first_name", "last_name"], ["sinni", "singla"])
print(hashmap1)

for key, val in hashmap1.items():
    print(key, val)
