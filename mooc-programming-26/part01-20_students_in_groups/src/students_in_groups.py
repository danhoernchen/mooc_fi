# Write your solution here
import math
num = int(input("How many students on the course?" ))
size = int(input("Desired group size? "))
print(f"Number of groups formed: {math.ceil(num/size)}")