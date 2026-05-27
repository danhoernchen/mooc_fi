# Write your solution here
def invert(dictionary:dict):
    initial = {}
    for key in dictionary:
        initial[key] = dictionary[key]
    dictionary.clear()
    for key in initial:
        dictionary[initial[key]] = key        

