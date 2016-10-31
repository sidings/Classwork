package caveExplorer;
import java.util.Scanner;
public class caveExplorer {

	public static pd8CaveRoom[][] caves;
	public static Scanner in;
	public static pd8CaveRoom currentRoom;
	public static InventoryNockles inventory;
	
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		caves = new pd8CaveRoom[5][5];
		for(int row = 0; row < caves.length; row++){
			for (int col = 0; col < caves[row].length; col++){
				caves[row][col] = new pd8CaveRoom("This room has coordinates" + row + ", " + col);
			}
		}
	
	currentRoom = caves[1][2];
	currentRoom.enter();
	caves[1][2].setConnection();
}
}
