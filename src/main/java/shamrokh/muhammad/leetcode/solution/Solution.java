package shamrokh.muhammad.leetcode.solution;

class Solution {
    private final Character[][] matrix = new Character[3][3];
    private final int ROW = 0;
    private final int COLUMN = 1;

    public Solution(){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = ' ';
            }
        }
    }
    public String tictactoe(int[][] moves) {
        // we need 5 moves at least to get a winner
        if(moves.length < 5)
            return "Pending";

        for(int i=0;i<moves.length;i++){
            boolean isFirstPlayerTurn = i%2 == 0;
            char currentSymbol = isFirstPlayerTurn ? 'X':'O';
            int currentRowPosition = moves[i][ROW];
            int currentColumnPosition = moves[i][COLUMN];

            matrix[currentRowPosition][currentColumnPosition] = currentSymbol;
            // checking if there are three of the same character filling row
            if(matrix[currentRowPosition][0] == currentSymbol
                    && matrix[currentRowPosition][1] == currentSymbol
                    && matrix[currentRowPosition][2] == currentSymbol){

                return isFirstPlayerTurn? "A":"B";
            }

            // checking if there are three of the same character filling row
            if(matrix[0][currentColumnPosition] == currentSymbol
                    && matrix[1][currentColumnPosition] == currentSymbol
                    && matrix[2][currentColumnPosition] == currentSymbol){

                return isFirstPlayerTurn? "A":"B";
            }

            // checking diagonal
            if((matrix[0][0] == currentSymbol && matrix[1][1] == currentSymbol && matrix[2][2] == currentSymbol)
                || (matrix[0][2] == currentSymbol && matrix[1][1] == currentSymbol && matrix[2][0] == currentSymbol)){

                return isFirstPlayerTurn? "A":"B";
            }
        }

        return moves.length == 9? "Draw" : "Pending";
    }


}