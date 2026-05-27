# Write your solution here
num_one = int(input('Number 1: '))
num_two = int(input('Number 2: '))
operation = input('Operation: ')
if operation == 'subtract':
    print(f"{num_one} - {num_two} = {num_one - num_two}")
if operation == 'add':
    print(f"{num_one} + {num_two} = {num_one + num_two}")
if operation == 'multiply':
    print(f"{num_one} * {num_two} = {num_one * num_two}")