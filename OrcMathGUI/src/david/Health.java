package david;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Health extends Component {

	public Health() {
		super(40, 40, 200, 50);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.ORANGE);
		g.drawRect(0, 0, getWidth(), getHeight());
	}

}
