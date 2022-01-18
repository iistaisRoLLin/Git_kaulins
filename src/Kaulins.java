import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	
	static void mestKaulinu(int reizes){
		Random rand = new Random();
		int skaitlis;
		for(int i=0; i<=reizes; i++){
			skaitlis = rand.nextInt(6)+1;
	
		System.out.println("Uzkrita : "+skaitlis);
	}
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner dati = new Scanner(System.in);
		System.out.println("Cik reizes metis kaulinu?");
		int reizes = dati.nextInt();
		int skaitlis;
		for(int i=1; i<=reizes; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita : "+skaitlis);
		}
	dati.close();
	}

}
