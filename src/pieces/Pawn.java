package pieces;

public class Pawn {
	
	public final static String white = "white";
	public final static String black = "black";
	
	String color;
	public Pawn(String color){
		this.color = color;
	}
	public String whatColor(){
		return color;
	}
}