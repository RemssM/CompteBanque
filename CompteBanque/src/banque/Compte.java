package banque;

public class Compte {
	protected float solde = 0;
	
	public static void main(String[] args) {
		LivretA A = new LivretA();
		LivretA B = new LivretA();
		
		A.deposerArgent(5000);
		
		A.deposerArgent(5);
		A.toString();
		A.virer(5005, B);
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

	public float virer(float pArgent, Compte compteDestination) {
		solde -= pArgent;
		compteDestination.deposerArgent(pArgent);
		return pArgent;
	}


	@Override public String toString() {
		return  "Solde : "+solde ; 
	}

}

