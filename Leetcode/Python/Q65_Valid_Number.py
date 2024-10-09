class Solution(object):
    def is_float(self, s):
        """
        Helper function to check if a string can be converted to a float.
        """
        try:
            float(s)
            return True
        except ValueError:
            return False

    def isNumber(self, s):
        """
        Main function to check if the input string is a valid number,
        handling integers, floats, and numbers in scientific notation.
        """
        # Normalize string by trimming leading/trailing spaces
        s = s.strip()

        # Exclude 'inf', 'Infinity', and 'NaN' since they are not valid numbers for this problem
        if s.lower() in ['inf', '-inf', '+inf', 'infinity', '-infinity', '+infinity', 'nan']:
            return False

        # If both 'e' and 'E' are present, return False (invalid number format)
        if 'e' in s and 'E' in s:
            return False

        # Split by 'e' or 'E' if present, for scientific notation handling
        parts = s.lower().split('e')

        # There should be at most one 'e', so parts should be 1 (no 'e') or 2 (with 'e')
        if len(parts) > 2:
            return False

        # Check if the part before 'e' is a valid float or integer
        if not self.is_float(parts[0]):
            return False

        # If there's an exponent part, check if it's a valid integer
        if len(parts) == 2:
            # The part after 'e' must be a valid integer (optional sign and digits)
            exp = parts[1]
            if not exp.lstrip('+-').isdigit():  # Strip signs and check if remaining is digits
                return False

        return True
