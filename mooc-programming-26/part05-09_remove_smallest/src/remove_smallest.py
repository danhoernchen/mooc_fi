# Write your solution here
def remove_smallest(numbers:list):
    smallest = float("inf")
    for num in numbers:
        if num < smallest:
            smallest = num
    return numbers.remove(smallest)
