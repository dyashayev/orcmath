package myStuff;

import java.awt.Color;

import guiTeacher.components.*;
import guiTeacher.interfaces.*;

public interface ButtonInterfaceDavidYashayev extends Clickable {

	void setColor(Color color);
	void setAction(Action a);
	void highlight();
	void dim();
}
