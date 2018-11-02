package games;
import java.util.Scanner;

public class Main{

	public static void main (String [] args){
		System.out.println("Saisir le nom du premier joueur :\n");
		Scanner scanner = new Scanner(System.in);
		String Name1 = scanner.next();
		System.out.println("Saisir le nom du deuxieme joueur :\n");
		String Name2 = scanner.next();
		System.out.println("Saisir le nombre du tas d'allumettes :\n");
		int n = scanner.nextInt();
		System.out.println("Saisir le nombre de coup maximum :\n");
		int k = scanner.nextInt();
		Player player1 = new Player(Name1);
		Player player2 = new Player(Name2);
		Nim nim1 = new Nim(n,k,player1,player2);
		System.out.println("Vous avez saisi les joueurs : "+nim1.player1.getName()+" et "+nim1.player2.getName());
		while(!nim1.partieFini()){
			int nbEnlever = scanner.nextInt();
			if(nim1.coupValide(nbEnlever)==true){
				nim1.jouerUnCoup(nbEnlever);
			}
			//System.out.println("Le joueur : "+nim1.gagnant()+" a gagne");
			scanner.close();
		}
	}
}