import java.util.Scanner;

abstract class DesertItem {

	abstract public int getCost();
}

class Candy extends DesertItem {
	int dollar = 60;
	int count = 0;

	public int addCandies(int candies) {
		count += candies;
		return candies;
	}

	public int getCost(int candies) {
		return dollar * candies / 10;
	}

	@Override
	public int getCost() {
		return 0;
	}

}

class Cookie extends DesertItem {
	int euro = 60;
	int count = 0;

	public int addCookies(int cookie) {
		count += cookie;
		return cookie;
	}

	public int getCost(int cookies) {
		return euro * cookies / 10;
	}

	@Override
	public int getCost() {
		return 0;
	}
}

class IceCream extends DesertItem {
	int rupees = 100;
	int count = 0;

	public int addIceCreams(int iceCream) {
		count += iceCream;
		return iceCream;
	}

	public int getCost(int iceCreams) {
		return rupees * iceCreams;
	}

	@Override
	public int getCost() {
		return 0;
	}
}

public class Assignment2Q7 {
	public static void main(String[] args) {
		Assignment2Q7 assignObj = new Assignment2Q7();
		assignObj.selectRoles();
	}
	
	private String role;

	private void selectRoles() {
		System.out.println("Enter the Role customer or owner?");
		Scanner sc = new Scanner(System.in);
		role = sc.nextLine();
		roles(role);
	}

	private void roles(String role) {
		if (role.matches("owner")) {
			addItems();
			Scanner sc = new Scanner(System.in);
			int item = sc.nextInt();
			addItemsOperation(item);
		} else {
			placeOrder();
			Scanner sc = new Scanner(System.in);
			int item = sc.nextInt();
			placeOrderOperation(item);
		}

	}

	private void addItems() {
		System.out.println("Select Item to Add : \n1. Candies\n2. Cookies\n3. Ice Creams");
	}

	private void addItemsOperation(int choice) {
		Scanner sc = new Scanner(System.in);
		switch (choice) {
		case 1:
			Candy candy = new Candy();
			System.out.println("How many candies you wanna add?");
			int candies = sc.nextInt();
			sc.close();
			candy.addCandies(candies);
			System.out.println(candy.count + " candies added");
			break;
		case 2:
			Cookie cookie = new Cookie();
			System.out.println("How many cookies you wanna add?");
			int cookies = sc.nextInt();
			sc.close();
			cookie.addCookies(cookies);
			break;
		case 3:
			IceCream iceCream = new IceCream();
			System.out.println("How many iceCreams you wanna add?");
			int iceCreams = sc.nextInt();
			sc.close();
			iceCream.addIceCreams(iceCreams);
		default:
			System.out.println("You have entered an invalid choise. Please enter the correct item");
			roles(role);
		}
		
	}

	private void placeOrder() {
		System.out.println("Select Item to Place Order: \n1. Candies\n2. Cookies\n3. Ice Creams");
	}

	private void placeOrderOperation(int choice) {
		Scanner sc = new Scanner(System.in);
		switch (choice) {
		case 1:
			Candy candy = new Candy();
			System.out.println("How many candies you wanna buy?");
			int candies = sc.nextInt();
			sc.close();
			System.out.println("Total price of " + candies + " candies is " + candy.getCost(candies) + " rupees");
			break;
		case 2:
			Cookie cookie = new Cookie();
			System.out.println("How many cookies you wanna buy?");
			int cookies = sc.nextInt();
			sc.close();
			System.out.println("Total price of " + cookies + " cookies is " + cookie.getCost(cookies) + " rupees");
			break;
		case 3:
			IceCream iceCream = new IceCream();
			System.out.println("How many iceCreams you wanna buy?");
			int iceCreams = sc.nextInt();
			sc.close();
			System.out.println(
					"Total price of " + iceCreams + " iceCreams is " + iceCream.getCost(iceCreams) + " rupees");
			break;
		default:
			System.out.println("You have entered an invalid choise. Please enter the correct item");
			roles(role);
		}
	}
}
