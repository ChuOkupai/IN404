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
    
    public boolean equals(Fraction b)
    {
        return ((num * b.den) == (den * b.num)) ? true : false;
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
