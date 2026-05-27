# Write your solution here
def shortest(lst):
    shortest = lst[0]
    for i in range(len(lst)):
        if len(lst[i]) < len(shortest):
            shortest = lst[i]
    return shortest