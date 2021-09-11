package freecodescamp_tutorial;
import java.util.Scanner;

public class NestedStatement {
	public static void main(String[] args) {
		System.out.println("Input your age");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int age = Integer.parseInt(s);
		
		if (age >= 18){
			System.out.print("Input your favorite food: ");
			String food = sc.nextLine();
			
			if (food.equals("sushi")) {
				System.out.println("Mine too!");
			} else {
				System.out.println("Nice!");
			}
		} else if (age >=14 && age <=17){
			System.out.print("Input your favorite game: ");
			String game = sc.nextLine();

			if (game.equals("Mabinogi")) {
				System.out.println("Mine too!");
			} else {
				System.out.println("Nice!");
			}
		} else {
			System.out.println("You are a child!");
			
		}
		
	}

}

