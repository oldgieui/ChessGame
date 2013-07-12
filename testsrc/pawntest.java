import junit.framework.TestCase;


public class pawntest extends TestCase {
	public void testcreate() throws Exception {
		Pawn pawn1 = new Pawn("white");
		String color = pawn1.whatColor();
		assertEquals("white", color);
	}
}
