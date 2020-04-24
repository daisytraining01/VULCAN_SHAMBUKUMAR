package com.picnic.shambhukumarpashupati;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Question3 {
	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream(
				new File("C:\\Users\\SHAMBHU\\eclipse-workspace\\APITesting\\JavaTest\\File\\Test.txt"));
		File f = new File("C:\\Users\\SHAMBHU\\eclipse-workspace\\APITesting\\JavaTest\\File\\Test.txt");
		List<String> readLines = FileUtils.readLines(f);
		for (int i = 0; i < readLines.size(); i += 2) {
			String string = readLines.get(i);
			System.out.println(string);
		}

	}
}

/*Output : 
	There is a ticket counter where people come, take tickets and go.
	The person to enter the queue first, will get the ticket first and leave the queue.
	In this way, the person entering the queue last will the tickets last
	first and the Last person to enter the queue gets the ticket last.
*/
