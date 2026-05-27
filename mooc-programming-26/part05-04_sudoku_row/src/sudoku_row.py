# Write your solution here
def row_correct(sudoku:list, row_no: int):
    nums = []
    for num in sudoku[row_no]:
        if num in nums and num != 0:
            return False
        else:
            nums.append(num)
    return True