/***********************************************************************
 Program Name: TextFileIO.java
 Programmer's Name: Steven Bennett
 Program Description: Program cycles through 100 integers, writes even
 integers to the file, closes file, reopens file, and appends odd intergers
 from 0 to 100.
 Tutorial Referenced: http://www.youtube.com/watch?v=3RNYUKxAgmw&list=PLFE2CE09D83EE3E28
 ***********************************************************************/ 

import java.io.*;
import java.lang.*;
import java.util.*;

import javax.swing.JOptionPane;

public class TextFileIO {
	
	private FileWriter x; //create variable to hold FileWriter object.
	private Scanner fileReader; //create variable to hold scanner object.
	
	//openFile() method creates or opens numbers.dat for writing.
	//Using openFile() will overwrite current data if you attempt to append.
	public void openFile(){
		try{
			x = new FileWriter("numbers.dat");
		}
		catch (IOException e){
			JOptionPane.showMessageDialog(null, "You have an Error!");
			e.printStackTrace();
		}
	}
	
	//appendFile() opens numbers.dat to append new data to existing data.
	public void appendFile(){
		try{
			x = new FileWriter("numbers.dat", true);
		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "You have an Error!");
			e.printStackTrace();
		}
	}
	
	//addEvenToFile() runs for loop of 100 integers checking if the integer
	//is even.  IF even, the integer is written to the file with a comma
	//delimiter.
	public void addEevenToFile(){
		try{
			for(int i = 0; i <= 100; i++){
				if(i % 2 == 0){
					x.write(i + ", ");
				}	
			}
			JOptionPane.showMessageDialog(null, "Even numbers added.", "Confirmation", JOptionPane.PLAIN_MESSAGE);
		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "You have an Error!");
			e.printStackTrace();
		}
	}
	
	//addOddToFile() runs for loop of 100 integers checking if the integer
	//is odd.  IF odd, the integer is written to the file with a comma
	//delimiter.
	public void addOddToFile(){
		try{
			for(int i = 0; i <= 100; i++){
				if(i % 2 != 0){
					x.write(i + ", "); 
				}
			}
			JOptionPane.showMessageDialog(null, "Odd numbers added.", "Confirmation", JOptionPane.PLAIN_MESSAGE);
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "You have an Error!");
			e.printStackTrace();
		}
	}
	
	public void viewFile(){
		String fileContent;
		
		try{
			fileReader = new Scanner(new File("numbers.dat")); //Scanner object reads in data from numbers.dat.
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "You have an Error!");
		}
		
		while(fileReader.hasNext()){
			fileContent = fileReader.next();
			System.out.print(fileContent);
		}
		
		System.out.print("\n"); //go to next line after displaying file content.
	}
	
	public void closeFile(){
		try{
			x.close();
		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "You have an Error!");
		}
	}
}
