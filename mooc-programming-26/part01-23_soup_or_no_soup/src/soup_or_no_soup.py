# Write your solution here
name = input('Please tell me your name: ')
if name == 'Jerry':
    print('Next please!')
else:
    amount = int(input('How many portions of soup? '))
    print(f"The total cost is {round(amount*5.90,2)}\nNext please!")
