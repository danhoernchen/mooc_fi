# Write your solution here
def most_common_character(strg):
    result = strg[0]
    for char in strg:
        amount = strg.count(char)
        if amount > strg.count(result):
            result = char
    return result