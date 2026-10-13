public class MainAPP {

public static void main(String[] args) {

    // 1. Création des clients
    client c1 = new client("07123456", "Ben Salah", "Sonia", "98765432");
    client c2 = new client("09876543", "Kacem", "Ahmed", "50112233");

    // 2. Création des comptes bancaires
    CompteBancaire compte1 =
            new CompteBancaire("CB-1001", 500.0, c1);

    CompteBancaire compte2 =
            new CompteBancaire("CB-1002", 1500.0, c2);

    // 3. Affichage initial
    System.out.println("=== Situation initiale ===");
    compte1.afficherDetails();
    compte2.afficherDetails();

    // 4. Dépôt et retraits
    System.out.println("\\n=== Dépôts et retraits ===");
    compte1.deposer(200.0);
    compte1.retirer(1000.0);
    compte1.retirer(300.0);

    // 5. Virement de compte2 vers compte1
    System.out.println("\\n=== Virement ===");
    compte2.virement(compte1, 500.0);

    // 6. Affichage final
    System.out.println("\\n=== Situation finale ===");
    compte1.afficherDetails();
    compte2.afficherDetails();

    // 7. Nombre total de comptes
    System.out.println("Nombre total de comptes : "
            + CompteBancaire.getNombreComptes());
}

}