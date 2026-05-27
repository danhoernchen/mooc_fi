# Write your solution here
text = input("Please type in a word: ")
char = input("Please type in a character: ")
index = text.find(char)
if (index + 3) < len(text):
    print(text[index:index+3])