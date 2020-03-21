package EJERCICIODEOBJETOS;

public class Animales_domesticos {
	public static void main(String[] args) {
		Perro p1 = new Perro("Firulais", 5, 0.80);
		Perro p2 = new Perro("Firulis", 7, 0.90);
		Perro p3 = new Perro("Fifi", 6, 0.60);
		Perro p4 = new Perro("Fiflo", 4, 0.52);
		Perro p5 = new Perro("Fifito", 5, 0.68);

		Perro[] guau = { p1, p2, p3, p4, p5 };

		Gatos g1 = new Gatos("Misu", 3, 0.33);
		Gatos g2 = new Gatos("Misin", 3.9, 0.36);
		Gatos g3 = new Gatos("Misan", 3.8, 0.33);
		Gatos g4 = new Gatos("Misun", 3.5, 0.37);
		Gatos g5 = new Gatos("Misen", 3.2, 0.39);

		Gatos[] miau = { g1, g2, g3, g4, g5 };

		Ratones r1 = new Ratones("Stuart", 0.3, 0.10);
		Ratones r2 = new Ratones("Stuartar", 0.23, 0.05);
		Ratones r3 = new Ratones("Stuarter", 0.43, 0.07);
		Ratones r4 = new Ratones("Stuartir", 0.63, 0.02);
		Ratones r5 = new Ratones("Stuartor", 0.53, 0.05);

		Ratones[] tch = { r1, r2, r3, r4, r5 };

		for (int i = 0; i < tch.length; i++) {
			System.out.println(tch[i]);
		}
		System.out.println("\n");
		for (int i = 0; i < miau.length; i++) {
			System.out.println(miau[i]);

		}
		System.out.println("\n");

		for (int i = 0; i < guau.length; i++) {
			System.out.println(guau[i]);

		}
	}
	public static  Animales nombres () {s

}
