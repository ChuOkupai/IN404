public enum Monnaie
{
	EURO("€"),
	DOLLAR("$");
	
	private String type;

	Monnaie(String type)
	{
		this.type = type;
	}

	public String toString()
	{
		return type;
	}
}
