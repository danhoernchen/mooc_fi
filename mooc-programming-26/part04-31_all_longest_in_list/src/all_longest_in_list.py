# Write your solution here
def all_the_longest(lst):
    longest = 0
    final_lst= []
    for word in lst:
        if len(word) > longest:
            longest = len(word)
    for word in lst:
        if len(word) == longest:
            final_lst.append(word)
    return final_lst