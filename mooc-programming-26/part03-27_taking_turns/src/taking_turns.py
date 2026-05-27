# Write your solution here
end = int(input("Please type in a number: "))
odd = True if end%2 != 0 else False
start = 1
while end > start:
    print(start)
    start += 1
    print(end)
    end -= 1
if odd:
    print(end)