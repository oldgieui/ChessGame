import java.util.ArrayList;

/**
 * 체스판을 관리하는 클래스임다.
 * 
 * @author oldgieui
 *
 */
public class Board {
	public static int numberOfWhitePawn = 0;
	public static int numberOfBlackPawn = 0;
	static ArrayList<Pawn> pawnList = new ArrayList<Pawn>();
	
	/**
	 * 자동 선언이 되지만 있는게 좋죠
	 */
	Board(){
		
	}
	
	/**
	 * Pawn에 입력된 인자 (색상) 에 따라 각각 num에 추가하고, pawnList에 pawn을 추가 시킨다.
	 */
	static void addPawn(Pawn pawn) {
		if (pawn.whatColor() == Pawn.white){
			pawnList.add(pawn);
			numberOfWhitePawn += 1;
			System.out.println(pawnList);
		}

		else if (pawn.whatColor() == Pawn.black){
			pawnList.add(pawn);
			numberOfBlackPawn += 1;
			System.out.println(pawnList);
		}
		
		else
			System.out.println(pawnList);
		
	}
	
	public static int numberOfPawn() {
		return numberOfWhitePawn + numberOfBlackPawn;
	}
}
