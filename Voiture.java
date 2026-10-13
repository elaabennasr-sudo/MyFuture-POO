
import java.util.Scanner;

public class Voiture {

    private String marque;
    private double vitesse;
    private String couleur;

    // Constructeur
    public Voiture(String marque, double vitesse, String couleur) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    // Méthode pour afficher les données
    public void afficher() {
        System.out.println("Marque : " + marque);
        System.out.println("Vitesse : " + vitesse);
        System.out.println("Couleur : " + couleur);
    }

    // Programme principal
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner la marque : ");
        String marque = scanner.nextLine();

        System.out.print("Donner la vitesse : ");
        double vitesse = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Donner la couleur : ");
        String couleur = scanner.nextLine();

        Voiture v = new Voiture(marque, vitesse, couleur);

        int choix;

        do {
            System.out.println("\nVoici le menu :");
            System.out.println("1. Afficher les données");
            System.out.println("2. Afficher la couleur");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            if (choix == 1) {
                v.afficher();
            } else if (choix == 2) {
                System.out.println("La couleur est : " + couleur);
            } else if (choix == 3) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Choix invalide");
            }

        } while (choix != 3);

        scanner.close();
    }
}
