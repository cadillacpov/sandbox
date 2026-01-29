filename = input("Enter the file name to count words: ")
try:
    with open(filename, "r") as file:
        content = file.read()
        words = content.split()
        print(f"Total words in {filename}: {len(words)}")
except FileNotFoundError:
    print("File not found.")
