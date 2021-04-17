package AeroplaneSetGetScanner;
import java.util.Scanner;

public class Aeroplane {
	String model;
	double capasity;
	double maxheight;
	double weight;
	double price;
	
	
	Scanner s = new Scanner(System.in);
	
	Aeroplane() {
		
		System.out.println("Enter aeroplane Model");
		this.model = s.nextLine();
		System.out.println("Enter capasity(passenger)");
		this.capasity = s.nextDouble();
		System.out.println("Enter Max Height(ft)");
		this.maxheight = s.nextDouble();	
		System.out.println("weight(KG)");
		this.weight = s.nextDouble();
		System.out.println("Price(USD)");
		this.price = s.nextDouble();
		
		
			
	}
	
	
	Aeroplane(String m, double c, double s, double w, double f){
			this.model=m;
			this.capasity=c;
			this.maxheight=s;
			this.weight=w;
			this.price=f;
	}
}

