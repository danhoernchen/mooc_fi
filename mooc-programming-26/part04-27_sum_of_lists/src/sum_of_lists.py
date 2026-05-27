# Write your solution here
def list_sum(lst_one, lst_two):
    sum_lst = []
    for i in range(len(lst_one)):
        sum_lst.append(lst_one[i] + lst_two[i])
    return sum_lst
