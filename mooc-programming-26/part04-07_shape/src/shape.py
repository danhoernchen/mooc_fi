# Copy here code of line function from previous exercise and use it in your solution
def line(amount, text):
    char = text[0] if len(text) > 0 else "*"
    print(char*amount)
    
def shape(length, tri_char, height, rec_char):
    for i in range(length):
        line(i+1, tri_char)
    for i in range(height):
        line(length, rec_char)    

# You can test your function by calling it within the following block
if __name__ == "__main__":
    shape(5, "x", 2, "o")