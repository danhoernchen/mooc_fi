# Write your solution here
def print_sudoku(sudoku:list):
    for j in range(len(sudoku)):
        line = ""
        for i in range(len(sudoku[j])):
            if sudoku[j][i] > 0:
                line += f"{str(sudoku[j][i])} "
            else:
                line += "_ "
            if i == 2 or i == 5 or i ==8:
                line += " "
        print(line)
        if j == 2 or j == 5 or j ==8:
                print("")

def add_number(sudoku:list, row_no: int, column_no: int, num: int):
    sudoku[row_no][column_no] = num
