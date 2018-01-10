package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameDavidYashayev extends GUIApplication {

	private static SimonScreenDavidYashayev simonGameScreen;
	
	public static void main(String[] args) {
		SimonGameDavidYashayev screen = new SimonGameDavidYashayev(750,750);
		screen.initScreen();
		Thread go = new Thread(screen);
		go.start();
	}
	
	public SimonGameDavidYashayev(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		SimonGameDavidYashayev.simonGameScreen = new SimonScreenDavidYashayev(getWidth(), getHeight());
		setScreen(simonGameScreen);
	}

}
