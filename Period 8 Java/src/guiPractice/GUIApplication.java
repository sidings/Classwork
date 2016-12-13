package guiPractice;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame implements Runnable{

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
		//stop controls from last screen
		if(currentScreen != null){
			if (currentScreen.getMouseListener() != null){
				removeMouseListener(currentScreen.getMouseListener());
			}
		}
		if(currentScreen != null){
			if (currentScreen.getMouseMotionListener() != null){
				removeMouseMotionListener(currentScreen.getMouseMotionListener());
			}
		}
		currentScreen = screen;
		//add controls for new screen
		if (currentScreen != null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void run(){
		while(true){
			currentScreen.update();
			//updates window
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
