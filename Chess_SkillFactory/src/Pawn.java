public class Pawn extends ChessPiece {

    public Pawn (String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    @Override
    public boolean canMoveToPosition(
            ChessBoard chessBoard,
            int line,
            int column,
            int toLine,
            int toColumn
    ) {
        if (chessBoard.checkPos(toLine)
                && chessBoard.checkPos(toColumn)
                && !(line == toLine)) {
                if (chessBoard.board[toLine][toColumn] == null) {
                    if ((column == toColumn && color.equals("White") && line == 1 && toLine == 3 && chessBoard.board[2][column] == null) ||
                            (column == toColumn && color.equals("White") && line == (toLine - 1)) ||
                            (column == toColumn && color.equals("Black") && line == 6 && toLine == 4 && chessBoard.board[5][column] == null) ||
                            (column == toColumn && color.equals("Black") && toLine == (line - 1))) return true;
                } else {
                    if ((color.equals("White") && !chessBoard.board[toLine][toColumn].getColor().equals(color)
                    && toLine == ++line && Math.abs(toColumn - column) == 1) ||
                            (color.equals("Black") && !chessBoard.board[toLine][toColumn].getColor().equals(color)
                            && toLine == --line && Math.abs(toColumn - column) == 1)) return true;
                }
            } return false;
    }
}