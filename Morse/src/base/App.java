package base;

import java.io.*;
import java.util.*;

public class App {

	String word = "";
	private ReadModule _readmodule;

	public App() {
		System.out.println("Morse Code App");
		System.out.print("Please Enter String: ");

		InputStreamReader ISR = new InputStreamReader(System.in); // input
		// stream
		// reader
		BufferedReader BR = new BufferedReader(ISR);

		try {
			word = BR.readLine();
		} catch (IOException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		System.out.println("you have entered the string --> " + word);
		_readmodule = new ReadModule(word);
	}

	public static void main(String[] args) {
		new App();
	}
}
