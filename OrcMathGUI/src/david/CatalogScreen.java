package david;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {

	private TextField yearField;
	private Car catalog;
	private TextArea text;
	private Button addButton;
	private FileOpenButton open;
	private Button save;
	private Button delete;
	private Button load;
	private TextField descriptionField;
	private TextField bookField;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new Car(1134, "Honda");
		descriptionField = new TextField(80, 400, 200, 30, "Enter Text Here", "How are you?");
		text = new TextArea(50,100, 300, 50, "Don't press it!");
		viewObjects.add(text);
		viewObjects.add(descriptionField);
		open = new FileOpenButton(100,500,100,50,null,this);
		addButton = new Button(50,70,100,50,"This is a button",new Action() {
			
			@Override
			public void act() {
				addClick();
			}
		});
		save = new Button(500,70,100,50,"Save",new Action() {
			
			@Override
			public void act() {
			}
		});
		delete = new Button(50,500,100,50,"Delete",new Action() {
			
			@Override
			public void act() {
			}
		});
		load = new Button(50,200,100,50,"Load",new Action() {
			
			@Override
			public void act() {
			}
		});
		viewObjects.add(addButton);
		viewObjects.add(open);
		viewObjects.add(save);
		viewObjects.add(delete);
		viewObjects.add(load);
	}
	
	public void addClick() {
		Car c = new Car(TextArea.setText(c.toString()), name) ;
	}

	@Override
	public void setFile(File f) {
		
	}

	@Override
	public JFrame getWindow() {
		return null;
	}

}
