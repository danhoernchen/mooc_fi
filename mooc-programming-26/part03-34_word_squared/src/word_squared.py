# Write your solution here
def squared(text, amount):
    index = 0
    for i in range(amount):
        line = ""
        for j in range(amount):
            line += text[index%len(text)]
            index += 1
        print(line)

if __name__ == "__main__":
    squared("ab", 3)
    print()
    squared("aybabtu", 5)
