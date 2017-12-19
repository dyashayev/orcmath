package david;

import java.awt.Color;
import java.awt.Graphics2D;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Cars extends AnimatedComponent {

	private int buildDate;
	private String company;
	
	public Cars(int buildDate, String company) {
		super(100, 100, 130, 130);
		this.buildDate = buildDate;
		this.company = company;
		addSequence("resources/PacmanSpriteSheet.png", 150, 4, 1, 13, 13, 12);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.ORANGE);
		super.update(g);
	}

	public String toString() {
		return buildDate + "," + company;
	}
}
