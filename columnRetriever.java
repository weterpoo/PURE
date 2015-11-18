import java.util.*;
import java.io.*;

public class columnRetriever {
	public static void main(String[] args) {
		File file = new File("dataCollect.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.print("file empty");
		}
		String line = "";
		int count = 0;
		while(sc.hasNextLine()) {
			count = 0;
			line = sc.nextLine();
			for(int i = 0; i < line.length(); i++) {
				if((int)line.charAt(i) == 9) {
					count++;
				}
				if(count > 4) {
					break;
				}
				if(count == 2 && line.charAt(i) == 9) {
					i++;
				}
				if(count != 0 && count != 1) {
					System.out.print(line.charAt(i));
				}
			}
			System.out.println();
		}
	}

}