package banque;

public class LivretA extends Compte {

	public float retirerArgent(float pArgent) {
		if(solde - pArgent >= 0) {
			solde -= pArgent;
			return pArgent;
		}
		return 0;	

	}
}
