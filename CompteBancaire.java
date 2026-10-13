public class CompteBancaire {

private String numeroCompte;
private double solde;
private client titulaire;
private static int nombreComptes = 0;

public CompteBancaire(String numeroCompte, double solde, client titulaire) {
    this.numeroCompte = numeroCompte;
    this.solde = solde;
    this.titulaire = titulaire;
    nombreComptes++;
}

public String getNumeroCompte() {
    return numeroCompte;
}

public double getSolde() {
    return solde;
}

public client getTitulaire() {
    return titulaire;
}

public static int getNombreComptes() {
    return nombreComptes;
}

public void setTitulaire(client titulaire) {
    this.titulaire = titulaire;
}

public void deposer(double montant) {
    if (montant > 0) {
        solde = solde + montant;
    } else {
        System.out.println("Erreur : montant invalide.");
    }
}

public void retirer(double montant) {
    if (montant > 0 && montant <= solde) {
        solde = solde - montant;
    } else {
        System.out.println("Erreur : retrait impossible.");
    }
}

public void virement(CompteBancaire destination, double montant) {
    if (destination != null && montant > 0 && montant <= solde) {
        solde = solde - montant;
        destination.deposer(montant);
    } else {
        System.out.println("Virement impossible.");
    }
}

public void afficherDetails() {
    System.out.println("Numéro du compte : " + numeroCompte
            + " | Titulaire : " + titulaire.getNom()
            + " " + titulaire.getPrenom()
            + " | Solde : " + solde + " TND");
}

}










