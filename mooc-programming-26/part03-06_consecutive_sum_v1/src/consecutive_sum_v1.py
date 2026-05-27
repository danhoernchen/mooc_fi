# Write your solution here
num = int(input("Limit: "))
current = 1
total = 1
while total < num:
    current = current + 1
    total += current
print(total)