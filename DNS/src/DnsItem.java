class DnsItem
{
	private AdresseIP adresse;
	private NomMachine nom;

	public DnsItem(AdresseIP adresse, NomMachine nom)
	{
		this.adresse = adresse;
		this.nom = nom;
	}

	public AdresseIP getAdresse()
	{
		return adresse;
	}

	public NomMachine getNom()
	{
		return nom;
	}

	@Override
	public String toString()
	{
		return adresse.toString() + " (" + nom.toString() + ")"; 
	}
}
