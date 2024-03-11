import java.util.Scanner;

public class Developpeur {
    private String nom, prenom;
    private int experience;

    // Default constructor
    public Developpeur() {
        this.nom = "";
        this.prenom = "";
        this.experience = 0;
    }

    // Copy constructor
    public Developpeur(Developpeur other) {
        this.nom = other.nom;
        this.prenom = other.prenom;
        this.experience = other.experience + 5;
    }

    // Parameterized constructor
    public Developpeur(String nom, String prenom, int experience) {
        this.nom = nom;
        this.prenom = prenom;
        this.experience = experience;
    }

    // Getter methods
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getExperience() { return experience; }

    // Setter methods
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setExperience(int experience) { this.experience = experience; }

   // Method to determine the grade
public String determinerGrade() {
    if (experience <= 1) {
        return "Jeune diplômé";
    } else if (experience <= 4) {
        return "Junior";
    } else if (experience <= 9) {
        return "Confirmé";
    } else {
        return "Senior ou Expert";
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le nom du développeur : ");
        String nom = scanner.nextLine();

        System.out.println("Saisir le prénom du développeur : ");
        String prenom = scanner.nextLine();

        System.out.println("Saisir l'expérience du développeur en années : ");
        int experience = scanner.nextInt();

        // Using the parameterized constructor
        Developpeur developpeur1 = new Developpeur(nom, prenom, experience);

        // Using the copy constructor
        Developpeur developpeur2 = new Developpeur(developpeur1);

        System.out.println("\nInformations du développeur 1 :\nNom : " + developpeur1.getNom() +
                           "\nPrénom : " + developpeur1.getPrenom() +
                           "\nExpérience : " + developpeur1.getExperience() + " années" +
                           "\nGrade : " + developpeur1.determinerGrade());

        System.out.println("\nInformations du développeur 2 (copie du développeur 1) :\nNom : " + developpeur2.getNom() +
                           "\nPrénom : " + developpeur2.getPrenom() +
                           "\nExpérience : " + developpeur2.getExperience() + " années" +
                           "\nGrade : " + developpeur2.determinerGrade());

        scanner.close();
    }
}
