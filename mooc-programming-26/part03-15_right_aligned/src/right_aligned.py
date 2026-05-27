# Write your solution here
text = input("Please type in a string: ")
if len(text) < 20:
    add = "*" * (20 - len(text))
    text = add + text
print(text)