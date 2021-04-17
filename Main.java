package AeroplaneSetGetScanner;

public class Main {

	public static void main(String[] args) {
		
		Aeroplane a = new Aeroplane();
		System.out.println("Boeing" + a.model + "  " + a.capasity + "passenger  " + a.maxheight + "ft  " + a.weight + "KG  USD" + a.price + "  " );
		
		Aeroplane b = new Aeroplane("747", 366 , 35105 ,183500, 260);
		System.out.println("Boeing" + b.model + "  " + b.capasity + "passenger  " + b.maxheight + "ft  "+ b.weight + "KG  USD" + b.price + "  ");
		
		

}
}