# Write your solution here
def letter_square(size: int):
    init_chars = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    used_chars = init_chars[0:size]
    chars = list(reversed(used_chars))
    size = (size-1) * 2
    for i in range(0,int(size/2)):
        line = ""
        for j in range(0,i):
            line += chars[j]
        for j in range(len(line),int(size/2)):
            line+=chars[i]
        for j in range(size - len(line)  ,-1,-1):
            if j<i:
                line+=chars[j]
            elif i > 0 and j > 0:
                line+=chars[i]
            else: 
                line+= chars[0]
        print(line)
    for i in range(int(size/2)-1,size):
        line = ""
        for j in range(0,size-i):
            line += chars[j]
        for j in range(len(line),int(size/2)):
            line+=chars[size-i-1]
        for j in range(size - len(line)  ,-1,-1):
            if j<size-i:
                line+=chars[j]
            elif size-i > 0 and j > 0:
                line+=chars[size-i-1]
            else: 
                line+= chars[0]
        print(line)




layer = int(input("Layers: "))
letter_square(layer)