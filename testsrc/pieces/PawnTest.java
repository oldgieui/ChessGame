package pieces;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testcreate() throws Exception {

		Pawn pawn1 = new Pawn(Pawn.white);
		String color = pawn1.whatColor();
		assertEquals(Pawn.white, color);
		

		Pawn pawn2 = new Pawn(Pawn.black);
		String color2 = pawn2.whatColor();
		assertEquals(Pawn.black, color2);
	}
}

