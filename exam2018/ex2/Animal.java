import java.util.ArrayList;

public abstract class Animal
{
	private String name;
	private Ration ration;
	private ArrayList<Animal> liste;
	
	public Animal(String name, Ration ration)
	{
		liste = new ArrayList<Animal>();
		this.name = name;
		this.ration = ration;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Aliment getAliment()
	{
		return ration.getAliment();
	}
	
	public void manger()
	{
		System.out.println(name + " mange " + ration.getQuantite() + " unités de " + this.getAliment());
	}
	
	public abstract void agir();
	
	public void incompatibleAvec(Animal a)
	{
		if (a == null || liste.contains(a))
			return;
		liste.add(a);
	}
}