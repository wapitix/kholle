
/**
 * Décrivez votre classe Fichier ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fichier
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private String contenu;
    
    /**
     * Constructeur de la classe Fichier
     * 
     * @param       nom     nom du fichier
     * @param       contenu contenu du fichier
     */
    public Fichier (String nom, String contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }
    
    /**
     * Constructeur de la classe Fichier
     * 
     * @param       nom     nom du fichier
     */
    public Fichier (String nom) {
     this.nom = nom;
     this.contenu = null;
    }
    
    /**
     * Retourne le nom de l'objet
     * 
     * @return          nom de l'objet
     */
    
    public String getName() {
        return this.nom;
    }
    
    /**
     * Retourne le contenu de l'objet
     * 
     * @return          contenu de l'objet
     */
    public String getContenu() {
        return this.contenu;
    }
    
    /**
     * Retourne la taille du contenu de l'objet
     * 
     * @return          taille du contenu de l'objet
     */
    public int getSize() {
        return this.contenu.length();
    }
    
    /**
     * Représente l'objet par une chaine de caractère
     * 
     * @return          le fichier et ses informations sous forme de chaine de caractères
     */
    public String toString() {
        return this.nom + ": " + this.contenu;
    }
    
    /**
     * Concatène le contenu du fichier avec celui du fichier passé en paramètres
     * 
     * @param           fic     fichier à concaténer
     */
    public void concat (Fichier fic) {
        this.contenu += " " + fic.getContenu();
    }
    
    /**
     * Compare le contenu de deux fichier en testant l'égalité
     * 
     * @param       fic     fichier à comparer
     * @return      boolean
     */
    public boolean compareContenu (Fichier fic) {
        return (this.contenu == fic.getContenu());
    }
    
    /**
     * Compare le nom de deux fichier (ordre alphabétique naturel)
     * 
     * @param       fic     fichier à comparer
     * @return      boolean true si le fichier est avant false sinon
     */
    public boolean compareNom (Fichier fic) {
       int i;
       for (i = 0; i< this.nom.length() && i< fic.nom.length(); ++i)
       {
           // Placé avant
           if(this.nom.charAt(i) < fic.nom.charAt(i)) return true;
           // Placé après
           else if (this.nom.charAt(i) > fic.nom.charAt(i)) return false;
       }
       // égaux
       if (this.nom.length() == fic.nom.length()) {
           System.out.println ("Egaux");
           return true;
        }
       // égaux mais pas de meme taille:
       
       // plus petite taille donc placé avant
       else if (this.nom.length() < fic.nom.length()) {
           return true;
        }
        // plus grande taille donc placé après
        else return false;
    }
}
