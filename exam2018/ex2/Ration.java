public class Ration
{
	private final Aliment type;
	private final int quantite;
	
	public Ration(Aliment type, int quantite)
	{
		this.type = type;
		this.quantite = quantite;
	}
	
	public Aliment getAliment()
	{
		return type;
	}
	
	public int getQuantite()
	{
		return quantite;
	}
}