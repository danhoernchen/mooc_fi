# Write your solution here
year = int(input("Year: "))
orig = year
while True:
    year = year + 1    
    if year % 400 == 0:
        break
    elif year % 4 == 0 and year % 100 != 0:
        break
print(f"The next leap year after {orig} is {year}")
