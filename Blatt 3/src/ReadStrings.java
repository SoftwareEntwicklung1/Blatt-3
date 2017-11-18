import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadStrings {
	static String[] readStrings() {
		String[] s = new String[1];
		int i = 0;
		if(StdIn.isEmpty()) {
			s[0]="";
			return s;
		}
		while (!StdIn.isEmpty()) {
			if (i == s.length) {
				s = arrayrplus1(s);
			}
			s[i] = StdIn.readString();
			i = i + 1;

		}
		return s;
	}

	// vergrößert die Länge des Arrays um 1
	public static String[] arrayrplus1(String[] array) {
		String[] newarray = new String[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			newarray[i] = array[i];
		}
		return newarray;
	}

	public static void main(String[] args) {
		String[] b = ReadStrings.readStrings();
		System.out.println(Arrays.toString(b));
	}
}

