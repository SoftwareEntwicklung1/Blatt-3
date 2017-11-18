import java.util.Arrays;

public class ArraysAndProcedures {

	public static void main(String[] args) {
		// Testen von Aufgabenteil a)
		int[] ar = { 1, 2, 3, 4, 5 };
		replaceAll(2, 7, ar);
		System.out.println(Arrays.toString(ar));
		// Testen
		System.out.println("nextAufgabe");
		int[] ar2 = substAll(2, 7, ar);
		System.out.println(Arrays.toString(ar2));
		int[] a1 = { 1, 3, 2, 4, 7, 2 };
		int[] ar3 = onlyEven(a1);
		System.out.println(Arrays.toString(ar3));
		// Testen e
		System.out.println("nextAufgabe e");
		int[][] b1 = { { 1, 2, 0 }, { 0, 7 }, { 7, 0, 7 } };
		int[][] b2 = { { 1, 2, 0 }, { 4, 5, 6 } };
		System.out.println(allHaveZero(b1));
		System.out.println(allHaveZero(b2));
	}

	public static void replaceAll(int x, int y, int[] ar) {
		// TODO Aufgabe a)
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == x) {
				ar[i] = y;
			}
		}
	}

	public static void replaceFirst(int x, int y, int[] ar) {
		// TODO Aufgabe b)
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == x) {
				ar[i] = y;
				break;
			}
		}
	}

	public static void replaceLast(int x, int y, int[] ar) {
		// TODO Aufgabe b)
		// fängt vom Ende an.
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] == x) {
				ar[i] = y;
				break;
			}
		}

	}

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

	public static boolean allHaveZero(int[][] arrays) {
		// TODO Aufgabe e)
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				if (arrays[i][j] == 0) {
					break;
				}
				if (j == arrays[i].length - 1) {
					return false;
				}
			}

		}
		return true;
	}
}