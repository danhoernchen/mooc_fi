# write your solution here
def open_file():
    return open("matrix.txt")
    
def row_sum(line: str):
    sum = 0
    nums = line.split(",")
    for num in nums:
        sum += int(num)
    return sum

def row_max(line:str):
    max = 0;
    nums = line.split(",")
    for num in nums:
        if int(num) > max:
            max = int(num)
    return max

def matrix_sum():
    sum = 0
    matrix = open_file()
    for line in matrix:
        sum += row_sum(line)
    return sum

def matrix_max():
    max = 0
    matrix = open_file()
    for line in matrix:
        cur_max = row_max(line)
        if cur_max > max:
            max = cur_max
    return max

def row_sums():
    result = []
    matrix = open_file()
    for line in matrix:
        result.append(row_sum(line))
    return result

