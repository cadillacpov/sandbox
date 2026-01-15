import random

def get_random_in_range(start, end):
    return random.randint(start, end)

low = int(input("Enter lower bound: "))
high = int(input("Enter upper bound: "))
print(get_random_in_range(low, high))