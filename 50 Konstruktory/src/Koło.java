import java.util.Scanner;

public class Ko�o {

	private double promie�;
	
	public Ko�o() {
		Scanner in = new Scanner(System.in);
		double r;
		do {
			System.out.println("Podaj promie�");
			r = in.nextDouble();
			if (r<=0)
				System.out.println("Promie� musi by� dodatni");
		}while (r<=0);
		setPromie�(r);	
		in.close();

	}
	
	public void setPromie�(double r) {
		promie� = r;
	}
	
	public double getPromie�() {
		return promie�;
	}
	
	public void obliczObw�d() {
		System.out.println("Obw�d ko�a o promieniu " + promie� + " wynosi: " + Math.PI*2*promie�);
	}
}
