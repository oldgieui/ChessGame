import junit.framework.TestCase;


public class BoardTest extends TestCase {
	public void testcreate() throws Exception {
		Pawn pawn1 = new Pawn(Pawn.white);
		Pawn pawn2 = new Pawn(Pawn.black);
		
		assertEquals(0, Board.numberOfPawn());
		Board.addPawn(pawn1);
		Board.addPawn(pawn2);
		
	}
}
