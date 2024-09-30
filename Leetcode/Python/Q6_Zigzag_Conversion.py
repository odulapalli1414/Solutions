def convert(s: str, numRows: int) -> str:
    # Edge case: If numRows is 1, return the input string
    if numRows == 1:
        return s

    # Create a list of strings to hold the characters for each row
    rows = [''] * min(numRows, len(s))  # We only need min(numRows, len(s)) rows
    currentRow = 0  # Start from the first row
    goingDown = False  # To track if we are going down or up

    # Iterate over the characters in the string
    for c in s:
        rows[currentRow] += c  # Add the character to the current row

        # If we're at the top or bottom row, reverse the direction
        if currentRow == 0 or currentRow == numRows - 1:
            goingDown = not goingDown

        # Move to the next row, either up or down
        currentRow += 1 if goingDown else -1

    # Combine all rows into one string
    return ''.join(rows)


# Test cases
s1 = "PAYPALISHIRING"
numRows1 = 3
print(convert(s1, numRows1))  # Output: "PAHNAPLSIIGYIR"

s2 = "PAYPALISHIRING"
numRows2 = 4
print(convert(s2, numRows2))  # Output: "PINALSIGYAHRPI"

s3 = "A"
numRows3 = 1
print(convert(s3, numRows3))  # Output: "A"
