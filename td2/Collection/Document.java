public abstract class Document
{
    private String titre;
    private String auteur;
    
    public Document(String titre, String auteur)
    {
        this.titre = titre;
        this.auteur = auteur;
    }
    
    String getTitre()
    {
        return titre;
    }
    
    String getAuteur()
    {
        return auteur;
    }
}