public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "B";
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
                && !(column == toColumn)
                && !(line == toLine)
                && Math.abs(toColumn - column) == Math.abs(toLine - line)) {
            if (chessBoard.board[toLine][toColumn] == null
                    || !chessBoard.board[toLine][toColumn].getColor().equals(color)) {
                if (toLine - line > 0 && toColumn - column > 0) {
                    for (int i = 1; i < Math.abs(toColumn - column); i++)
                        if (chessBoard.board[line + i][column + i] != null) return false;
                }
                if (toLine - line > 0 && toColumn - column < 0) {
                    for (int i = 1; i < Math.abs(toColumn - column); i++) {
                        if (chessBoard.board[line + i][column - i] != null) return false;
                    }
                }
                if (toLine - line < 0 && toColumn - column > 0) {
                    for (int i = 1; i < Math.abs(toColumn - column); i++) {
                        if (chessBoard.board[line - i][column + i] != null) return false;
                    }
                }
                if (toLine - line < 0 && toColumn - column < 0) {
                    for (int i = 1; i < Math.abs(toColumn - column); i++) {
                        if (chessBoard.board[line - i][column - i] != null) return false;
                    }
                }
                return true;
            }
        } return false;
    }
}