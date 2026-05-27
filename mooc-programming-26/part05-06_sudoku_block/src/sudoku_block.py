# Write your solution here
def block_correct(sudoku:list, row_no: int, column_no: int):
    nums = []
    for i in range(row_no,row_no + 3):
        row = sudoku[i]
        for j in range(column_no,column_no + 3):
            if row[j] > 0 and row[j] in nums:
                return False
            nums.append(row[j])
    return True


