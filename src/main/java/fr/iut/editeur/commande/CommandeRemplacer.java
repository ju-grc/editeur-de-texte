package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters){
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String chaine;

        try {
            chaine = parameters[3];
        } catch (ArrayIndexOutOfBoundsException e){
            chaine = " ";
        }

        this.document.remplacer(debut, fin, chaine);
        super.executer();
    }
}
