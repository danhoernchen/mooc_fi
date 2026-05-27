# Write your solution here
def line(amount, text):
    char = text[0] if len(text) > 0 else "*"
    print(char*amount)
# You can test your function by calling it within the following block
if __name__ == "__main__":
    line(5, "x")