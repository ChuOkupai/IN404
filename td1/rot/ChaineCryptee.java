
/**
 * ROT algortihm in Java
 *
 * @author (Adrien Soursou)
 * @version (02/06/2019)
 */
public class ChaineCryptee
{
    private String chaine;
    private int decalage;
    
    /**
     * Constructeur de la classe à partir d'une chaine cryptée
     */
    public static ChaineCryptee deCryptee(String chaine, int decalage)
    {
        ChaineCryptee c = new ChaineCryptee(chaine, 26 - (decalage % 26));
        if (chaine != null)
            c.chaine = c.crypte();
        c.decalage = decalage;
        return c;
    }
    
    /**
     * Constructeur de la classe à partir d'une chane en clair
     */
    public static ChaineCryptee deEnClair(String chaine, int decalage)
    {
        return new ChaineCryptee(chaine, decalage);
    }
    
    /**
     * Constructeur de la classe
     */
    private ChaineCryptee(String chaine, int decalage)
    {
        this.chaine = chaine;
        this.decalage = decalage;
    }

    /**
     * Déchiffre la chaine.
     *
     * @return la chaine en clair
     */
    public String decrypte()
    {
        return this.chaine;
    }
    
    /**
     * Décale un caractère majuscule.
     * Les lettres en majuscule ('A' - 'Z') sont décalées de <code>decalage</code>
     * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
     *
     * @param c le caractère à décaler
     * @param decalage le décalage à appliquer
     * @return le caractère décalé
     */
    private static char decaleCaractere(char c, int decalage) {
        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    }
    
    /**
     * Chiffre la chaine (uniquement les caractères en majuscule).
     * Si la chaine est vide, return une chaine vide.
     *
     * @return la chaine chiffrée
     */
    public String crypte()
    {
        if (this.chaine == null)
            return null;
        StringBuilder chaine2 = new StringBuilder(this.chaine);
        for (int i = 0; i < chaine2.length(); i++)
            chaine2.setCharAt(i, decaleCaractere(chaine2.charAt(i), this.decalage));
        return chaine2.toString();
    }
}
