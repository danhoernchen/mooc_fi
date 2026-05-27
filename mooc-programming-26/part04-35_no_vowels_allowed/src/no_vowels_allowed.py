# Write your solution here
def no_vowels(strg):
    result = ""
    for char in strg:
        if char not in ["a","e","o","u","i"]:
            result += char
    return result