public class Bishop extends Piece {
    Type type;

    public Bishop(int x, int y) {
        super(x, y);
        type = Type.BISHOP;
    }

    public Bishop() {
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        int x_diff = Math.abs(finalX - this.x);
        int y_diff = Math.abs(finalY - this.y);

        return x_diff == y_diff;
    }
}
