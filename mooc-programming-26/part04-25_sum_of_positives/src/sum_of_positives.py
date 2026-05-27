# Write your solution here
def sum_of_positives(lst):
    total = 0
    for num in lst:
        if num > 0:
            total += num
    return total
    
