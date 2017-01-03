package guiPractice.Simon;

import java.util.ArrayList;

import guiPractice.components.Button;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.sampleGames.ClickableScreen;

public class SimonScreenJoyce extends ClickableScreen implements Runnable {

	private ProgressInterfaceJoyce progress;
	private ArrayList<MoveInterfaceJoyce> moves;
	private ButtonInterfaceJoyce[] buttons;
	private TextLabel text;
	private boolean userTurn;
	private int roundNumber;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenJoyce(int width, int height) {
		super(width, height);
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		moves = new ArrayList<MoveInterfaceJoyce>();
		text = new TextLabel(130, 230, 300, 40, "Let's play Simon!");
		lastSelectedButton = -1;
		moves.add(randomMove());
		moves.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(text);
	}

	private MoveInterfaceJoyce randomMove() {
		Button b;
		int idx = (int) (Math.random()*buttons.length);
		while (idx == lastSelectedButton){
			idx = (int) (Math.random()*buttons.length);
		}
		b = (Button) buttons[idx];
		return getMove(b);
	}

	private MoveInterfaceJoyce getMove(Button b) {
		return null;
	}

	private void addButtons() {
		
	}

	private ProgressInterfaceJoyce getProgress() {
		return null;
	}

}
