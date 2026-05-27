# Write your solution here
word_one = input("Please type in the 1st word: ")
word_two = input("Please type in the second word: ")
if word_one == word_two:
    print("You gave the same word twice.")
else:
    print(f"{word_one if word_one > word_two else word_two} comes alphabetically last.")