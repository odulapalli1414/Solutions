class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        reversed_str = ""
        for i in range(len(words)-1, -1, -1):
            if(i!=0):
                reversed_str += words[i] + " "
            else:
                reversed_str += words[i]
        return reversed_str
