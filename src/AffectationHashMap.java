import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations = new HashMap<>();


    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }


    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }


    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }


    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }


    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }


    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }


    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }


    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }


    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
