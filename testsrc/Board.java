import java.util.ArrayList;

public class Board {
	public static int numberOfWhitePawn = 0;
	public static int numberOfBlackPawn = 0;
	static ArrayList<Pawn> pawnList = new ArrayList<Pawn>();
	
	Board(){
		
	}
	
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
	
	static int numberOfPawn() {
		return numberOfWhitePawn + numberOfBlackPawn;
	}
}
