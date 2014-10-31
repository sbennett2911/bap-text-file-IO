/***********************************************************************
 Program Name: TextFileIO.java
 Programmer's Name: Steven Bennett
 Program Description: Program cycles through 100 integers, writes even
 integers to the file, closes file, reopens file, and appends odd intergers
 from 0 to 100.
 Tutorial Referenced: http://www.youtube.com/watch?v=3RNYUKxAgmw&list=PLFE2CE09D83EE3E28
 ***********************************************************************/ 

public class TextFileIOTest {

	public static void main(String[] args) {
		TextFileIO test = new TextFileIO();
		
		test.openFile();
		test.addEevenToFile();
		test.closeFile();
		test.viewFile();
		test.closeFile();
		test.appendFile();
		test.addOddToFile();
		test.closeFile();
		test.viewFile();
		test.closeFile();
	}

}
