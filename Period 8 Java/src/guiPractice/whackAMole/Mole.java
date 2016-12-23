package guiPractice.whackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private double appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, .5, "resources/sampleImages/mole.jpg");
	}

	public Mole(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public Mole(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAppearanceTime() {
		return (int) appearanceTime;
	}

	@Override
	public void setAppearanceTime(int i) {
		this.appearanceTime = i;
	}

}
