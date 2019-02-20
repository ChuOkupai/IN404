public class DVD extends Document
{
    private short annee;
    
    public DVD(String titre, String realisateur, short annee)
    {
        // super pour les débiles (appel du parent)
        super(titre, realisateur);
        this.annee = annee;
    }
    
    String getTitre()
    {
        return super.getTitre();
    }
    
    String getRealisateur()
    {
        return super.getAuteur();
    }
}
