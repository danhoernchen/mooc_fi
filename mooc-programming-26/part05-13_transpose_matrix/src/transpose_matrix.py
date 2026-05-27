# Write your solution here
def transpose(matrix: list):
    rows = []
    for i in range(len(matrix)):
        rows.append([])
        for num in matrix[i]:
            rows[i].append(num)
    for i in range(len(rows)):
        for j in range(len(rows[i])):
            matrix[j][i] = rows[i][j]
