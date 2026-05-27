# Write your solution here
one = input("Please type in string 1: ")
two = input("Please type in string 2: ")
if len(one) > len (two):
    print(one + " is longer")
elif len(two) > len(one):
    print(two + " is longer")
else:
    print("The strings are equally long")