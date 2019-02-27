public class Fraction
{
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);
    private int num;
    private int den;

    public Fraction(int numerateur, int denominateur)
    {
        num = numerateur;
        den = denominateur;
    }
    
    public Fraction(int numerateur)
    {
        num = numerateur;
        den = 1;
    }
    
    public int numerateur()
    {
        return num;
    }
    
    public int denominateur()
    {
        return den;
    }
    
    public double valeur()
    {
        return (double)((double)num / (double)den);
    }
    
    public Fraction getAddition(Fraction b)
    {
        this.num *= b.den;
        b.num *= this.den;
        this.den *= b.den;
        return this;
    }
    
    public Fraction fractionCanonique()
    {
        int fnum = this.num, fden = this.den;
        for (int i = 2; i < den; i++)
        {
            if (num % i == 0 && den % i == 0)
            {
                fnum = num / i;
                fden = den / i;
                i--;
            }
        }
    }
    
    
    @Override
    public int hashCode()
    {
        Fraction f = this.fractionCanonique();
        return f.getNum() ^ f.getDen();
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (o == null)
            return false;
        if (o instanceof Fraction)
            return (((Fraction)o).getNum() * b.den) == (((Fraction)o).getDen() * b.num);
        return false;
    }
    
    public String toString()
    {
        return num + "/" + den;
    }
    
    public double compare(Fraction b)
    {
        return b.valeur() - this.valeur();
    }
}
