package games;

public class Nim{
	int tailleInitialDuTas;
	int nombreAllumetteMaxRetirer;
	Player player1;
	Player player2;
	int nombreAllumetteCourant;
	Player playerCourant;
	
	public Nim(int tailleInitialDuTas, int nombreAllumetteMaxRetirer, Player player1, Player player2){
		this.tailleInitialDuTas = tailleInitialDuTas;
		this.nombreAllumetteMaxRetirer = nombreAllumetteMaxRetirer;
		this.player1 = player1;
		this.player2 = player2;
		this.nombreAllumetteCourant = tailleInitialDuTas;
		this.playerCourant = player1;
	}
	
	public String getInitialNbMatches(){
		return "Taille initial du tas : "+this.tailleInitialDuTas;
	}
	
	public String getNbMatches(){
		return "Taille courante du tas : "+this.nombreAllumetteCourant;
	}
	
	public String situationToString(){
		return "Il reste " + this.nombreAllumetteCourant + " allumettes";
	}
	
	public int jouerUnCoup(int nombreAllumette){
		this.nombreAllumetteCourant -= nombreAllumette;
		if (this.playerCourant == this.player1){
			this.playerCourant = this.player2;
		}
		else if (this.playerCourant == this.player2){
			this.playerCourant = this.player1;
		}
		return this.nombreAllumetteCourant;
	}
	
	public boolean coupValide(int nombreAllumette){
		if (nombreAllumette <= 0){
			return false;
		}
		if (nombreAllumette >= tailleInitialDuTas){
			return false;
		}
		if (nombreAllumette >= nombreAllumetteMaxRetirer){
			return false;
		}
		return true;
	}
	
	public Player joueurCourant(){
		return this.playerCourant;
	}
	
	public boolean partieFini(){
		return this.nombreAllumetteCourant==0;
	}
	
	public Player getWinner(){
		if(!this.partieFini()){
			return null;
		}else{
			return this.playerCourant;
		}
	}
}