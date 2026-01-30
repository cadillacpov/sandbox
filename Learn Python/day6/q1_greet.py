name = input("Enter your name: ")

with open("q1_greeting.txt", "w") as file:
    file.write(f"Hello, {name}!")

print("Greeting saved to q1_greeting.txt")