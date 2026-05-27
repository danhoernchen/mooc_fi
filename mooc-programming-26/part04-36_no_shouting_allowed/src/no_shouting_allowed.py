# Write your solution here!
def no_shouting(lst):
    result = []
    for word in lst:
        if not word.isupper():
            result.append(word)
    return result