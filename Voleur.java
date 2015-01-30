/**
 * Created by 201037629 on 2015-01-30.
 */
public class Voleur extends Personnage {
   private int nbLarcin;
    static int nbvoleurs;
    public Voleur(String nom,char sexe)
    {
        super(nom,sexe);
        nbLarcin = 0;
        nbvoleurs++;
    }
    public  Voleur(String nom,char sexe,int nbLarcins)
    {
        super(nom,sexe);
        nbLarcin = nbLarcins;
        nbvoleurs++;

    }
   public  static int getNbVoleurs()
   {
       return nbvoleurs;
   }
    public void  incNbLarcins()
    {
        nbLarcin++;
    }
    public int getNbLarcins()
    {
        return nbLarcin;
    }
    public String toString()
    {
        return  "Mon nom est " + nom + " Et je suis un Voleur  Ayant commis " + Integer.toString(nbLarcin) + " Larcin(s)";
    }

}
