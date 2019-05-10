public final class Montant
{
	private final double somme;
	private final Monnaie type;

	public Montant(double somme, Monnaie type)
	{
		this.somme = somme;
		this.type = type;
	}

	public Montant(double somme)
	{
		this(somme, Monnaie.EURO);
	}

	public String doubleValue()
	{
		return "" + somme;
	}

	public String monnaie()
	{
		return type.toString();
	}

	public String toString()
	{
		return doubleValue() + monnaie();
	}
}
