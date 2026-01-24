age = int(input("Enter your age: "))

if age < 18:
    print("Minor")
elif age < 65:
    print("Adult")
else:
    print("Senior Citizen")