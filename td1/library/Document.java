import java.util.ArrayList;

/**
 * Write a description of class Document here.
 *
 * @author (Adrien Soursou)
 * @version (02/06/2019)
 */
public class Document
{
    private String auteur;
    private short annee;
    private String titre;
    private ArrayList<Document> references = null;

    public Document(String auteur, short annee, String titre)
    {
        this.auteur = auteur;
        this.annee = annee;
        this.titre = titre;
        this.references = new ArrayList<Document>();
    }

    public void ajouteReference(Document document)
    {
        if (references == null)
            return;
        references.add(document);
    }
    
    public String getTitre(Document document)
    {
        return document.titre;
    }
    
    public String toString()
    {
        String s = titre + ", " + auteur + ", (" + annee + "), ref:";
        for (Document d : references)
            s += " " + d.titre + ", " + d.auteur;
        return s + "\n";
    }
}
