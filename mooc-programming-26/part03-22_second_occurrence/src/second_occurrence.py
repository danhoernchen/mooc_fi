# Write your solution here
text = input("Please type in a string: ")
substring = input("Please type in a substring: ")
first = text.find(substring)
if first >= 0:
    second = text.find(substring, (first+len(substring)))
    if second >= 0:
        print(f"The second occurrence of the substring is at index {second}.")
if first < 0 or second < 0:        
    print("The substring does not occur twice in the string.")