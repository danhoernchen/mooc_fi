# Write your solution here
def phonebook():
    phonebook = {}
    while True:
        command = int(input("command (1 search, 2 add, 3 quit): "))
        if command == 1:
            name = input("name: ")
            if name in phonebook:
                for num in phonebook[name]:
                    print(num)
            else:
                print("no number")
        elif command == 2:
            name = input("name: ")
            number = input("number: ")
            if name not in phonebook:
                phonebook[name] = []
            phonebook[name].append(number)
            print("ok!")
        else:
            print("quitting...")
            break

phonebook()