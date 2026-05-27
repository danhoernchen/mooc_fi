# Write your solution here
num = int(input("Please type in a number: "))
first = 1
while first <= num:
    if first + 1 <= num:
        print(first + 1)
    print(first)
    first += 2