package question3;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		
			PrepaidCard p=new TravelCard(8754,50000,20000,5);
			Rewardable r=new TravelCard();

			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println(p);
			System.out.println("Amount  in dollars= "+ p.availableBalance/60);	

		System.out.println("Enter the swipe amount in dollars =");

		double amount=sc.nextDouble();
		p.swipeCard(amount);
		
		System.out.println("Earn Reward Points= "+r.rewards(amount * 60));

	}

}
