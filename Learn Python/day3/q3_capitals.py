capitals = {
    "California": "Sacramento",
    "Texas": "Austin",
    "Florida": "Tallahassee",
    "New York": "Albany",
    "Washington": "Olympia"
}

state = input("Enter a state: ")
print(capitals.get(state, "State not found"))