public class Main
{
	public static void main(String args[])
	{
		Enclos e = new Enclos("Fauves", 2);
		try
		{
			e.ajoute(new Lion("Gaspard"));
			e.ajoute(new Lion("Balthazar"));
			e.approvisionner();
			e.nourrir();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}