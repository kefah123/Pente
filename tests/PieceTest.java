import com.kefah.project.java.Piece;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PieceTest {

    @Test
    public void placePiece() {
        Piece piece = new Piece();
        assertEquals(0,piece.getY());
        assertEquals(0,piece.getX());

        Piece piece2 = new Piece(3,2);
        assertEquals(2,piece2.getY());
        assertEquals(3,piece2.getX());
    }



}