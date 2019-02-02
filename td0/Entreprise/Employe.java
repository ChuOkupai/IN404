/**
 * La classe <code>Employe</code> représente les employés d'une entreprise.
 * 
 * @author Stéphane Lopes
 * @version jan. 2015
 */
public class Employe {
    /** Le nom de l'employé */
    private String nom;
    
    /** Le prenom de l'employé */
    private String prenom;
    
    /** L'age de l'employé */
    private int age;

    /**
     * Initialise un employé avec un prénom et un nom.
     * 
     * @param prenom le prénom de l'employé
     * @param nom    le nom de l'employé
     */
    public Employe(final String prenom, final String nom, final int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    
    /**
     * Retourne une chaîne de caractères représentant l'employé.
     * Le format utilisé est "prénom nom age".
     * 
     * @return une chaîne contenant le prénom suivi du nom de l'employé
     * et de son age
     */
    @Override
    public String toString() {
        return prenom + " " + nom + " " + age;
    }
}
