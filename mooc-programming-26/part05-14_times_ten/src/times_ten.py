# Write your solution here
def times_ten(start_idx: int, end_idx: int):
    dict = {}
    for i in range(start_idx, end_idx + 1):
        dict[i] = 10 * i
    return dict

