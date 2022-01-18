import java.util.Random;

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
	mestKaulinu(3);
	}

}
