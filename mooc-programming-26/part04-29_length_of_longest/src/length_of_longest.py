# Write your solution here
def length_of_longest(lst):
    longest = 0
    for word in lst:
        if len(word)>longest:
            longest = len(word)
    return longest
