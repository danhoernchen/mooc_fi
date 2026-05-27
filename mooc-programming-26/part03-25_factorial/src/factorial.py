# Write your solution here
while True:
    num = int(input("Please type in a number: "))
    if num <= 0:
        break
    total = 1
    current = 1
    while current < num:
        total += total * current
        current += 1
    print(f"The factorial of the number {num} is {total}")
print("Thanks and bye!")