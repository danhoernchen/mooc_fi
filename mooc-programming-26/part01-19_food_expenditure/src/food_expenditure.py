# Write your solution here
times = int(input("How many times a week do you eat at the student cafeteria? "))
total = float(input("The price of a typical student lunch? "))*times
total += float(input("How much money do you spend on groceries in a week? "))
print(f"Average food expenditure:\nDaily: {total/7} euros\nWeekly: {total} euros")