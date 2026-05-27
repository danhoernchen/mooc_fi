# Write your solution here
def chessboard(num):
    for i in range(num):
        line = ""
        if i%2 == 0:
            for j in range(num):
                if j%2 == 0:
                    line = line + "1"
                else:
                    line = line + "0"
        else:
            for j in range(num):
                if j%2 == 0:
                    line = line + "0"
                else:
                    line = line + "1"
        print(line)
                
# Testing the function
if __name__ == "__main__":
    chessboard(3)
