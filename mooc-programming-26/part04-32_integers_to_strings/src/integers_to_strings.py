# Write your solution here
def formatted(lst):
    final_lst = []
    for num in lst:
        final_lst.append(f"{num:.2f}")
    return final_lst