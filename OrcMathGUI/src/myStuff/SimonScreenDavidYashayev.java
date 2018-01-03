package myStuff;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenDavidYashayev extends ClickableScreen implements Runnable {

	private TextLabel text;
	private ButtonInterfaceDavidYashayev[] buttons;
	private ProgressInterfaceDavidYashayev progress;
	private ArrayList<MoveInterfaceDavidYashayev> moves;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenDavidYashayev(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		for(ButtonInterfaceDavidYashayev b: buttons){ 
		    viewObjects.add((Visible) b); 
		}
		progress = getProgress();
		text = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterfaceDavidYashayev>();
		
		//add 2 moves to start
		lastSelectedButton = -1;
		moves.add((MoveInterfaceDavidYashayev) randomMove());
		moves.add((MoveInterfaceDavidYashayev) randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(text);
	}

	public void addButtons() {
		int numberOfButtons = 4;
		ButtonInterfaceDavidYashayev[] buttons = new ButtonInterfaceDavidYashayev[numberOfButtons];
	}

	public ProgressInterfaceDavidYashayev getProgress() {
		return null;
	}

	public Object randomMove() {
		int bIndex = (int)(Math.random()*buttons.length);
	    while(bIndex == lastSelectedButton){
	        bIndex = (int)(Math.random()*buttons.length);
	    }
	    return getMove(bIndex);
	}

	private Object getMove(int bIndex) {
		return null;
	}

	@Override
	public void run() {
		
	}

}
