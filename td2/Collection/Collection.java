import java.util.ArrayList;

public class Collection
{
    private ArrayList<Document> contenu = null;
    
    public Collection()
    {
        this.contenu = new ArrayList<Document>();
    }
    
    public void ajouteDocument(Document document)
    {
        if (contenu == null)
            return;
        contenu.add(document);
    }
    
    public Document rechercheTitre(String titre)
    {
        for (Document d : this.contenu)
            if ((d.getTitre()).equals(titre))
                return d;
        return null;
    }
    
    public Document rechercheAuteur(String auteur)
    {
        for (Document d : this.contenu)
            if ((d.getAuteur()).equals(auteur))
                return d;
        return null;
    }
}
