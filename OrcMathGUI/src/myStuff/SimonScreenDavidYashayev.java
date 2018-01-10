package myStuff;

import java.awt.Color;
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
	private Button greenButton;
	private Button yellowButton;
	private Button redButton;
	private Button blueButton;
	private Button startButton;
	
	public SimonScreenDavidYashayev(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		greenButton = new Button(30,100,30,30,"green", new Action() {
			public void act() {
				
			}
		});
		getViewObjects().add(greenButton);
		blueButton = new Button(30,30,30,30,"blue", new Action() {
			public void act() {
				
			}
		});
		getViewObjects().add(blueButton);
		yellowButton = new Button(100,30,30,30,"yellow", new Action() {
			public void act() {
				
			}
		});
		getViewObjects().add(yellowButton);
		redButton = new Button(100,100,30,30,"red", new Action() {
			public void act() {
				
			}
		});
		getViewObjects().add(redButton);
		startButton = new Button(200,100,30,30,"start", new Action() {
			public void act() {
				
			}
		});
		getViewObjects().add(startButton);
	}

	
/*	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		viewObjects.add(greenButton);
		viewObjects.add(redButton);
		viewObjects.add(blueButton);
		viewObjects.add(yellowButton);
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
		Color[] Colors = {Color.blue,Color.green,Color.red,Color.yellow};
		ButtonInterfaceDavidYashayev[] buttons = new ButtonInterfaceDavidYashayev[numberOfButtons];
		
		for(int i = 0; i < 4;i++) {
			final Button b = getAButton();
		    b.setX(20*(int) Math.cos(i));
		    b.setY(10*(int) Math.sin(i));
		    b.setAction(new Action(){

		    	public void act(){
		    		if(acceptingInput) {
		    			Thread blink = new Thread(new Runnable(){

		    				public void run(){
		    					b.highlight();
		    					try {
		    						Thread.sleep(800);
		    						} catch (InterruptedException e) {
		    						e.printStackTrace();
		    						}
		    						b.dim();
		    				}});
		    			blink.start();
		    			if(b == moves.get(sequenceIndex).getButton()) {
		    				sequenceIndex++;
		    			}else {
		    				ProgressInterfaceDavidYashayev.gameOver();
		    			}
		    			if(sequenceIndex == moves.size()){ 
		    			    Thread nextRound = new Thread(SimonScreenDavidYashayev.this); 
		    			    nextRound.start(); 
		    			}
		    		}
		    	}

		    	});
			buttons[i] = b;
		}

	//public Button getAButton() {
	//	return greenButton;
	//}

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
		 text.setText("");
		 nextRound();
	}

	private void nextRound() {
		acceptingInput = false;
		roundNumber++;
		moves.add((MoveInterfaceDavidYashayev) randomMove());
		
		progress.setRound(roundNumber);
		progress.setSequenceSize(moves.size());
		    
		changeText("Simon's Turn.");
		playSequence();
		changeText("Your Turn.");
	}

	private void playSequence() {
		ButtonInterfaceDavidYashayev b = null;
		
		for(int i = 0; i < moves.size(); i++) {
			if(b != null) {
				b.dim();
			}
			b = moves.get(i).getButton();
			b.highlight();
			int sleepTime = 10000/roundNumber;
			try {
				Thread.sleep(sleepTime);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		b.dim();
	}

	private void changeText(String string) {
		text.setText(string);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		text.setText("");
	}
*/
}
