# Write your solution here
def copy_and_add(sudoku: list, row_no: int, column_no: int, num: int):
    new_sudoku = []
    for i in range(len(sudoku)):
        new_sudoku.append([])
        for j in range(len(sudoku[i])):
            new_sudoku[i].append(sudoku[i][j])

    new_sudoku[row_no][column_no] = num
    return new_sudoku

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

