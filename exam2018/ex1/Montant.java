public class Montant
{
	private final double somme;
	private final Monnaie type;
	
	public Montant(double somme, Monnaie type)
	{
		this.somme = somme;
		this.type = (type == null) ? Monnaie.EURO : type;
	}
	
	public Montant(double somme)
	{
		this(somme, Monnaie.EURO);
	}
	
	public double doubleValue()
	{
		return somme;
	}
	
	public String monnaie()
	{
		return type.getSymbole();
	}
	
	public String toString()
	{
		return doubleValue() + monnaie();
	}
	
	public Montant convert(Monnaie type)
	{
		if (type == null)
			return this;
		return new Montant(somme * type.getValeur() / this.type.getValeur(), type);
	}
	
	public boolean equals(Montant m)
	{
		if (m == null)
			return false;
		Montant m1 = convert(Monnaie.EURO), m2 = convert(Monnaie.EURO);
		return (m1.doubleValue() == m2.doubleValue()) ? true : false;
	}
	
	public double compare(Montant m)
	{
		if (m == null)
			return this.somme;
		Montant m1 = convert(Monnaie.EURO), m2 = m.convert(Monnaie.EURO);
		return m1.doubleValue() - m2.doubleValue();
	}
}