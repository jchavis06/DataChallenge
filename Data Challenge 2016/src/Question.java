import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Question {

	static ArrayList<String> asked = new ArrayList<String>();
	
	public static String getQuestion(int type) {
		String question = null;
		try {
		File file = null;
		FileReader fileReader;
		BufferedReader reader;
		
		switch (type) {
			case 1: 
				file = new File("type1.txt");
			break;
			case 2: 
				file = new File("type2.txt");
			break;
			case 3: 
				file = new File("type3.txt");
			break;
			default: 
				return null;
		}
		
		fileReader = new FileReader(file);
		reader = new BufferedReader(fileReader);
		
		ArrayList<String> questions = loadQuestions(reader);
		Random num = new Random();
		
		int index = num.nextInt(questions.size());
		
		question = questions.get(index);
		asked.add(question);
		
		reader.close();
		
		} catch (Exception e) {
			System.out.println("Error in getQuestion(): " + e.getMessage());
		}
		
		return question;
	}
	
	private static ArrayList<String> loadQuestions(BufferedReader reader) {
		
		ArrayList<String> questions = new ArrayList<String>();
		String str;
		try {
			while ((str = reader.readLine()) != null) {
				if (!asked.contains(str)) { // if not already asked 
					questions.add(str);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception while loading questions: " + e.getMessage());
		}
		
		return questions;
	}
}
