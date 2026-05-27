# write your solution here

def largest():
    with open("numbers.txt") as numbers_file:
        largest = 0
        for number in numbers_file:
            num = int(number)
            if num > largest:
                largest = num
        return largest

