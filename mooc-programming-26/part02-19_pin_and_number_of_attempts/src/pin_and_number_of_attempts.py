# Write your solution here
tries = 0
while True:
    tries += 1
    pin = input("PIN: ")
    if pin == "4321":
        break
    print("Wrong")
one = "Correct! It only took you one single attempt!"

print(one if tries == 1 else f"Correct! It took you {tries} attempts")

    