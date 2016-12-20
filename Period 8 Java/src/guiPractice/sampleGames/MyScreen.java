package guiPractice.sampleGames;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class MyScreen extends Screen{

	private Graphic corgi;
	private Button back;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		corgi = new Graphic(50, 50, .5, "resources/sampleImages/corgi1.jpeg");
		back = new Button(50, 50, 100, 60, "Back", Color.DARK_GRAY, new Action(){
			public void act(){
				MouseFollowerGame.game.setScreen(MouseFollowerGame.coordScreen);
			}
		});
		viewObjects.add(corgi);
		viewObjects.add(back);
	}

}
