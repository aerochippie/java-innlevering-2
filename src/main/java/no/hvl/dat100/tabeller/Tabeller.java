package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		int[] tabell1 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			System.out.println(tabell1[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String str = "[";
		for (int i = 0; i < tabell.length; i++) {
			str += tabell[i];
			if (i < tabell.length - 1) {
				str += ",";
			}
		}

		str += "]";
		System.out.println(str);
		return str;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}
		return finnes;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int x = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				x = i;
			}
		}
		return x;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] newTable = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			newTable[i] = tabell[tabell.length - 1 - i];
		}
		System.out.print(newTable);
		return newTable;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] <= tabell[i - 1])
				return false;

		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sattSammen = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			sattSammen[i] = tabell1[i];

		}
		for (int j = 0; j < tabell2.length; j++) {
			sattSammen[tabell1.length + j] = tabell2[j];
		}

		return sattSammen;

	}
}
