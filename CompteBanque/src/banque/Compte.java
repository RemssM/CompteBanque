package banque;

public class Compte {
	private float solde = 0;
	
	public static void main(String[] args) {
		Compte A = new Compte();
		Compte B = new Compte();
		
		A.deposerArgent(100000);
		
		A.deposerArgent(5);
		A.toString();
		A.virer(5000, B);
		B.retirerArgent(2);
		
		System.out.println(A);
		System.out.println(B);
	}

	public void deposerArgent(float pArgent) {
		solde += pArgent;
	}

	public float retirerArgent(float pArgent) {

		solde -= pArgent;
		return pArgent;
	}

	public float virer(int pArgent, Compte compteDestination) {
		solde -= pArgent;
		compteDestination.deposerArgent(pArgent);
		return pArgent;
	}


	@Override public String toString() {
		return  "Solde : "+solde ; 
	}

}

