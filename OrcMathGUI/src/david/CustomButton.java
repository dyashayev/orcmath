package david;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button{

	private String s1 = "yes";
	private String s2 = "no";
	private Color colour;

	public CustomButton(int x, int y) {
		super(x, y, 100, 50, "", null);
	}
	
	public static void main(String[] arg) {
		
	}
	public void drawButton(Graphics2D g, boolean hover){
		g.setColor(Color.BLACK);
		g.drawString(s1,100,100);
		g.drawString(s2,20,20);
		g.fillRect(0, 0, 50, 100);
	}

	void updateString1(String string) {
		s1 = string;
	}

	void updateString2(String string) {
		s2 = string;
	}

	void setIconColor(Color color) {
		colour = color;
	}
}
