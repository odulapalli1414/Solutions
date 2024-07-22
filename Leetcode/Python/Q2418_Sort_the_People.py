class Solution(object):
    def sortPeople(self, names, heights):
        """
        :type names: List[str]
        :type heights: List[int]
        :rtype: List[str]
        """
        # Combine the names and heights into a list of tuples
        people = list(zip(names, heights))

        # Sort the list of tuples by heights in descending order
        people.sort(key=lambda x: x[1], reverse=True)

        # Extract the names from the sorted list of tuples
        sorted_names = [person[0] for person in people]

        # Return the sorted list of names
        return sorted_names
