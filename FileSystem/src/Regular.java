public class Regular extends File
{
	private int size;
	
	public Regular(String name, int size)
	{
		super(name);
		this.size = size;
	}
	
	@Override
	public int getSize()
	{
		return size;
	}
}