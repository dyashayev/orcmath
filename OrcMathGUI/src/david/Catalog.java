package david;

import java.util.ArrayList;
import java.util.Scanner;


public class Catalog {
	
	static Scanner in = new Scanner(System.in);
	private static ArrayList<Car> catalog;
	
	public Catalog() {
		catalog = new ArrayList<Car>();
		catalog.add(new Car(2012, "Ford"));
		catalog.add(new Car(2017, "Toyota"));
		catalog.add(new Car(2015, "Honda"));
	}
	
	public static void main(String[] args) {
		Catalog  C = new Catalog();
		addUserInput();
		System.out.println(getContents());
	}
	
	public static String getContents() {
		String data = "";
		for(Car C: catalog) {
			data+= C + "\n";
			
		}
	return data;
	}
	
	public static void addUserInput(){
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
		catalog.add(new Car(buildDate, company));
		
	}
	
	public static boolean validInputNumber(String input) {
		if(input.length() == 4) {
			if((input.substring(0,1).compareTo("0") >= 0) && input.substring(1,2).compareTo("0") >= 0 && input.substring(2,3).compareTo("0") >= 0 && input.substring(3,4).compareTo("0") >= 0)
				return true;
		}
		return false;
	}
}
