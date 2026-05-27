# Write your solution here
list = [1,2,3,4,5]
while True:
    idx = int(input("Index: "))
    if idx == -1:
        break
    val = int(input("New value: "))
    list[idx] = val
    print(list)