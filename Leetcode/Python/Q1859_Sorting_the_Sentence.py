class Solution(object):
    def sortSentence(self, s):
        """
        This function takes a shuffled sentence where each word has a number at the end indicating its original position.
        It returns the sentence with the words sorted in their original order.
        """
        # Split the input string into individual words
        words = s.split()  # Example: "is2 sentence4 This1 a3" -> ['is2', 'sentence4', 'This1', 'a3']
        
        # Create an empty list to store the sorted words, with the same length as the number of words
        sorted_words = [None] * len(words)  # Example: If there are 4 words, create [None, None, None, None]
        
        # Loop through each word in the list of words
        for word in words:
            # Extract the position from the last character of the word and convert it to an index (0-based)
            index = int(word[-1]) - 1  # Example: 'is2' -> 1 (position is 2, index is 1)
            
            # Remove the number at the end and place the word in the correct position in the sorted list
            sorted_words[index] = word[:-1]  # 'is2' becomes 'is' and is placed at sorted_words[1]
        
        # Join the sorted words into a single string separated by spaces and return the result
        return ' '.join(sorted_words)  # Example: ['This', 'is', 'a', 'sentence'] -> "This is a sentence"
