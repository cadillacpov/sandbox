sentence = input("Enter a sentence: ").lower()
word_to_find = input("Enter word to count: ").lower()

words = sentence.split()
count = words.count(word_to_find)
print(count)