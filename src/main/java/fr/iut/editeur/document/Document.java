package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace le texte qui se trouve entre les index debut et fin par un nouveau message
     * @param debut index du debut du remplacement
     * @param fin index de fin du remplacement
     * @param remplacement message
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Remplace le texte qui se trouve entre les index debut et fin par des majuscules
     * @param debut index du debut du remplacement
     * @param fin index de fin du remplacement
     */
    public void majuscules(int debut, int fin) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin +1);
        String change = texte.substring(debut, fin + 1).toUpperCase();
        texte = partieGauche + change + partieDroite;

    }

    /**
     * Effacer la partie du texte qui se trouve entre les index debut et fin
     * @param debut index du debut de l'effacement
     * @param fin index de la fin de l'effacement
     */
    public void effacer(int debut, int fin) {
        remplacer(debut,fin,"");
    }

    /**
     * Effacer le texte en integralité
     */
    public void clear(){
        texte = "";
    }
    /*
    public void inserer(int debut, String message) {
        String partieGauche = texte.substring(0, debut + 2);
        String partieDroite = texte.substring(debut + 1);

        texte = partieGauche + message + partieDroite;
    }
     */
}
