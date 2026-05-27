# Write your solution here
def histogram(my_str: str):
    result = {}
    for char in my_str:
        if char not in result:
            result[char] = 0
        result[char] += 1

    for char in result:
        print(f"{char} {'*' * result[char]}")