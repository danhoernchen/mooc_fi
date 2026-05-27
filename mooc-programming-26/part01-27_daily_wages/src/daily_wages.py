# Write your solution here
hourly = float(input('Hourly wage: '))
hours = float(input('Hours worked: '))
day = input('Day of the week: ')
if day == 'Sunday':
    hourly = hourly * 2
print(f"Daily wages: {round(hours*hourly,2)} euros")