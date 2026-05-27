# Write your solution here
num = int(input("Please type in a number: "))
first = 1
while first <= num:
    second = 0
    while second < num:
        second += 1
        print(f"{first} x {second} = {first * second}")
    first += 1    
    

