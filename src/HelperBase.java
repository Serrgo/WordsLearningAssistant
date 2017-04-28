import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;



public class HelperBase {
	
	static ArrayList<String> words = new ArrayList<String>();
	
	public static void reader(){
		try (BufferedReader reader = new BufferedReader(
	            new InputStreamReader(
	                    new FileInputStream("C:\\LearningAssistant\\words.txt")))){
	        String line;
	        while ((line = reader.readLine()) != null) {
	            words.add(line);
	        }
	    } catch (IOException e) {
	        // log error
	    }
	}
	
	public static void main(String[] args) {
	}
	
	//public static HelperBase Returner = new HelperBase();
	private static String firstWord;
	private static String secondWord;
	private static Integer counter;
	static int count = -1; 
	public static class Returner {
		public static void retNextWord(boolean radioCheck){
			if (radioCheck) {
				Random randomGenerator = new Random();
				int randomInt = randomGenerator.nextInt(HelperBase.words.size());
				String primaryString[] = (words.get(randomInt)).split("-");
				firstWord = primaryString[0];
				secondWord = primaryString[1];
				counter = words.indexOf(firstWord+"-"+secondWord)+1;
				secondWord = secondWord.substring(1);
			} else {
				int serialInt = HelperBase.words.size()-1;
				if (count != serialInt){
					count++;
					String primaryString[] = (words.get(count)).split("-");
					firstWord = primaryString[0];
					secondWord = primaryString[1];
					secondWord = secondWord.substring(1);
					counter = count+1;
				} else {
					count = -1;
					count++;
					String str[] = (words.get(count)).split("-");
					firstWord = str[0];
					secondWord = str[1];
					secondWord = secondWord.substring(1);
					counter = count+1;
				}
			}
		}
		
		public static void retPreWord(boolean radioCheck){
			if (radioCheck==false) {
				int serialInt = HelperBase.words.size()-1;
				if (count >0) {
					count--;
					String primaryString[] = (words.get(count)).split("-");
					firstWord = primaryString[0];
					secondWord = primaryString[1];
					secondWord = secondWord.substring(1);
					counter = count+1;
				} else {
					count = serialInt;
					String primaryString[] = (words.get(count)).split("-");
					firstWord = primaryString[0];
					secondWord = primaryString[1];
					secondWord = secondWord.substring(1);
					counter = count+1;
				}
			}
		}
		
		public static String wordOne(){
			return firstWord;
		}
		
		public static String wordTwo(){
			return secondWord;
		}
		
		public static String wordCounter(){
			return Integer.toString(counter);
		}
	}
}


