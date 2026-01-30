file_path = input("Enter the filename: ")

try:
    with open(file_path, 'r') as file:
        content = file.read()
        words = content.split()

        print(f"Total word count: {len(words)}")

except FileNotFoundError:
    print("Error: The file does not exist.")
except PermissionError:
    print("Error: You do not have permission to access this file.")
