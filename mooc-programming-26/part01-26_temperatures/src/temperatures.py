# Write your solution here
temp = int(input('Please type in a temperature (F): '))
print(f"{temp} degrees Fahrenheit equals {(temp - 32)/1.8} degrees Celsius")
if (temp - 32)/1.8 < 0:
    print("Brr! It's cold in here!")