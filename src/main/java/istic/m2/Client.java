package istic.m2;

public class Client {

    private IUtilisateur utilisateur;

    public void process(OurEntity mag) {
        System.out.println(utilisateur.getUserInfo(mag));
    }

    public void setUtilisateur(IUtilisateur iUtilisateur) {
        this.utilisateur = iUtilisateur;
    }
}
