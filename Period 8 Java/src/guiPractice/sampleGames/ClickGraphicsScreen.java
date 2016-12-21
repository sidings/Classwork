package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class ClickGraphicsScreen extends Screen implements MouseListener{

	private ClickableGraphic corgi;
	
	public ClickGraphicsScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		corgi = new ClickableGraphic(50, 50, .5, "resources/sampleImages/corgi1.jpeg");
		corgi.setAction(new Action(){
				public void act() {
					corgi.setX(corgi.getX() + 50);
					corgi.setY(corgi.getY() + 50);
				}
				
			});
		viewObjects.add(corgi);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (corgi.isHovered(e.getX(), e.getY())){
			corgi.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
}
