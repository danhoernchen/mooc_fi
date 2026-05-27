# Write your solution here
def spruce(height):
    print('a spruce!')
    j = 1
    for i in range(height):
        print((height-j)*" " + "*" * (i + j))
        j += 1
    print((height-1) * " " + "*")
# You can test your function by calling it within the following block
if __name__ == "__main__":
    spruce(5)