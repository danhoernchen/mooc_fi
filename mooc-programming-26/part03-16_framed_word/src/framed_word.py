# Write your solution here
line = "*" * 30
word = input("Word: ")
length = len(word)
wordline = "*" + (round(14-length/2))* " " + word
print(line)
print(wordline + (29 - len(wordline)) * " " + "*")
print(line)