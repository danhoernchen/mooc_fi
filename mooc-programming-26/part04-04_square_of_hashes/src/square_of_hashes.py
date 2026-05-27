# Copy here code of line function from previous exercise
def line(amount, text):
    char = text[0] if len(text) > 0 else "*"
    print(char*amount)

def square_of_hashes(size):
    # You should call function line here with proper parameters
    for i in range(size):
        line(size, "#")

# You can test your function by calling it within the following block
if __name__ == "__main__":
    square_of_hashes(5)
