# Write your solution here
lst = []
while True:
    word = input("Word: ")
    if word in lst:
        print(f"You typed in {len(lst)} different words")
        break
    lst.append(word)
    