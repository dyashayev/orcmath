package david;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class textPaired {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] arg) {
		List<String> content = testFileLoading();

		 displayContent(content);
		System.out.println("What is the file name");
		String s = in.nextLine();
		System.out.println("Hi, what is your name?");
		String n = in.nextLine();
		testSaveContent(s,n);
	}

	public static void testSaveContent(String fileName, String name) {

		 try{    

		 FileWriter fw=new FileWriter(fileName);    

		 fw.write(name);    

		 fw.close();    

		 System.out.println("Success! File \""+fileName+"\" saved!");

		 }catch(IOException e){

		 System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");

		 }

		     

		 }



		 private static void displayContent(List<String> content) {

		 //print the content:

		 for(String item : content){

		 System.out.println(item);

		 }

		 }



		 private static List<String> testFileLoading() {

		 Scanner in = new Scanner(System.in);

		 String fileName = "";

		 List<String> content = new ArrayList<String>();

		 //use this boolean to control the while loop. The user should have multiple chances to enter a correct filename

		 boolean opened = false;

		 while(!opened){

		 try {

		 System.out.println("Enter a file to open");

		 fileName = in.nextLine();

		 FileReader fileReader = new FileReader(new File(fileName));

		 String line = "";

		 //a BufferedReader enables us to read the file one line at a time

		 BufferedReader br = new BufferedReader(fileReader);

		 while ((line = br.readLine()) != null) {



		 content.add(line);



		 /*

		  * useful later:

		  * split only a comma that has an even number of quotes ahead of it

		 String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);

		  */





		 }

		 br.close();

		 opened = true;

		 }catch (IOException e) {

		 System.out.println("The file name you specified does not exist.");

		 }

		 }

		 



		 //close the Scanner

		 in.close();

		 return content;

		 }
}

