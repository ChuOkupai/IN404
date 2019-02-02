import java.util.ArrayList;
import java.util.List;

/**
 * La classe <code>Entreprise</code> représente une entreprise.
 * La seule fonctionnalité de cette classe est d'embaucher des employés.
 * 
 * @author Stéphane Lopes
 * @version jan. 2015
 */
public class Entreprise {
    /** Nom de l'entreprise */
    private String nom;

    /** Les employes de l'entreprise */
    private List<Employe> equipe = null;

    /**
     * Initialise l'entreprise avec son nom.
     * 
     * @param nom le nom de l'entreprise
     */
    public Entreprise(final String nom) {
        this.nom = nom;
        equipe = new ArrayList<Employe>();
    }
    
    /**
     * L'entreprise embauche un nouvel employé.
     * 
     * @param  emp l'employé à embaucher
     */
    public void embauche(Employe emp) {
        if (emp != null)
            equipe.add(emp);
    }
    
    /**
     * Retourne une chaîne de caractères représentant le nom de l'entreprise
     * et la liste de ses employés.
     * Le format utilisé est "nomEntreprise employe1 employe2... employeN".
     * 
     * @return retourne une chaîne de caractères contenant le nom de l'entreprise
     * et la liste de ses employés
     */
    @Override
    public String toString() {
        String liste = this.nom;
        for (Employe e : equipe) {
            liste += " " + e.toString();
        }
        return liste;
    }
}
