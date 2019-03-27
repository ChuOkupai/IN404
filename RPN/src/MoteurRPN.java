import java.util.Stack;

public class MoteurRPN
{
	private Stack<Double> pile = null;
	
	public MoteurRPN()
	{
		pile = new Stack();
	}
	
	public void enregistrer(double valeur)
	{
		pile.push(new Double(valeur));
	}

	public void appliquer(Operation op)
	{
		if (pile.size() < 2)
			return;
		Double d1, d2;
		
		d1 = pile.peek();
		pile.pop();
		d2 = pile.peek();
		pile.pop();
		pile.push(new Double (op.eval(d1, d2)));

	}

	public Stack<Double> getStack()
	{
		return pile;
	}
}
