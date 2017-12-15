package david;

import java.util.ArrayList;

public class Catalog {
	
	private static ArrayList<Cars> catalog;
	
	public Catalog() {
		catalog = new ArrayList<Cars>();
		catalog.add(new Cars(2012, "Ford", 24000));
		catalog.add(new Cars(2017, "Toyota", 23000));
		catalog.add(new Cars(2015, "Honda", 29000));
	}
	
	public static void main(String[] args) {
		Catalog  C = new Catalog();
		getContents();
	}
	
	public static String getContents() {
		String data = "";
		for(Cars C: catalog) {
			data+= C + "\n";
			
		}
	return data;
	}
}
