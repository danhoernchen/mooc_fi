# Write your solution here
def everything_reversed(lst):
    lst = reversed(lst)
    result = []
    for word in lst:
        result.append("".join(reversed(word)))
    return result