enum CalculatriceRPN
{
	ENVIRONNEMENT;
	
	public void run(String[] args)
	{
		SaisieRPN saisie = new SaisieRPN();
		
		saisie.run();
	}
	
	public static void main(String[] args)
	{
		ENVIRONNEMENT.run(args);
	}
}