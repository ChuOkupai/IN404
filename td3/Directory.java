import java.util.ArrayList;

public class Directory extends File
{
	private ArrayList<File> content = null;
	
	public Directory(String name)
	{
		super(name);
		this.content = new ArrayList<File>();
	}
	
	public void addFile(File f)
	{
		if (f == null)
			return;
		content.add(f);
	}
	
	@Override
	public int getSize()
	{
		int i, size;
		
		for (i = 0, size = 0; i < content.size(); i++)
			size += content.get(i).getSize();
		return size;
	}
}