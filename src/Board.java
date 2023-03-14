public class Board {

    private Square[][] squares;

    // Initialize the board.
    public Board() {
        this.squares = new Square[8][8];
        for (int row=1;row<=8;row++) {
            for (int col=1;col<=8;col++) {
                Color color = (row+col) % 2 == 0 ? Color.WHITE : Color.BLACK;
                this.squares[row][col] = new Square(row,col,color);
            }
        }
    }

    public void movePiece(Piece piece, Square destination) {
        Square currentPosition = piece.getPosition();
        // logic to move a piece on the board
    }
}
