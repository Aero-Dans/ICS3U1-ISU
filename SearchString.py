uinput = int(input("How many strings in your array? "))
words = list()

for i in range(uinput):
    words.append(input("Enter word: "))

wordSearch = input("Enter the word search: ")

location = -1

for i in range(len(words)):
    if words[i] == wordSearch:
        location = i
        break;

if location == -1:
    print(wordSearch, "can not be found in the array.")

else:
    print(wordSearch, "can be found at the index of", location)