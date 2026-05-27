# Write your solution here
num = int(input("Please type in a positive integer: "))
start = num * -1
while start <= num:
    if start == 0:
        start += 1
        continue
    print(start)
    start += 1