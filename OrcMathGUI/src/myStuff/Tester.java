package myStuff;

import guiTeacher.GUIApplication;

public class Tester extends GUIApplication{


	public Tester(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		Tester thread = new Tester(1000, 1000);
		Thread go = new Thread(thread);
		go.start();
	}

	@Override
	public void initScreen() {
		Screen test = new Screen(getWidth(), getHeight());
		setScreen(test);
	}

}
