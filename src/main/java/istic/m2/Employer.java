package istic.m2;

/**
 * La classe qui représente les salariés de l'entreprise
 */
public class Employer implements OurEntity {
    private String nom;
    private String poste;

    public Employer(String nom, String poste) {
        this.nom = nom;
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "nom='" + nom + '\'' +
                ", poste='" + poste + '\'' +
                '}';
    }
}
