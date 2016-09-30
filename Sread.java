import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Sread {

	public static void main(String[] args) {
		//variables (cwc)
		int wordlength;
		int maxvalue = 0;
		int totalchars = 0;
		int count = 0;

		BufferedReader br = null;

		try {
			String sCurrentLine;
			//br = new BufferedReader(new FileReader("C:\\testing.txt"));
			br = new BufferedReader(new FileReader("words.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				wordlength = sCurrentLine.length();
				System.out.println(sCurrentLine);
				/*
				write code here to collect statistics
				*/
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
