database = list()
no_dup = list()

while True:
    uinput = input("Enter a value, input Exit to stop: ")

    if uinput == "Exit":
        break

    else:
        num = int(uinput)
        database.append(num)

print("Current database:", database)

for i in database:
    if i not in no_dup:
        no_dup.append(i)

print("No Duplicate List:", no_dup) 