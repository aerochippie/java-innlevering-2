package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.println(matrise[i][j]);
			}
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {

				str += matrise[i][j] + " ";

			}
			if (i < matrise.length - 1) {
				str += "\n";
			}
		}
		str += "\n";
		System.out.println(str);
		return str;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}

		for (int i = 0; i < nyMatrise.length; i++) {
			for (int j = 0; j < nyMatrise[i].length; j++) {
				System.out.println(nyMatrise[i][j]);
			}
		}

		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j] || a.length != b.length) {
					return false;
				}
			}

		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
