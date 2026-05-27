# Write your solution here
def even_numbers(lst):
    even_nums = []
    for num in lst:
        if num % 2 == 0:
            even_nums.append(num)
    return even_nums
