package david;

import java.util.Scanner;

import guiTeacher.GUIApplication;

public class CatalogMakerGUI extends GUIApplication {

	static Scanner in = new Scanner(System.in);
	
	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public void initScreen() {
		CatalogScreen screen = new CatalogScreen(getWidth(),getHeight());
		setScreen(screen);
	}

	public void save() {
		
	}
	
	public static void add(){
		int buildDate;
		System.out.println("What is the year the car you want to add was built?");
		String year = in.nextLine();
		while(!validInputNumber(year)) {
			System.out.println("You need to use the format YYYY where Y is a digit");
			year = in.nextLine();
		}
		buildDate = Integer.parseInt(year);
		System.out.println("What is the company name of the car you want to add?");
		String company = in.nextLine();
		System.out.println("You're car was added!");
		Catalog.add(new Car(buildDate, company));
		
	}
	
	public static boolean validInputNumber(String input) {
		if(input.length() == 4) {
			if((input.substring(0,1).compareTo("0") >= 0) && input.substring(1,2).compareTo("0") >= 0 && input.substring(2,3).compareTo("0") >= 0 && input.substring(3,4).compareTo("0") >= 0)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Catalog  C = new Catalog();
		CatalogMakerGUI sample = new CatalogMakerGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

}
