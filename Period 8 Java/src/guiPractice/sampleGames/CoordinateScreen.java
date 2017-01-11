package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.AnimatedComponent;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button myButton;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"Sample Text");
		paragraph = new TextArea(40,85,550,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.");
		myButton = new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
			public void act(){
				MouseFollowerGame.game.setScreen(MouseFollowerGame.myScreen);			}
			});
		Graphic picture = new Graphic(50, 50, .5, "resources/sampleImages/happy.jpg");
		viewObjects.add(picture);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(myButton);
//		MovingComponent mc = new MovingComponent(30, 60, 80, 80);
//		MovingComponent mc2 = new MovingComponent(100, 60, 80, 80);
//		mc.setVy(3);
//		mc.play();
//		mc2.setVy(10);
//		mc2.play();
//		viewObjects.add(mc);
//		viewObjects.add(mc2);
//		
		addAnimation(viewObjects);
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		AnimatedComponent a = new AnimatedComponent(40, 50,150, 150);
		try{//sprite2 = 5, 4, 140, 120 || sprite3 = 4, 2, 150, 100
			int numberInRow = 4;
			int rows = 2;
			int w = 150;
			int h = 100;
			ImageIcon icon = new ImageIcon("resources/sampleImages/sprite3.png");
			//create a for loop that will take a "cropped image" from the sprite grid
			for (int i = 0; i < numberInRow * rows; i++){
				//declare the "cropped image"
				BufferedImage cropped = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0;
				int topMargin = 0;
				int x1 = leftMargin + w*(i%numberInRow);
				int y1 = topMargin + h*(i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(), 30, 30, w, h, x1, y1, x1 + w, y1 + h, null);
				a.addFrame(cropped, 100);
			}
		}catch(Exception e){
			e.printStackTrace();
		};
		viewObjects.add(a);
		a.play();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX() + ", " + m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
	public void mouseClicked(MouseEvent e) {
		if(myButton.isHovered(e.getX(), e.getY())){
			myButton.act();
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
}
