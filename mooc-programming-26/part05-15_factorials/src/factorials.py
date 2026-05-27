# Write your solution here
def factorials(n:int):
    result = {}
    current = 1
    for i in range(1,n + 1):
        result[i] = current * i
        current = result[i]
        
    print(result)
    return result

