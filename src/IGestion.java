public interface IGestion<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void displayEmploye();
    void trierEmployeParId(); // Tri par ID
    void trierEmployeParNomDépartementEtGrade(); // Tri par nom de département et grade
}
