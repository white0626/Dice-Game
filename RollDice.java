import java.util.Random;

public class RollDice {
	public static void main(String[] args) {
		Random rand= new Random();
		int dice1 = rand.nextInt(6)+1;
		int dice2 = rand.nextInt(6)+1;
		int total = dice1+dice2;
		System.out.println("Die1 :"+dice1);
		System.out.println("Die2 :"+dice2);
		System.out.println("Total value :"+total);
		
	}

}
