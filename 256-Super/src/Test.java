
public class Test {

	public static void main(String[] args) {
		Figura k = new Kwadrat();
		Prostok�t p = new Prostok�t();
		k.name();
		p.name();
	}

}

class Figura{
	void name() {
		System.out.println("Jestem figur�");
	}
}

class Prostok�t extends Figura{
	void name() {
		super.name();
	}
	
	/**prints number*/
	public void number() {
		System.out.println("1");
	}
}

class Kwadrat extends Prostok�t{
	void name() {
		System.out.println("Wewn�trz kwadratu");
		Figura a = new Figura();
		a.name();
	}
}