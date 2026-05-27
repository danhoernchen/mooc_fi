# Write your solution here
year = int(input("Please type in a year: "))
isLeap = False
if year%100 == 0 and year%400 == 0:
    isLeap = True
elif year%4 == 0 and year%100 != 0:
    isLeap = True
if isLeap:
    print("That year is a leap year.")
else:
    print("That year is not a leap year.")