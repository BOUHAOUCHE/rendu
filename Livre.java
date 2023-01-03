
public class Livre {
	String nom;
	String prenom;
	String categorie;
	String isbn;

	public Livre(String nom, String prenom, String categorie, String isbn) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.categorie = categorie;
		this.isbn = isbn;
	}

	public void afficherCodelivre(Livre livre) {

		Livre livreCodeRef = new Livre(nom.substring(0, 2), prenom.substring(0, 2), categorie.substring(0, 1),
				isbn.substring(isbn.length() - 2, isbn.length()));

		System.out.println(livreCodeRef);

	}

	@Override
	public String toString() {
		return "Code Nom De L'auteur = " + nom + "\n" + "Code Prénom De Lauteur = " + prenom + "\n"
				+ "Code categorie = " + categorie + "\n" + "Code ISBN = " + isbn;
	}

}
