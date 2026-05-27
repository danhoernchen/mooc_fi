# write your solution here
def read_fruits():
    result = {}
    with open("fruits.csv") as fruit_file:
        for line in fruit_file:
            line = line.replace('\n','')
            fruit = line.split(";")
            result[fruit[0]] = float(fruit[1])
    return result
