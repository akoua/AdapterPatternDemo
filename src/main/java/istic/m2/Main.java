package istic.m2;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.setUtilisateur(new MagasinService());
        client.process(new Magasins("Decathlon"));
        client.setUtilisateur(new EmployerAdapter());
        client.process(new Employer("Yao", "PDG"));
    }
}
