# Write your solution here
# Let's take the square root of math-module in use
from math import sqrt

# Note that the square root can also be calculated using power.
# sqrt(9) is equivalent to 9 ** 0.5
num_a = int(input('Value of a: '))
num_b = int(input('Value of b: '))
num_c = int(input('Value of c: '))
num_d = sqrt((num_b*num_b) - (4 * num_a * num_c))
print(f"The roots are {((num_b * - 1) + num_d)/ (2 * num_a)} and {((num_b * - 1) - num_d)/ (2 * num_a)}")
