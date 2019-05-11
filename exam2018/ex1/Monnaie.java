public enum Monnaie
{
	EURO("€", 1),
	DOLLAR("$", 1.12);
	
	private final String symbole;
	private final double valeur;
	
	Monnaie(String symbole, double valeur)
	{
		this.symbole = symbole;
		this.valeur = valeur;
	}
	
	public String getSymbole()
	{
		return symbole;
	}
	
	public double getValeur()
	{
		return valeur;
	}
}