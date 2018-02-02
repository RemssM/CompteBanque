package banque;

public class Compte {
	private float solde = 0;

	public void deposerArgent(float pArgent) {
		solde += pArgent;
	}

	public float retirerArgent(float pArgent) {

		solde -= pArgent;
		return pArgent;
	}

	public float virer(int pArgent, Compte compteDestination) {
		float res = pArgent - solde;
		solde -= pArgent;
		compteDestination.deposerArgent(res);
		return res;
	}


	@Override public String toString() {
		return  "Solde : "+solde ; 
	}

	}

