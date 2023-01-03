
public class Triangle {
		int cote1;
		int cote2;
		int cote3Base;
		int hauteur;
		
		
		public Triangle(int cote1, int cote2, int cote3Base, int hauteur) {
			this.cote1 = cote1;
			this.cote2 = cote2;
			this.cote3Base = cote3Base;
			this.hauteur = hauteur;
		}

		@Override
		public String toString() {
			return "Triangle [cote1=" + cote1 + ", cote2=" + cote2 + ", cote3=" + cote3Base + ", hauteur=" + hauteur + "]";
		}
		
		public void calculePerimetre(Triangle triangle) {
			
			int calculeFinalPerimetre = cote1+cote2+cote3Base;
			
			System.out.println("Le périmètre du Triangle est de : "+calculeFinalPerimetre+"cm");
		}
		
	public void calculeAire(Triangle triangle) {
			
			int calculeFinalAire = cote3Base * hauteur /2;
			
			System.out.println("L'aire du Triangle est de : "+calculeFinalAire+"cm");
		}

	public void reduirePerimetre(Triangle triangle) {

		Triangle nouveauTriangle= new Triangle(cote1/2,cote2/2,cote3Base/2,hauteur);
		
		nouveauTriangle.calculePerimetre(nouveauTriangle);
		nouveauTriangle.calculeAire(nouveauTriangle);
			
		
	}

		

	}


