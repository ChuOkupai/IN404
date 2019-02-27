public class Main
{
	public static void main(String []args)
	{
		Directory root = new Directory("/");
		root.addFile(new Regular("foo", 3));
		root.addFile(new Regular("bar", 3));
		System.out.println(root.getName());
		System.out.println("	" + root.getSize());
	}
}