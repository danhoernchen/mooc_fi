# Write your solution here
story = ""
previous = ""
while True:
    word = input("Please type in a word: ")
    if word == "end":
        break
    elif word == previous:
        break
    story += word + " "
    previous = word

print(story)
