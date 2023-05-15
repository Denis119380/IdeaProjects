public class King extends ChessPiece{

    public King (String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    @Override
    public boolean canMoveToPosition(
            ChessBoard chessBoard,
            int line,
            int column,
            int toLine,
            int toColumn
    ) {
        if (chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (!(line == toLine && column == toColumn)) {

                    if (Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1) {

                    if (!(isUnderAttack(chessBoard, toLine, toColumn))) {

                        if (chessBoard.board[toLine][toColumn] != null)
                            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
                        else return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isUnderAttack (
            ChessBoard chessBoard,
            int line,
            int column
    ) {
        if (chessBoard.checkPos(line) && chessBoard.checkPos(column)) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (chessBoard.board[i][j] != null) {
                    if (!chessBoard.board[i][j].getColor().equals(color) &&
                    chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) return true;
                    }
                }
            }
        }
        return false;
    }
}