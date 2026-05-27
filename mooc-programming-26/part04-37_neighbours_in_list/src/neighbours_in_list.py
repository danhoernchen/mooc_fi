# Write your solution here
def longest_series_of_neighbours(lst):
    longest = 0
    for i in range(len(lst)):
        current_list = lst[i:]
        cur_length = 0
        prev = current_list[0]
        for j in range(len(current_list)):
            if j == 0:
                continue
            if current_list[j] + 1 == prev or current_list[j] -1 == prev:
                prev = current_list[j]
                cur_length += 1
                if cur_length > longest:
                    longest = cur_length
            else:
                if cur_length > longest:
                    longest = cur_length
                break
    return longest + 1
            
