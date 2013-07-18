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
		
//		이하 2장 과제
		
		//Pawn pawn3 = new Pawn();
		//인수가 필요한 생성자인데 인수를 사용하지 않았으므로 컴파일 에러가 생긴다.
		//흰 색의 말을 생성하는 두 번째 생성자 추가
		Pawn pawn3 = new Pawn(Pawn.white);
		String color3 = pawn3.whatColor();
		assertEquals(Pawn.white, color3);
	}
}

