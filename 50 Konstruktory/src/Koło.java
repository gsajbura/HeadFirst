import java.util.Scanner;

public class Ko³o {

	private double promieñ;
	
	public Ko³o() {
		Scanner in = new Scanner(System.in);
		double r;
		do {
			System.out.println("Podaj promieñ");
			r = in.nextDouble();
			if (r<=0)
				System.out.println("Promieñ musi byæ dodatni");
		}while (r<=0);
		setPromieñ(r);	
		in.close();

	}
	
	public void setPromieñ(double r) {
		promieñ = r;
	}
	
	public double getPromieñ() {
		return promieñ;
	}
	
	public void obliczObwód() {
		System.out.println("Obwód ko³a o promieniu " + promieñ + " wynosi: " + Math.PI*2*promieñ);
	}
}
