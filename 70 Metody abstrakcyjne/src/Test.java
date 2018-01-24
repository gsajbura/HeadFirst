
public class Test {

	public static void main(String[] args) {
		
		Figura[] f = new Figura[2];
		f[0] = new Kwadrat();
		f[1] = new Ko³o();
		for(Figura a:f)
			a.action();
	}

}
