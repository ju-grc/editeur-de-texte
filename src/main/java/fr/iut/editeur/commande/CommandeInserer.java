package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length != 3) {
            System.err.println("Format attendu : inserer;index;message");
            return;
        }
        int index = Integer.parseInt(parameters[1]);
        String message = parameters[2];
        //this.document.inserer(index, message);
        super.executer();
    }
}
