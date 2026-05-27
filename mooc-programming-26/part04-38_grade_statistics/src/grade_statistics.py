# Write your solution here
def handle_input(strg):
    lst = strg.split()
    exam_points = int(lst[0])
    exercise_points = int(int(lst[1])/10)
    return [exam_points, exercise_points]

def calc_grade(lst):
    total = lst[0] + lst[1]
    if lst[0] < 10:
        return 0
    elif total <= 14:
        return 0
    elif total <= 17:
        return 1
    elif total <= 20:
        return 2
    elif total <= 23:
        return 3
    elif total <= 27:
        return 4
    else:
        return 5

def calc_average(total, count):
    return round(total/count,1)

def calc_passing(lst):
    passed = 0
    for grade in lst:
        if grade > 0:
            passed += 1
    return round((passed/len(lst)) * 100,1)


def main():
    all_grades = []
    total = 0
    while True:
        get_input = input("Exam points and exercises completed: ")
        if get_input == "":
            break
        else:
            lst = handle_input(get_input)
            grade = calc_grade(lst)
            total += lst[0] + lst[1]
            all_grades.append(grade)
    print("Statistics:")
    print(f"Points average: {calc_average(total, len(all_grades))}")
    print(f"Pass percentage: {calc_passing(all_grades)}")
    print("Grade distribution:")
    print(f"5: {all_grades.count(5) * "*"}")
    print(f"4: {all_grades.count(4) * "*"}")
    print(f"3: {all_grades.count(3) * "*"}")
    print(f"2: {all_grades.count(2) * "*"}")
    print(f"1: {all_grades.count(1) * "*"}")
    print(f"0: {all_grades.count(0) * "*"}")



main()