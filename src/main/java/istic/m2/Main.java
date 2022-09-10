package istic.m2;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.process(new CreditCard(true));
        client.process(new CreditCard(false));
    }
}
