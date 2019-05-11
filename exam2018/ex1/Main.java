public class Main
{
	public static void main(String args[])
	{
		Montant m, n;
		m = new Montant(3653.87, Monnaie.EURO);
		n = m.convert(Monnaie.DOLLAR);
		System.out.println(m.toString());
		System.out.println(n.toString());
		System.out.println(n.convert(Monnaie.EURO).toString());
		System.out.println("equality test: " + m.equals(n));
		System.out.println("compare test: " + m.compare(new Montant(200, Monnaie.EURO)));
	}
}