# Write your solution here
text = input("Please type in a string: ")
i = len(text) - 1
while i >= 0:
    print(text[i:])
    i -= 1