import java.util.Scanner;

public class Coordonnees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Entrer les coordonnées");
        System.out.println("2. Quitter le programme");
        System.out.print("Votre choix : ");

        int choix = sc.nextInt();
        sc.nextLine();

        if (choix == 1) {
            System.out.print("Entrez votre nom : ");
            String nom = sc.nextLine();

            System.out.print("Entrez votre prénom : ");
            String prenom = sc.nextLine();

            System.out.print("Entrez votre CIN : ");
            String cin = sc.nextLine();

            System.out.print("Entrez votre ville : ");
            String ville = sc.nextLine();

            System.out.println("\n--- VOS COORDONNÉES ---");
            System.out.println("Nom : " + nom);
            System.out.println("Prénom : " + prenom);
            System.out.println("CIN : " + cin);
            System.out.println("Ville : " + ville);
        }
        else if (choix == 2) {
            System.out.println("Fin du programme.");
        }
        else {
            System.out.println("Choix invalide !");
        }

        sc.close();
    }
}