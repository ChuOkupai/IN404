import java.util.ArrayList;
import java.util.HashMap;

public class Enclos
{
	private String name;
	private int capacite;
	private ArrayList<Animal> liste;
	
	public Enclos(String name, int capacite)
	{
		liste = new ArrayList<Animal>();
		this.name = name;
		this.capacite = capacite;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCapacite()
	{
		return capacite;
	}
	
	public void ajoute(Animal a) throws Exception
	{
		if (a == null)
			throw new Exception("Null Pointer Exception");
		else if (liste.size() >= capacite)
			throw new Exception("la capacité de l'enclos est atteinte");
		else
			liste.add(a);
	}
	
	public void nourrir()
	{
		for (Animal a : liste)
			a.manger();
	}
	
	public HashMap approvisionner()
	{
		HashMap<Aliment, Integer> m = new HashMap<Aliment, Integer>();
		for (Aliment a : Aliment.values())
			m.put(a, 0);
		for (Animal a : liste)
			m.put(a.getAliment(), m.get(a.getAliment()) + 1);
		return m;
	}
}