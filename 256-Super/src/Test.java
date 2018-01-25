
public class Test {

	public static void main(String[] args) {
		Figura k = new Kwadrat();
		Prostok¹t p = new Prostok¹t();
		k.name();
		p.name();
	}

}

class Figura{
	void name() {
		System.out.println("Jestem figur¹");
	}
}

class Prostok¹t extends Figura{
	void name() {
		super.name();
	}
	
	/**prints number*/
	public void number() {
		System.out.println("1");
	}
}

class Kwadrat extends Prostok¹t{
	void name() {
		System.out.println("Wewn¹trz kwadratu");
		Figura a = new Figura();
		a.name();
	}
}