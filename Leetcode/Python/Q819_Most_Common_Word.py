def most_frequent_word(paragraph, banned):
    # Step 1: Normalize the paragraph by removing punctuation and converting to lowercase
    punctuation = ":!?',;."
    cleaned_paragraph = ""
    for char in paragraph:
        if char not in punctuation:
            cleaned_paragraph += char
        else:
            cleaned_paragraph += " "  # Replace punctuation with space for splitting words

    cleaned_paragraph = cleaned_paragraph.lower()  # Convert to lowercase

    # Step 2: Split words and count frequencies
    words = cleaned_paragraph.split()
    word_count = {}
    for word in words:
        if word not in banned:
            if word in word_count:
                word_count[word] += 1
            else:
                word_count[word] = 1

    # Step 3: Find the most frequent non-banned word
    most_frequent = None
    max_count = 0
    for word, count in word_count.items():
        if count > max_count:
            most_frequent = word
            max_count = count

    return most_frequent

# Example usage
paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit."
banned1 = ["hit"]
print(most_frequent_word(paragraph1, banned1))  # Output: "ball"

paragraph2 = "a, a, a, a, b,b,b,c, c"
banned2 = ["a"]
print(most_frequent_word(paragraph2, banned2))  # Output: "a"
