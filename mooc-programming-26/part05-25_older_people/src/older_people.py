# Write your solution here
def older_people(people:list, year:int):
    result = []
    for person in people:
        if person[1] < year:
            result.append(person[0])
    return result



