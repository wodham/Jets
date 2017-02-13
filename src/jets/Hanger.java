package jets;

import java.util.Scanner;

public class Hanger {
	Jet[] jets = new Jet[10];
	int newJetLocation = 5;
	Scanner kb = new Scanner(System.in);

	public void set() {
		jets[0] = new Jet("a1", 1000.00, 100.00, 100000.00);
		jets[1] = new Jet("a2", 2000.00, 200.00, 200000.00);
		jets[2] = new Jet("a3", 3000.00, 300.00, 300000.00);
		jets[3] = new Jet("a4", 4000.00, 400.00, 400000.00);
		jets[4] = new Jet("a5", 5000.00, 500.00, 500000.00);
	}

	public void menu(){
		int choice = 0;
		do {
			System.out.println("Would you like to: ");
			System.out.println("[1] List fleet");
			System.out.println("[2] View fastest jet");
			System.out.println("[3] View jet with longest range");
			System.out.println("[4] Add a jet to fleet");
			System.out.println("[5] Qiut");
			choice = kb.nextInt();

			switch (choice) {
			case 1:
				for (int i = 0; i < jets.length; i++) {

					if (jets[i] != null) {
						System.out.println(jets[i] + "\n");
					}
				}
				break;
			case 2:
				int locationOfTheFastest = 0;
				for (int i = 1; i < jets.length; i++) {
					if (jets[i] != null) {
					
						if (jets[i].getSpeed() > jets[locationOfTheFastest].getSpeed()) {
							locationOfTheFastest = i;
						}
					}
				}
				System.out.println(jets[locationOfTheFastest] + "\n");
				break;
			case 3:
				int locationOfTheFarthest = 0;
				for (int i = 1; i < jets.length; i++) {
					if (jets[i] != null) {
					
						if (jets[i].getRange() > jets[locationOfTheFarthest].getRange()) {
							locationOfTheFarthest = i;
						}
					}
				}
				System.out.println(jets[locationOfTheFarthest] + "\n");
				break;
			case 4:
				System.out.println("Please enter the model: ");
				String model = kb.next();
				System.out.println("Please enter the speed in MPH: ");
				double speed = kb.nextDouble();
				System.out.println("Please enter the range: ");
				double range = kb.nextDouble();
				System.out.println("Please enter the price: ");
				double price = kb.nextDouble();
				
				jets[newJetLocation] = new Jet(model, speed, range, price);
				
				newJetLocation++;

				break;
			case 5:
				
				break;
			
		}
	}while(choice!=5);
}

}
