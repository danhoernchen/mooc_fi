# Write your solution here
val = int(input("Value of gift: "))
result = ""
if val < 5000:
    result = "No tax!"
elif val >= 5000 and val < 25000:
    result = f"Amount of tax: {(val - 5000) * 0.08 + 100} euros"
elif val >= 25000 and val < 55000:
    result = f"Amount of tax: {(val - 25000) * 0.10 + 1700} euros"
elif val >= 55000 and val < 200000:
    result = f"Amount of tax: {(val - 55000) * 0.12 + 4700} euros"
elif val >= 200000 and val < 1000000:
    result = f"Amount of tax: {(val - 200000) * 0.15 + 22100} euros"
else:
    result = f"Amount of tax: {(val - 1000000) *0.17 + 142100} euros"

print(result)