# Write your solution here
list = []
idx = 0
length = int(input("How many items: "))
for i in range(length):
    list.append(int(input(f"Item {i+1}: ")))
print(list)