name = input("Enter your name: ")
with open("greeting.txt", "w") as file:
    file.write(f"Hello, {name}!")
print("Greeting saved to greeting.txt")
