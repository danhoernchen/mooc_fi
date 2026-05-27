# Write your solution here
print("Please type in integer numbers. Type in 0 to finish.")
count = 0
sum = 0
mean = 0
pos = 0
neg = 0
while True:
    num = int(input("Number: "))
    if num == 0:
        break
    sum += num
    count += 1
    if num > 0:
        pos += 1
    else:
        neg += 1
print(f"Numbers typed in {count}\nThe sum of the numbers is {sum}\nThe mean of the numbers is {sum/count}\nPositive numbers {pos}\nNegative numbers {neg}")
