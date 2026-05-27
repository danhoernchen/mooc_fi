# Write your solution here
one = input("1st letter: ")
two = input("2nd letter: ")
three = input("3rd letter: ")
if (two > one and two < three) or (two < one and two > three):
    mid = two
elif (one < two and one > three) or (one > two and one < three):
    mid = one
else:
    mid = three
print(f"The letter in the middle is {mid}")