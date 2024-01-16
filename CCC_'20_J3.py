min_X, min_Y = 101, 101
max_X, max_Y = -1, -1
dropsPaint = int(input())

for i in range(dropsPaint):
    input_cords = input().split(",")
    inputX = int(input_cords[0])
    inputY = int(input_cords[1])

    if inputX >= max_X:
        max_X = inputX+1

    if inputX <= min_X:
        min_X = inputX-1

    if inputY >= max_Y:
        max_Y = inputY+1

    if inputY <= min_Y:
        min_Y = inputY-1

print(min_X, min_Y, sep = ",")
print(max_X, max_Y, sep = ",")