package istic.m2;

/**
 * La classe qui représente les clients
 */
public class Magasins implements OurEntity {
    private String nom;

    public Magasins(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Magasins {" +
                "nom='" + nom + '\'' +
                '}';
    }
}
