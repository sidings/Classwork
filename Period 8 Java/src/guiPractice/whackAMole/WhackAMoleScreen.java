package guiPractice.whackAMole;

import java.util.ArrayList;

import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{

	 private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> visibles) {
		moles = new ArrayList<MoleInterface>();
		//player = getAPlayer();
		label = new TextLabel(getWidth()/2 - 60, getHeight()/2 - 30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2 - 60, 50, 120, 60, "");
		visibles.add(label);
		//visibles.add(player);
		visibles.add(timeLabel);
	}
	
	public void update(){
		super.update();
	}
	
	public void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		changeText("Set...");
		changeText("Go!");
		changeText("");
	}
	
	/**
	*to implement later, after Character Team implements PlayerInterface
	*This is used as a placeholder because early in the game design process, we use the method later, once we 
	*learn how to create a Player
	*/
	private PlayerInterface getAPlayer() {
	 return null;
	}

	/**
	*to implement later, after EnemyTeam implements MoleInterface
	*/
	private MoleInterface getAMole() {
	return null;
	}


}
