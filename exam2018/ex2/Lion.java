public class Lion extends Animal
{
	public Lion(String name)
	{
		super(name, new Ration(Aliment.viande, 5));
	}
	
	@Override
	public void agir()
	{
		System.out.println(this.getName() + " le lion dort");
	}
}