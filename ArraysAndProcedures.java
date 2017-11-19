import java.util.Arrays;

public class ArraysAndProcedures {

	public static void main(String[] args) {
		// Testen von Aufgabenteil a)
		System.out.println("Aufgabe a");
		int[] ar = { 1, 2, 2, 2, 3, 2, 5 };
		replaceAll(2, 7, ar);
		System.out.println(Arrays.toString(ar));
		
		// Testen von Aufgabenteil c)
		System.out.println("Aufgabe c");
		// ar={ 1, 7,7,7, 3, 7, 5 }; after replace all
		int[] ar2 = substAll(7, 2, ar);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar2));
		
		// Testen von Aufgabenteil d
		System.out.println("Aufgabe d");
		int[] a1 = { 1, 3, 2, 4, 7, 2 };
		int[] a2 = onlyEven(a1);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		// Testen von Aufgabenteil e
		System.out.println("Aufgabe e");
		int[][] b1 = { { 1, 2, 0 }, { 0, 7 }, { 7, 0, 7 } };
		int[][] b2 = { { 1, 2, 0 }, { 4, 5, 6 }, { 1, 2, 0 } };
		System.out.println(Arrays.deepToString(b1));
		System.out.println(allHaveZero(b1));
		System.out.println(Arrays.deepToString(b2));
		System.out.println(allHaveZero(b2));
	}

	// Ersetzt jedes vorhandene Element x im Array in y.
	public static void replaceAll(int x, int y, int[] ar) {
		// TODO Aufgabe a)
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == x) {
				ar[i] = y;
			}
		}
	}

	// Ersetzt das erste vorhandene Element x im Array in y.
	public static void replaceFirst(int x, int y, int[] ar) {
		// TODO Aufgabe b)
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == x) {
				ar[i] = y;
				break;
			}
		}
	}

	// Ersetzt das letzte vorhandene Element x im Array in y.
	public static void replaceLast(int x, int y, int[] ar) {
		// TODO Aufgabe b)
		// Replaces only last Element (fangt vom Ende an)
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] == x) {
				ar[i] = y;
				break;
			}
		}

	}

	// Erstellet eine Kopie des Arrays und ersetzt alle x durch y in
	// der Kopie,Return Kopie
	public static int[] substAll(int x, int y, int[] ar) {
		// TODO Aufgabe c)
		int[] b = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			b[i] = ar[i];
			if (ar[i] == x) {
				b[i] = y;
			}
		}
		return b;
	}

	// Gibt ein Array zuruck, das nur gerade Elemente von ar enthalt.
	public static int[] onlyEven(int[] ar) {
		// TODO Aufgabe d)
		int j = 0;
		int q = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				j++;
			}
		}
		int[] b = new int[j];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				b[q] = ar[i];
				q++;
			}
		}
		return b;
	}

	// pruft, ob alle Arrays in 2d Array die Zahl 0 enthalten
	public static boolean allHaveZero(int[][] arrays) {
		// TODO Aufgabe e)
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				if (arrays[i][j] == 0) {
					break;
				}
				// wenn das Ende des inneren Arrays erreicht ist und keine 0
				// gefunden wurde
				else if (j == arrays[i].length - 1) {
					return false;
				}
			}
		}
		return true;
	}
}