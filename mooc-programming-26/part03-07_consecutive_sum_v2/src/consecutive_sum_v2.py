# Write your solution here
result = "The consecutive sum: 1 + "
num = int(input("Limit: "))
current = 1
total = 1
while total < num:
    current = current + 1
    total += current
    if total < num:
        result = result + str(current) + " + "
    else:
        result = result +str(current)
print(result + " = " + str(total))