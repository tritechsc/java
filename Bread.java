import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Bread {

	public static void main(String[] args) {
		//variables
		int wordlength;
		int max = 0;
		int totalchars;
		int count = 0;

		BufferedReader br = null;

		try {
			String sCurrentLine;
			//br = new BufferedReader(new FileReader("C:\\testing.txt"));
			br = new BufferedReader(new FileReader("words.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				wordlength = sCurrentLine.length();
				if (wordlength > max )max = wordlength;
				
				System.out.print(wordlength+" ");
				System.out.println(sCurrentLine);
				count++;
					System.out.println("count"+count+" max "+max);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
