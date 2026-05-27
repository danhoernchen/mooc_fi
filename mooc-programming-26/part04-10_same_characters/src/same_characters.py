# Write your solution here
def same_chars(text, idx_1, idx_2):
    if idx_1 > len(text)-1 or idx_2 > len(text)-1 or text[idx_1] != text[idx_2]:
        return False
    else:
        return True
# You can test your function by calling it within the following block
if __name__ == "__main__":
    print(same_chars("abc", 0, 3))