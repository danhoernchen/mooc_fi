# Write your solution here
def row_correct(sudoku:list, row_no: int):
    nums = []
    for num in sudoku[row_no]:
        if num in nums and num != 0:
            return False
        else:
            nums.append(num)
    return True

def column_correct(sudoku: list, col_no: int):
    nums = []
    for row in sudoku:
        if row[col_no] > 0 and row[col_no] in nums:
            return False
        nums.append(row[col_no])
    return True

def block_correct(sudoku:list, row_no: int, column_no: int):
    nums = []
    for i in range(row_no,row_no + 3):
        row = sudoku[i]
        for j in range(column_no,column_no + 3):
            if row[j] > 0 and row[j] in nums:
                return False
            nums.append(row[j])
    return True

def sudoku_grid_correct(sudoku:list):
    row_check = True
    column_check = True
    block_check = True
    block_coords = [[0,0],[0,3],[0,6],[3,0],[3,3],[3,6],[6,0],[6,3],[6,6]]
    for i in range(len(sudoku)):
        if row_correct(sudoku, i) == False:
            row_check = False
    for i in range(len(sudoku[0])):
        if column_correct(sudoku,i) == False:
            column_check = False
    for coords in block_coords:
        if block_correct(sudoku, coords[0], coords[1]) == False:
            block_check = False

    return column_check and row_check and block_check
    







