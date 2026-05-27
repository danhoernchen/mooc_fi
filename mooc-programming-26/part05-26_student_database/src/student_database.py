# Write your solution here
def add_student(students: dict, name: str):
    students[name] = {"name": name, "courses":[]}

def print_student(students:dict,name:str):
    if name in students:
        student = students[name]
        print(student["name"] + ":")
        if len(student["courses"]) > 0:
            print(f" {len(student["courses"])} completed courses:")
            total = 0
            for course in student["courses"]:
                print(f"  {course["name"]} {course["grade"]}")
                total += course["grade"]
            print(f" average grade {total/len(student["courses"])}")
        else:
            print(" no completed courses")
    else:
        print(name +": no such person in the database")

def add_course(students: dict, name: str, completion: tuple):
    if name in students:
        courses = students[name]["courses"]
        exists = False
        for course in courses:
            if course["name"] == completion[0]:
                exists = True
                if course["grade"] < completion[1]:
                    course["grade"] = completion[1]
        if completion[1] > 0 and exists != True:
            students[name]["courses"].append({"name":completion[0], "grade":completion[1]})

def summary(students: dict):
    most_courses = {"name":"", "courses":[]}
    best_avg = {"name":"", "courses":[]}
    avg_num = 0
    for name in students:
        student = students[name]
        total = 0
        if len(student["courses"]) > 0:
            for course in student["courses"]:
                total += course["grade"]
        avg = total/len(student["courses"])
        if len(student["courses"]) > len(most_courses["courses"]):
            most_courses = student
        if avg > avg_num:
            avg_num = avg
            best_avg = student
    print(f"students {len(students)}")
    print(f"most courses completed {len(most_courses["courses"])} {most_courses["name"]}")
    print(f"best average grade {avg_num} {best_avg["name"]}")


