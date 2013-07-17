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
		
//		이하 2장 과제
		
		Pawn pawn3 = new Pawn();
		//인수가 필요한 생성자인데 인수를 사용하지 않았으므로 컴파일 에러가 생긴다.
	}
}
