# Write your solution here
def phonebook():
    phonebook = {}
    while True:
        command = int(input("command (1 search, 2 add, 3 quit): "))
        if command == 1:
            name = input("name: ")
            if name in phonebook:
                print(phonebook[name])
            else:
                print("no number")
        elif command == 2:
            name = input("name: ")
            number = input("number: ")
            phonebook[name] = number
            print("ok!")
        else:
            print("quitting...")
            break

phonebook()