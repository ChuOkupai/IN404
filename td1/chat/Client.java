
/**
 * Write a description of class Client here.
 *
 * @author (Adrien Soursou)
 * @version (02/06/2019)
 */
public class Client
{
    private String nom;

    /**
     * Constructor for objects of class Client
     */
    public Client(String nom)
    {
        if (nom == null)
            return;
        this.nom = nom;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        return y;
    }
}
