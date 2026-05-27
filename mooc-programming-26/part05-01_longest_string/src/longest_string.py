# Write your solution here
def longest(strings: list):
    longest = strings[0]
    for current in strings:
        if len(current) > len(longest):
            longest = current
    return longest