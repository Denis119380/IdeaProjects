public class Queen extends ChessPiece{

    public Queen (String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    @Override
    public boolean canMoveToPosition(
            ChessBoard chessBoard,
            int line,
            int column,
            int toLine,
            int toColumn
    ) {
        if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)
                && ((line == toLine ^ column == toColumn)
                || Math.abs(toLine - line) == Math.abs(toColumn - column))
                ) {
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
                if (toLine - line > 0 && toColumn == column) {
                    for (int i = 1; i < Math.abs(toLine - line); i++) {
                        if (chessBoard.board[line + i][column] != null) return false;
                    }
                }
                if (toLine - line < 0 && toColumn == column) {
                    for (int i = 1; i < Math.abs(toLine - line); i++) {
                        if (chessBoard.board[line - i][column] != null) return false;
                    }
                }
                if (toColumn - column > 0 && toLine == line) {
                    for (int i = 1; i < Math.abs(toColumn - column); i++) {
                        if (chessBoard.board[line][column + i] != null) return false;
                    }
                }
                if (toColumn - column < 0 && toLine == line) {
                    for (int i = 1; i < Math.abs(toColumn - column); i++) {
                        if (chessBoard.board[line][column - i] != null) return false;
                    }
                }
                return true;
            }
        } return false;
    }
}