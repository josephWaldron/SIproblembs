public class loopswarrays {
    public static void main(String[] args) {
        int board[][] = {
            {1,0,1,0},
            {0,1,0,1},
            {1,0,1,0},
            {0,1,0,1}
        };
        int row, colum; 
        for(row = 0; row < board.length; row++){
            for(colum = 0; colum < board[row].length; colum++){
                System.out.print(board[row][colum]);
            }
            System.out.println();
        }

    }
}
