
/**
 * Write a description of class Client here.
 *
 * @author (Adrien Soursou)
 * @version (02/06/2019)
 */
public class Client
{
    private String nom;
    private Serveur serveur;

    /**
     * Constructor for objects of class Client
     */
    public Client(String nom)
    {
        if (nom == null)
            return;
        this.nom = nom;
        this.serveur = null;
    }

    public boolean seConnecter(Serveur serveur)
    {
       if (serveur == null)
            return false;
       if (serveur.connecter(this)) {
           this.serveur = serveur;
           return true;
       }
       return false;
    }
    
    public void envoyer(String message)
    {
       if (serveur != null)
            serveur.diffuser(message);
    }
    
    public void recevoir(String message)
    {
        System.out.print(nom + " a recu " + message + "\n");
    }
}
