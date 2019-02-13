import java.util.ArrayList;

/**
 * Write a description of class Bibliotheque here.
 *
 * @author (Adrien Soursou)
 * @version (02/06/2019)
 */
public class Bibliotheque
{
    private ArrayList<Document> contenu = null;

    public Bibliotheque()
    {
        this.contenu = new ArrayList<Document>();
    }

    public void ajouteDocument(Document document)
    {
        if (contenu == null)
            return;
        contenu.add(document);
    }
    
    public Document recherche(String titre)
    {
        for (Document d : this.contenu)
            if ((d.getTitre(d)).equals(titre))
                return d;
        return null;
    }
}
