package banque;

public class Compte {
	private float solde = 0;

	public void deposerArgent(float pArgent) {
		solde += pArgent;
	}

	public float retirerArgent(float pArgent) {
		float res = pArgent - solde;
		solde -= pArgent;
		return res;
	}

	public float virer(int pArgent, Compte compteDestination) {
		float res = pArgent - solde;
		solde -= pArgent;
		compteDestination.deposerArgent(res);
		return res;
	}

}

