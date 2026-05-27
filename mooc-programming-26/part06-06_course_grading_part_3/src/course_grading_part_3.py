# tee ratkaisu tänne
# write your solution here
# write your solution here
def student_information():
    if True:
        student_file = input("Student information: ")
        exercise_file = input("Exercises information: ")
        exam_file = input("Exam points: ")
    else:
        student_file = "students2.csv"
        exercise_file = "exercises2.csv"
        exam_file = "exam_points2.csv"
    students = read_students(student_file)
    exercises = read_exercises(exercise_file)
    exam_points = read_exams(exam_file)
    exrc_num = ex_num(exercises)
    exercise_points = calc_exercises(exercises)
    exam_total = calc_exam(exam_points)
    grades = calc_grade(students, exercise_points,exam_total)
    print_stats(students,exrc_num,exercise_points,exam_total,grades)


def read_exercises(exercise_file:str):
    exercises = {}
    with open(exercise_file) as exercise_file:
        for line in exercise_file:
            line = line.rstrip()
            parts = line.split(";")
            if parts[0] == "id":
                continue
            exercises[parts[0]] = parts[1:]
    return exercises

def read_students(student_file:str):
    students = {}
    with open(student_file) as student_file:
        for line in student_file:
            line = line.rstrip()
            parts = line.split(";")
            if parts[0] == "id":
                continue
            students[parts[0]] = parts[1] + " " + parts[2]
    return students

def read_exams(exam_file):
    exam_points = {}
    with open(exam_file) as exam_file:
        for line in exam_file:
            line = line.rstrip()
            parts = line.split(";")
            if parts[0] == "id":
                continue
            exam_points[parts[0]] = parts[1:]
    return exam_points

def calc_exercises(exercises):
    exercise_results = {}
    for student in exercises:
        total = 0
        for num in exercises[student]:
            total += int(num)
        result = int(total/40 * 10)
        exercise_results[student] = result
    return exercise_results

def ex_num(exercises):
    exercise_results = {}
    for student in exercises:
        total = 0
        for num in exercises[student]:
            total += int(num)
        exercise_results[student] = total
    return exercise_results

def calc_exam(exam_points):
    exam_total = {}
    for student in exam_points:
        total = 0
        for num in exam_points[student]:
            total += int(num)
        exam_total[student] = total
    return exam_total

def calc_grade(students,exercises,exams):
    grades = {}
    for student in students:
        total = 0
        grade = 0
        total += exercises[student]
        total += exams[student]
        if total  > 14 and total < 18:
            grade = 1
        elif total > 17 and total < 21:
            grade = 2
        elif total > 20 and total < 24:
            grade = 3
        elif total > 23 and total < 28:
            grade = 4
        elif total > 28:
            grade = 5
        grades[student] = grade
    return grades            

def combine_data(students, grades):
    for id, name in students.items():
        if id in grades:
            print(f"{name} {grades[id]}")
        else:
            print(f"{name} 0")

def print_stats(students, ex_num, ex_points, exm_pts, grades):
    print(f"{'name':30}{'exec_nbr':10}{'exec_pts.':10}{'exm_pts.':10}{'tot_pts.':10}{'grade':10}")
    for id, student in students.items():
        name = student
        exrc_nmbr = "0"
        exrc_points = "0"
        exam_points = "0"
        grade = "0"
        if id in ex_num:
            exrc_nmbr = str(ex_num[id])
        if id in ex_points:
            exrc_points = str(ex_points[id])
        if id in exm_pts:
            exam_points = str(exm_pts[id])
        if id in grades:
            grade = grades[id]
        print(f"{name:30}{exrc_nmbr:10}{exrc_points:10}{exam_points:10}{str(int(exrc_points)+int(exam_points)):10}{grade:<10}")



student_information()