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
	                    new FileInputStream("C:\\Helper\\words.txt")))){
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
	private static String str1;
	private static String str2;
	public static class Returner {
		public static void retWord(){ 
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(HelperBase.words.size());
			String str[] = (words.get(randomInt)).split("-");
			str1 = str[0];
			str2 = str[1];
		}
		
		public static String wordOne(){
			return str1;
		}
		
		public static String wordTwo(){
			return str2;
		}
	}
}

