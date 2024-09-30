int x = Math.min(s.length(), numRows);

        StringBuilder[] rows = new StringBuilder[x];
        for(int i=0; i<x; i++){
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()){
            rows[currentRow].append(c);

            if(currentRow == 0 || currentRow == numRows-1){
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }

        return result.toString();
