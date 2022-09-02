import java.util.Arrays;
import java.util.Scanner;


public class WK3CodingAssignment {
	public static void main(String[] args) {
	//1)	
		int ages[] = {3,9,23,64,2,8,28,93};
		System.out.println(Arrays.toString(ages));
		
		ages = Arrays.copyOf(ages, ages.length + 1); {
		ages[ages.length - 1] = 22;
		
		System.out.println(Arrays.toString(ages));
			
		}
		double total =0;
		
		for (int i=0; i<ages.length; i++) {
			total = total + ages[i];
		}	
		double aa = total / ages.length;
		
		System.out.println("The average age :" + aa);
		
	//2)	
		String names[] = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		int total1 = 0;
		
		for(int i = 0; i < names.length; i++) {
			total1 += names[i].length();
			
		}
		System.out.println("Average name length: " + total1/names.length);
	
	
		String result = String.join(" ",names);
		
		System.out.println(result);
		
	//5) and 6
		int nameLengths[] = new int [6]; {
			
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}	
			
		System.out.println("Length of each name: " + Arrays.toString(nameLengths)+ ".");
			
		int sum = 0;
		for(int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
			
		System.out.println("The sum of all the names: " + sum);
			
	//7)
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a word: ");
		String word = scan.nextLine();
		
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		System.out.println("String: " + word.repeat(n));
		
	//8)
		
		String firstName = "Che";
		String lastName = "Versalles";
		
		String fullName = (firstName +" "+ lastName);
		
		System.out.println(fullName);
		
	//9)
		
		int age[] = {3,9,23,64,2,8,28,93};
		int s = 0;
	
		System.out.println(Arrays.toString(age));
		
		for(int i = 0; i < age.length; i++) {
			s = s + age[i];
		}	
		System.out.println("Sum of ages:" + s);
		
		if(s > 100) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}	
	//10)
			
		double weight[]	= {56.8, 32.5, 100.8, 187.6, 12.3,97.3};
		double t = 0;
		
			System.out.println(Arrays.toString(weight));
		
		for(int i = 0; i < weight.length; i++) {
			t = t + weight[i];
		}
		double avg = t / weight.length;
			
		System.out.println("The average: " + avg);
			
	//11)
		
		double drinkPrice[] = {0.99, 2.50, 3.69, 4.99, 1.97};
		double snackPrice[] = {5.65, 3.28, 2.29, 7.50, 4.80};
		double tdp = 0;
		double sp = 0;
		
			System.out.println("Drink Prices");
			System.out.println(Arrays.toString(drinkPrice));
			System.out.println("Snack Prices");
			System.out.println(Arrays.toString(snackPrice));
		
		for(int i = 0; i < drinkPrice.length; i++) {
			tdp = tdp + drinkPrice[i];
		}
		for(int i = 0; i < snackPrice.length; i++) {
			sp = sp + snackPrice[i];
		}
		double avgg = tdp / drinkPrice.length;
		double avgg2 = sp / snackPrice.length;
		
		if( avgg > avgg2){
			System.out.println("Is the average of Drink Prices greater than Snack Prices: True");	
		}
		else {
			System.out.println("Is the average of Drink Prices greater than Snack Prices: False");
			}
		}
		
		
			
		}
			
	}
	

		
	
		
		
	



	
