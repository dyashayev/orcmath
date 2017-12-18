package david;

import java.util.ArrayList;
import java.util.Scanner;


public class Catalog {
	
	static Scanner in = new Scanner(System.in);
	private static ArrayList<Cars> catalog;
	
	public Catalog() {
		catalog = new ArrayList<Cars>();
		catalog.add(new Cars(2012, "Ford"));
		catalog.add(new Cars(2017, "Toyota"));
		catalog.add(new Cars(2015, "Honda"));
	}
	
	public static void main(String[] args) {
		Catalog  C = new Catalog();
		addUserInput();
		System.out.println(getContents());
	}
	
	public static String getContents() {
		String data = "";
		for(Cars C: catalog) {
			data+= C + "\n";
			
		}
	return data;
	}
	
	public static void addUserInput(){
		int buildDate;
		System.out.println("What is the year the car you want to add was built?");
		String year = in.nextLine();
		while(!validInput(year)) {
			System.out.println("You need to use the format YYYY where Y is a digit");
			year = in.nextLine();
		}
		buildDate = Integer.parseInt(year);
		System.out.println("What is the company name of the car you want to add?");
		String company = in.nextLine();
		System.out.println("You're car was added!");
		catalog.add(new Cars(buildDate, company));
		
	}
	
	public static boolean validInput(String input) {
		if(input.length() == 4) {
			if((input.substring(0,1).compareTo("0") >= 0) && input.substring(1,2).compareTo("0") >= 0 && input.substring(2,3).compareTo("0") >= 0 && input.substring(3,4).compareTo("0") >= 0)
				return true;
		}
		return false;
	}
}
