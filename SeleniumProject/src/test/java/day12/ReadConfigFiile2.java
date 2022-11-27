package day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigFiile2 {

	@Test
	public void reaadConfig() {

		try {

			Properties pro = new Properties();

			pro.load(new FileInputStream(new File("./Config/env.properties")));

			System.out.println(pro.get("username"));

		} catch (FileNotFoundException e) {
			System.out.println("File could not locate" + e.getMessage());
		}

		catch (IOException e) {
			System.out.println("File could not locate" + e.getMessage());
		}

	}

}
