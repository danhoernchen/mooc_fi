# Write your solution here
num = int(input("Number: "))
text = ""
if num%3 == 0:
    text += "Fizz"
if num%5 == 0:
    text += "Buzz"
print(text)