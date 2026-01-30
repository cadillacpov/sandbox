filename = "q2_story.txt"

try:
    with open(filename, "r") as file:
        print(f"--- Contents of {filename} ---")
        for line in file:
            print(line.strip())

except FileNotFoundError:
    print(f"Error: The file '{filename}' was not found. Please ensure it exists.")

except Exception as e:
    print(f"An unexpected error occurred: {e}")