# Write your solution here
lst = []
item = 1
while True:
    print("The list is now", lst)
    command = input("a(d)d, (r)emove or e(x)it: ")
    if command == "x":
        break
    elif command == "d":
        lst.append(item)
        item += 1
    elif command == "r":
        item = lst.pop()
print("Bye!")