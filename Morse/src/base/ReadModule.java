package base;

public class ReadModule {

	public ReadModule(String input) {
		// System.out.println(input);
		String[] stringarray = new String[input.length()];

		for (int i = 0; i <= input.length() && i != input.length(); i++) {
			stringarray[i] = input.substring(i, i + 1);
			// System.out.println(stringarray[i]);
			stringarray[i] = ToMorse(stringarray[i].charAt(0));
			System.out.print(stringarray[i]); // prints out morse iteratively

			for (int k = 0; k <= stringarray[i].length() - 1; k++) {

				if (stringarray[i].charAt(k) == '.') {
					new Sound("short.wav").start();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				} else if (stringarray[i].charAt(k) == '-') {
					new Sound("longer.wav").start();
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					// System.out.println("Null");
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			}
		}

		System.out.println("\n");
		System.out.println("\n");
		new App();
	}

	private String ToMorse(char c) {
		switch (c) {
		case 'a':
		case 'A':
			return ".-";
		case 'b':
		case 'B':
			return "-...";
		case 'c':
		case 'C':
			return "-.-.";
		case 'd':
		case 'D':
			return "--..";
		case 'e':
		case 'E':
			return ".";
		case 'f':
		case 'F':
			return "..-.";
		case 'g':
		case 'G':
			return "--.";
		case 'h':
		case 'H':
			return "....";
		case 'i':
		case 'I':
			return "..";
		case 'j':
		case 'J':
			return ".---";
		case 'k':
		case 'K':
			return "-.-";
		case 'l':
		case 'L':
			return ".-..";
		case 'm':
		case 'M':
			return "--";
		case 'n':
		case 'N':
			return "-.";
		case 'o':
		case 'O':
			return "---";
		case 'p':
		case 'P':
			return ".--.";
		case 'q':
		case 'Q':
			return "--.-";
		case 'r':
		case 'R':
			return ".-.";
		case 's':
		case 'S':
			return "...";
		case 't':
		case 'T':
			return "-";
		case 'u':
		case 'U':
			return "..-";
		case 'v':
		case 'V':
			return "...-";
		case 'w':
		case 'W':
			return ".--";
		case 'x':
		case 'X':
			return "-..-";
		case 'y':
		case 'Y':
			return "-.--";
		case 'z':
		case 'Z':
			return "--..";
		case '0':
			return "-----";
		case '1':
			return ".----";
		case '2':
			return "..---";
		case '3':
			return "...--";
		case '4':
			return "....-";
		case '5':
			return ".....";
		case '6':
			return "-....";
		case '7':
			return "--...";
		case '8':
			return "---..";
		case '9':
			return "----.";
		case '.':
			return ".-.-.-";
		case '?':
			return "..--..";
		case ',':
			return "--..--";
		case ' ':
			return "    ";
		default:
			return null;
		}
	}

	public static void main(String[] args) {

	}
}
