# Write your solution here
def distinct_numbers(lst):
    new_lst = []
    for num in lst:
        if num in new_lst:
            continue
        else:
            new_lst.append(num)
    return sorted(new_lst)