# Write your solution here
def column_correct(sudoku: list, col_no: int):
    nums = []
    for row in sudoku:
        if row[col_no] > 0 and row[col_no] in nums:
            return False
        nums.append(row[col_no])
    return True