# Write your solution here
num_one = int(input("Please type in the first number: "))
num_two = int(input("Please type in another number: "))
if num_one == num_two:
    print("The numbers are equal!")
else:
    print(f"The greater number was: {num_one if num_one > num_two else num_two}")