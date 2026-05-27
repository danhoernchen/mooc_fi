# Write your solution here
text = input("Please type in a word: ")
char = input("Please type in a character: ")

while True:
    index = text.find(char)
    if (len(text) == 0) or (index == -1):
        break
    if (index + 3) <= len(text):
        print(text[index:index+3])
    text = text[index + 1:]