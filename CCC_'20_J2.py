targetTotal = int(input())
infectDay0 = int(input())
infectOther = int(input())

infectTotal = infectDay0
infected = infectDay0
day = 0

while True:

    if infectTotal > targetTotal:
        print(day)
        break

    else:
        infected *= infectOther
        infectTotal += infected
        day += 1  