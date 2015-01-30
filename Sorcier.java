/**
 * Created by 201037629 on 2015-01-30.
 */
public class Sorcier extends Personnage{

  private String type;
  static int  nbsorciers;

    public Sorcier(String nom , char sexe)
    {
        super(nom,sexe);
        type = null;
        nbsorciers++;
    }
   public Sorcier(String nom , char sexe,String thetype)
    {
        super(nom,sexe);
         setType(thetype);
         nbsorciers++;
    }
   public void  setType(String thetype)
   {  if(thetype == "air"|| thetype == "feu" || thetype == "eau" || thetype == "terre" )
       type = thetype;
   }
   public String getType()
   {
       return type;
   }
    public static int getNbSorciers()
    {
        return nbsorciers;
    }
    public String toString()
    {
        if(type != null)
           return  "Mon nom est " + nom + " Et je suis un Sorcier de type " + type;
        else
            return  "Mon nom est " + nom + " Et je suis un Sorcier de type inconnu" ;
    }
}
