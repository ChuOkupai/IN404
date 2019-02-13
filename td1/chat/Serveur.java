import java.util.ArrayList;

/**
 * Write a description of class Serveur here.
 *
 * @author (Adrien Soursou)
 * @version (02/06/2019)
 */
public class Serveur
{
    private ArrayList<Client> salon = null;

    public Serveur()
    {
        this.salon = new ArrayList<Client>();
    }

    public boolean connecter(Client client)
    {
        if (client == null)
            return false;
        salon.add(client);
        return true;
    }
    
    public void diffuser(String message)
    {
        for (Client c : salon)
            c.recevoir(message);  
    }
}
