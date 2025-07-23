package FlyweightDesignPattern.Ques2;

public class Piece {
    int x;
    int y;
    PieceType type;

    public Piece(int x, int y, PieceType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void render(){
        this.type.render(x, y);
    }
}
