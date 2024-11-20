import java.util.TreeMap;

public static void main(String[] args) {
    AffectationHashMap gestion = new AffectationHashMap();

    Employe e1 = new Employe(11, "Ali", "Ahmed", "IT", 2);
    Employe e2 = new Employe(2, "Sami", "Ben Salah", "Finance", 3);
    Departement d1 = new Departement(101, "Informatique", 50);
    Departement d2 = new Departement(102, "Finance", 30);

    gestion.ajouterEmployeDepartement(e1, d1);
    gestion.ajouterEmployeDepartement(e2, d2);

    gestion.afficherEmployesEtDepartements();


    System.out.println("Employé e1 trouvé : " + gestion.rechercherEmploye(e1));
    System.out.println("Département d1 trouvé : " + gestion.rechercherDepartement(d1));



    gestion.afficherEmployesEtDepartements();


    TreeMap<Employe, Departement> sortedMap = gestion.trierMap();
    System.out.println("Employés triés : " + sortedMap);
}
