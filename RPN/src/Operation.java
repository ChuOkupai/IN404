public enum Operation
{
	PLUS('+')
	{
		@Override
		public double eval(double a, double b)
		{
			return a + b;
		}
	},
	MOINS('-')
	{
		@Override
		public double eval(double a, double b)
		{
			return b - a;
		}
	},
	MULT('*')
	{
		@Override
		public double eval(double a, double b)
		{
			return a * b;
		}
	},
	DIV('/')
	{
		@Override
		public double eval(double a, double b)
		{
			return b / a;
		}
	};

	private char symbole;

	Operation(char symbole)
	{
		this.symbole = symbole;
	}

	public abstract double eval(double a, double b);
}
