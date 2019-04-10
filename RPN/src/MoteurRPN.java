import java.util.Stack;

public class MoteurRPN
{
	private Stack<Double> pile = null;
	public static final double MAX_VALUE = 10000;
	public static final double MIN_VALUE = 0.0001;
	
	public MoteurRPN()
	{
		pile = new Stack<Double>();
	}
	
	public void enregistrer(double valeur)
	{
		if (valeur >= MIN_VALUE && valeur <= MAX_VALUE)
			pile.push(valeur);
	}

	public void appliquer(Operation op)
	{
		if (pile.size() < 2)
			return;
		pile.push(op.eval(pile.pop(), pile.pop()));
	}

	public Stack<Double> getStack()
	{
		return pile;
	}
}
