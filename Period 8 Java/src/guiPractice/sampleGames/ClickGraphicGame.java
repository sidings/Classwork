package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class ClickGraphicGame extends GUIApplication{

	public static ClickGraphicsScreen clickScreen;
	public static ClickGraphicGame game;
	
	
	public static void main(String[] args) {
		game = new ClickGraphicGame();
		Thread app = new Thread(game);
		app.start();
	}

	@Override
	protected void initScreen() {
		clickScreen = new ClickGraphicsScreen(getWidth(), getHeight());
		setScreen(clickScreen);
	}

}
