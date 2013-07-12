import junit.framework.TestCase;


public class pawntest extends TestCase {
	public void testcreate() throws Exception {
		String white = "white";
		String black = "black";
		Pawn pawn1 = new Pawn(white);
		String color = pawn1.whatColor();
		assertEquals(white, color);
		

		Pawn pawn2 = new Pawn(black);
		String color2 = pawn2.whatColor();
		assertEquals(black, color2);
	}
}
