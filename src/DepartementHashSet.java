import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println("Département ajouté : " + d);
        } else {
            System.out.println("Département déjà existant.");
        }
    }


    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nom)) {
                System.out.println("Département trouvé : " + d);
                return true;
            }
        }
        System.out.println("Aucun département trouvé avec le nom : " + nom);
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        boolean found = departements.contains(d);
        System.out.println(found ? "Département trouvé : " + d : "Département non trouvé.");
        return found;
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Département supprimé : " + d);
        } else {
            System.out.println("Département non trouvé pour la suppression.");
        }
    }

    @Override
    public void displayDepartement() {
        System.out.println("Liste des départements :");
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedDepartements = new TreeSet<>(Comparator.comparingInt(Departement::getId));
        sortedDepartements.addAll(departements);
        return sortedDepartements;
    }

}

