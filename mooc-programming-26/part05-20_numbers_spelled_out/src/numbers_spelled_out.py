# Write your solution here
def dict_of_numbers():
    nums = {0:"zero",1: "one", 2: "two", 3:"three", 4:"four",5:"five", 6:"six",7:"seven", 8:"eight",9:"nine",10:"ten",11:"eleven",12:"twelve",13:"thirteen"}
    dictionary = {}
    for i in range(0,100):
        if i <=13:
            dictionary[i] = nums[i]
        elif i < 20:
            if i == 15:
                dictionary[i] = "fifteen"
                continue
            if i == 18:
                dictionary[i] = "eighteen"
                continue
            dictionary[i] = nums[i-10] + "teen"
        elif i < 30:
            if i - 20 == 0:
                dictionary[i] = "twenty"
                continue
            dictionary[i] = "twenty-" + nums[i-20]
        elif i < 40:
            if i - 30 == 0:
                dictionary[i] = "thirty"
                continue
            dictionary[i] = "thirty-" + nums[i-30]
        elif i < 50:
            if i - 40 == 0:
                dictionary[i] = "forty"
                continue
            dictionary[i] = "forty-" + nums[i-40]
        elif i < 60:
            if i - 50 == 0:
                dictionary[i] = "fifty"
                continue
            dictionary[i] = "fifty-" + nums[i-50]
        elif i < 70:
            if i - 60 == 0:
                dictionary[i] = "sixty"
                continue
            dictionary[i] = "sixty-" + nums[i-60]
        elif i < 80:
            if i - 70 == 0:
                dictionary[i] = "seventy"
                continue
            dictionary[i] = "seventy-" + nums[i-70]
        elif i < 90:
            if i - 80 == 0:
                dictionary[i] = "eighty"
                continue
            dictionary[i] = "eighty-" + nums[i-80]
        elif i < 100:
            if i -90 == 0:
                dictionary[i] = "ninety"
                continue
            dictionary[i] = "ninety-" + nums[i-90]
        else:
            continue
    return dictionary


