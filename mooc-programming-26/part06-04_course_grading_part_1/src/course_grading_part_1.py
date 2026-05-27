# write your solution here
def student_information():
    student_file = input("Student information: ")
    exercise_file = input("Exercises information: ")
    students = read_students(student_file)
    exercises = read_exercises(exercise_file)
    combine_data(students, exercises)


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

def combine_data(students, exercises):
    for student_id,name in students.items():
        if student_id in exercises:
            total = 0
            for num in exercises[student_id]:
                total += int(num)
            print(f"{name} {total}")
        else:
            print(f"{name} 0")

student_information()