 
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
   public static void main (String args[]) {
       // 1) Voir class "Fichier"
       // 2)
       // a) avec arguments
       System.out.println ("Question 2:");
       Fichier fichier1 = new Fichier ("fic1","Hello World");
       // b) avec juste le nom
       Fichier fichier2 = new Fichier ("fic2");
       
       // 3)
       System.out.println ("Question 3:");
       System.out.println (fichier1 .getName());
       System.out.println (fichier1 .getContenu());
       System.out.println (fichier1 .getSize());
       
       System.out.println (fichier2 .getName());
       System.out.println (fichier2 .getContenu());
       System.out.println (fichier2 .getSize());
       
       // 4)
       System.out.println ("Question 4:");
       System.out.println (fichier1 .toString());
       System.out.println (fichier2 .toString());
       
       // 5)
       System.out.println ("Question 5:");  
       Fichier fichier3 = new Fichier ("fic3", "I'm a file");
       fichier1 .concat (fichier3);
       System.out.println (fichier1 .getContenu());
       
       // 6)
       System.out.println ("Question 6:");
       if (fichier1 .compareContenu(fichier3)) System.out.println("True");
       else System.out.println("false");
       
       if (fichier3 .compareContenu(fichier3)) System.out.println("True");
       else System.out.println("false");
       
       // 7)
       System.out.println ("Question 7:");
       Fichier test1 = new Fichier ("bonjour");
       Fichier test2 = new Fichier ("aurevoir");
       Fichier test3 = new Fichier ("bonsoir");
       
       if () System.out.println ("Question 7:")
    }
}
