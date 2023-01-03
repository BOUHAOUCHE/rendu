import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		// il me manque la question 1, 7 et la moitié de la 8 que je ferais plus tard. je n'ai pas réussi également à regler le problème par rapport au fait que je dois appuyer sur entré afin d'afficher l'ensemble de mes résultats. 
	
		// 2
		Scanner scanner = new Scanner(System.in);

		System.out.println("Taper un mot");

		String mot = scanner.nextLine();

		System.out.println(mot.toUpperCase());
		System.out.println(mot.toLowerCase());

		// 3
		String s = ("abcdefghijklmnopqrstuvwxyz");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i % 2 == 0) {
				sb.append('*');
			} else {
				sb.append(c);

			}
		}

		String result = sb.toString();
		System.out.println(result);

		//4
		System.out.println(2 * 3);
		Livre monLivre = new Livre("Hugo", "Victor", "Littérature", "32564326432");

		monLivre.afficherCodelivre(monLivre);
		
		
		//5
		Triangle triangle = new Triangle(15, 11, 6, 22);

		triangle.calculePerimetre(triangle);
		triangle.calculeAire(triangle);
		triangle.reduirePerimetre(triangle);

		// 6
		Operation monOperation = new Operation();
		monOperation.a = 2;
		monOperation.b = 3;

		System.out.println(monOperation.a);

		int monAdittion = monOperation.addition();
		System.out.println(monAdittion);

		int maSoustraction = monOperation.soustraction();
		System.out.println(maSoustraction);

		System.out.println(monOperation.multiplication());

		// 8
		Voiture maVoiture = new Voiture("clio", "renault");
	}

}
