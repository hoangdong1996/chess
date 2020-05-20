public abstract  class Piece {
    public int x, y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Piece(){}

    public abstract boolean isValidPath(int finalX, int finalY);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
