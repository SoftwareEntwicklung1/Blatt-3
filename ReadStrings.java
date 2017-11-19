import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadStrings {
	static String[] readStrings() {
		String[] s = new String[1];
		// falls nichts eingegeben wird sollte das erste Element leer sein
		// anstatt null
		s[0] = "";
		// keep Readingstring till empty
		for (int i = 0; !StdIn.isEmpty(); i++) {
			// wenn i ==s.length, das bedeutet out of bound durch 1
			// ,deshalb L�nge um 1 erh�hen
			if (i == s.length) {
				s = arrayrplus1(s);
			}
			s[i] = StdIn.readString();
		}
		return s;
	}

	// vergr��ert die L�nge des Arrays um 1
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
