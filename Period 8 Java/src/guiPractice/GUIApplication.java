package guiPractice;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{

	private Screen currentScreen;
	
	public GUIApplication(){
		//terminate program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		int x = 40;
		int y = 40;
		int width = 800;
		int height = 400;
		setBounds(x, y, width, height);
		initScreen();
		setVisible(true);
	}

	protected abstract void initScreen();
	
	public void setScreen(Screen screen){
		currentScreen = screen;
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
