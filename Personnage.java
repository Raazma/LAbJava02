/**
 * Created by 201037629 on 2015-01-30.
 */
public abstract class Personnage {

    protected String nom;
    protected char sexe;

    public Personnage()
    {
        nom = null;
        sexe = 'H';
    }
    public Personnage(String lenom, char thesexe) {
        setNom(lenom);
        setSexe(thesexe);
    }

    public void setNom(String lenom)
    {
        boolean verif = false;
       for (int i = 0; i < lenom.length();i++)
       {
           if(!(lenom.charAt(i) >= 'a' && lenom.charAt(i) <= 'z'|| lenom.charAt(i) >= 'A' && lenom.charAt(i) <= 'Z'))
               verif = true;
       }
        if(!verif)
        nom = lenom;
    }

    public void setSexe(char thesexe)
    {
        if(thesexe == 'M' || thesexe == 'F')
        sexe = thesexe;
    }

    public String getNom() {
        return nom;
    }

    public char getSexe() {
        return sexe;
    }

}
