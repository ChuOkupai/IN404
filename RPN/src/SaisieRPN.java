import java.util.Scanner;
import java.lang.IllegalStateException;

public class SaisieRPN
{
	private MoteurRPN moteur = null;
	
	public SaisieRPN()
	{
		moteur = new MoteurRPN();
	}
	
	public void run()
	{
		Scanner scanner = new Scanner(System.in);
		String buffer;
		boolean printStack;
		while (true)
		{
			printStack = true;
			System.out.print("Enter a double or an operand: ");
			try
			{
				printStack = true;
				if (scanner.hasNextDouble() == true)
					moteur.enregistrer(scanner.nextDouble());
				else
				{
					buffer = scanner.next();
					if (buffer.equals("exit"))
					{
						while (moteur.getStack().isEmpty() == false)
						moteur.getStack().pop();
						scanner.close();
						return;
					}
					else if (moteur.getStack().size() < 2)
					{
						System.out.println("Forbidden value");
						printStack = false;
					}
					else if (buffer.equals("+"))
						moteur.appliquer(Operation.PLUS);
					else if (buffer.equals("-"))
						moteur.appliquer(Operation.MOINS);
					else if (buffer.equals("*"))
						moteur.appliquer(Operation.MULT);
					else if (buffer.equals("/"))
						moteur.appliquer(Operation.DIV);
					else
					{
						System.out.println("Forbidden value");
						printStack = false;
					}
				}
			}
			catch (IllegalStateException e)
			{
				e.printStackTrace();
			}
			if (printStack == true)
				System.out.println(moteur.getStack().toString());
		}
	}
}
