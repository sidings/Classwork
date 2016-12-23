package guiPractice.whackAMole;

import java.util.ArrayList;

import guiPractice.components.Action;
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
		timeLabel.setText("" + timeLeft);
		while(timeLeft > 0){
			//frame updates every 10 ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText("" + (int)((timeLeft*10)/10.0));
			disappearMoles();
			addnewMoles();
		}
	}
	
	private void addnewMoles() {
		//probability of mole sppearing depends on time left
		double probability = .2*(30.0-timeLeft)/30;
		if(Math.random()  <probability){
			MoleInterface mole = getAMole();
			//between.5amd 2.5 sec
			mole.setAppearanceTime((int)(500 + Math.random() * 2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
				//removeMole from visibles
					remove(mole);
					moles.remove(mole);
				}
			});
			//add mole to visibles
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles(){
		//each mole has a "clock"
			//when the clock counts down to 0, it disappears
			for(int i = 0; i < moles.size(); i++){
				MoleInterface m = moles.get(i);
				m.setAppearanceTime(m.getAppearanceTime() - 100);
				if (m.getAppearanceTime() <= 0){
					//remove from visibles
					remove(m);
					//remove it from our moles databaseS
					moles.remove(i);
					i --; //compensate for i++
				}	
			}
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
