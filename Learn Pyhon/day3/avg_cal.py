numbers = []
for i in range(5):
    num = float(input(f"Enter number {i+1}: "))
    numbers.append(num)

average = sum(numbers) / len(numbers)
print(average)