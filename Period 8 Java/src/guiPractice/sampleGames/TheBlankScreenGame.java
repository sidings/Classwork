package guiPractice.sampleGames;

import guiPractice.GUIApplication;
import guiPractice.Screen;

public class TheBlankScreenGame extends GUIApplication {

	protected void initScreen() {
		Screen s = new CoordinateScreen(getWidth(), getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		new TheBlankScreenGame();
	}

}
