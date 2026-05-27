# Write your solution here
lst = []
while True:
    new = int(input("New item: "))
    if(new == 0):
        print("Bye!")
        break
    lst.append(new)
    print("The list now:", lst)
    print("The list in order:", sorted(lst))