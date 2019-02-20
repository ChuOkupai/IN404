public class CD extends Document
{
    private short  nombre;

    public CD(String titre, String artiste, short nombre)
    {
        super(titre, artiste);
        this.nombre = nombre;
    }
    
    String getTitre()
    {
        return super.getTitre();
    }
    
    String getArtiste()
    {
        return super.getAuteur();
    }
}
