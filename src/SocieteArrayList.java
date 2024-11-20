import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes = new ArrayList<>();

    // Ajouter un employé
    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
        System.out.println("Employé ajouté : " + e);
    }

    // Rechercher un employé par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                System.out.println("Employé trouvé : " + e);
                return true;
            }
        }
        System.out.println("Aucun employé trouvé avec le nom : " + nom);
        return false;
    }

    // Rechercher un employé par instance
    @Override
    public boolean rechercherEmploye(Employe e) {
        boolean found = employes.contains(e);
        System.out.println(found ? "Employé trouvé : " + e : "Employé non trouvé.");
        return found;
    }

    // Supprimer un employé
    @Override
    public void supprimerEmploye(Employe e) {
        if (employes.remove(e)) {
            System.out.println("Employé supprimé : " + e);
        } else {
            System.out.println("Employé non trouvé pour la suppression.");
        }
    }

    // Afficher tous les employés
    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés :");
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // Tri par ID (implémente Comparable dans Employe)
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
        System.out.println("Employés triés par ID.");
    }

    // Tri par nom de département et grade
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, Comparator.comparing(Employe::getNomDepartement).thenComparingInt(Employe::getGrade));
        System.out.println("Employés triés par nom de département et grade.");
    }
}
