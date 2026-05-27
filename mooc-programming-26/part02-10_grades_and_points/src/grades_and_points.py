# Write your solution here
points = int(input("How many points [0-100]: "))
text = "Grade: "
if points > 100 or points < 0:
    text += "impossible!"
elif points <= 49:
    text += "fail"
elif points > 49 and points < 60:
    text += "1"
elif points > 59 and points < 70:
    text += "2"
elif points > 69 and points < 80:
    text += "3"
elif points > 79 and points < 90:
    text += "4"
else:
    text += "5"     
print(text)